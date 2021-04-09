package util;

public class SimpleList {
	
	private Node head = null;
	private int size = 0;	
	

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	//---- Adicionar no Começo
	
	public void addFirst(int temp) {
		Node node = new Node();
	    node.setInfo(temp);
		node.setNext(head);
		head = node;
		size++;
	}
	
	//---- Remover no Inicio
	
	public Object removeFirst() {	
		if(head == null) {
			return null;
		}
		int info = head.getInfo();
		head = head.getNext(); 
		size--;
		return info;
	}
	
	//--- Adicionar no Final
	
	public void addLast(int temp) {
		
		Node node = new Node();
		node.setInfo(temp);
		if(head == null) {
			node.setNext(null);
			head = node;
		}
		else {
		  Node local = head;
		  while(local.getNext() != null) {
			 local = local.getNext();
		  }
		  local.setNext(node);
		  node.setNext(null);
		}
		size++;
	}
	
	//--- Remover no Final
	public Object removeLast() {
		Node local = head;
		while(local.getNext() != null) {
	      Node aux = local;
	      local = local.getNext();
	      if(local.getNext() == null) {
	    	 aux.setNext(null);
	    	 size--;
	    	 return local.getInfo();  	 
	      }
		}
		return null;
	}
	
	//------- Insirir no meio
	public void addMidle(int temp) {
	   if(size == 0) {
		  addFirst(temp);
	   }
	   else if(size == 1) {
		   addLast(temp);
	   }
	   else {
		    Node local = head;
		    int midle = (int) size/2;
			for(int i = 0; i < midle-1; i++) {
				local = local.getNext();
			}
			Node node = new Node();
			node.setInfo(temp);
			node.setNext(local.getNext()); 
			local.setNext(node);
			size++;
	   }
	   	
	}
	
	//---- Remover no Meio
	public Object removeMidle() {
	   if(size == 0) {
		 return removeFirst();
	   }
	   else if(size == 1) { 
		 return removeLast(); 
	   }
	   else {
		  Node local = head;
		  int midle = (int) size/2;
		  for(int i = 0; i < midle-1; i++) {
		     local = local.getNext();
		  } 
		  int info = local.getNext().getInfo();
		  local.setNext(local.getNext().getNext());
		  size--;
		  return info;
	   }
	}
	
	//---- Verifica Lista Vazia
	public boolean checkEmpty() {
		if(size != 0) {
		 return false;
		}
		else {
		 return true;
		}
	}

	//---- Visualização da Lista
		@Override
	public String toString() {
	  StringBuffer view = new StringBuffer();
      Node local = head;
	  while(local != null) {
		 view.append(local.getInfo() + "° \n");
		 local = local.getNext();
	   }
		return view.toString();
	  }
	
  
}
