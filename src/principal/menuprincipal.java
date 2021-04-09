package principal;
import util.SimpleList;
import model.temperatura;
import javax.swing.JOptionPane;

public class menuprincipal {
 public static void main(String[] args) {
	 
	 temperatura add = new temperatura();
	 SimpleList simplelist = new SimpleList();
	 
	 int op = 0;
	 do {
	  op = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Temperatura no Final da Lista \n "
	  		+ "2 - Adicionar Temperatura no Inicio da Lista \n 3 - Adcionar Temperatura no Meio da Lista \n 4 - Remover Temperatura no Inicio da lista"
	  		+ "\n 5 - Remover Temperatura no meio da Lista \n 6 - Remover Temperatura no Final da Lista \n 7 - Visualizar Lista \n 8 - Encerrar"));
	  switch (op) {
	   case 1: {
		add.setTemperatura(Integer.parseInt(JOptionPane.showInputDialog(null, "Temperatura: ")));
		simplelist.addLast(add.getTemperatura());
		break;
	   }  
	   case 2: {
		 add.setTemperatura(Integer.parseInt(JOptionPane.showInputDialog(null, "Temperatura: ")));
		 simplelist.addFirst(add.getTemperatura());
		 break;
	    }
	   case 3: {
		  add.setTemperatura(Integer.parseInt(JOptionPane.showInputDialog(null, "Temperatura: ")));
		  simplelist.addMidle(add.getTemperatura());
		  break;
	    }
	   case 4: {
		  if(simplelist.checkEmpty()) {
		    JOptionPane.showMessageDialog(null, "Não é possível Remover Temperatura. Lista Vazia!");  
		   }
		  else {
		    JOptionPane.showMessageDialog(null,"Temperatura Removida: \n" + simplelist.removeFirst());
		   }
		  break;
	     }
	    case 5: {
	        if(simplelist.checkEmpty()) {
			  JOptionPane.showMessageDialog(null, "Não é possível Remover Temperatura. Lista Vazia!");  
			}
			else {
			  JOptionPane.showMessageDialog(null,"Temperatura Removida: \n" + simplelist.removeMidle());
			 }
		    break;
		  }
	    case 6: {
	      if(simplelist.checkEmpty()) {
	 	   JOptionPane.showMessageDialog(null, "Não é possível Remover Temperatura. Lista Vazia!");  
	 	  }
	 	  else {
	 	   JOptionPane.showMessageDialog(null,"Temperatura Removida: \n" + simplelist.removeLast());
	 	   } 
	     break; 	
	    }
	    case 7: {
 		 System.out.println(simplelist.toString());
		 break;
	   }
	   case 8: {
		  System.out.println("Fim do programa!");
		  break;
	   } 
	   default: {
		System.out.println("Opção invalida!");
	   }
	  }
	  
	 }while(op != 8); 
	 
	 }
 
}
