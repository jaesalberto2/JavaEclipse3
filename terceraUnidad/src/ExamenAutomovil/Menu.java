package ExamenAutomovil;

import java.awt.TextArea;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Menu {
	
	public void menu() {
		int opc;
		String nom;
		Ingresa i = new Ingresa() ;
		Imprime im = new Imprime() ;
		String cadena="";
		
Automovil a1= new Automovil(null,null,null,null,0,0,null,null,null);
im.imprime(a1);
		do {
		opc =Integer.parseInt(JOptionPane.showInputDialog(null,"1.- Ingresar datos\n2.-imprimir datos\nmodificar datos\n3.-Salir","Menu",JOptionPane.INFORMATION_MESSAGE));
		
		switch (opc) {
		case 1:
			a1=i.ingresa();
			
			break;
		case 2:
			JTextArea a=new JTextArea(im.imprime(a1));
			cadena = im.imprime(a1);
			JOptionPane.showMessageDialog(null, a,"Datos de Automovil",JOptionPane.INFORMATION_MESSAGE);
			
			break;
		case 3:
			
			nom = JOptionPane.showInputDialog(null,"ingresa nombre","Piloto",JOptionPane.INFORMATION_MESSAGE);
			a1.piloto.setName(nom);
			JTextArea a2 = new JTextArea("datos sin modificar"+cadena+"\ndatos modificados"+im.imprime(a1));
			JOptionPane.showMessageDialog(null, a2,"Datos de Automovil",JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 4:System.exit(0);
			
		

		default:JOptionPane.showMessageDialog(null, "ERRROR","Error",JOptionPane.ERROR_MESSAGE);
			break;
		}
		
		}while(opc!=3);
		}
}
