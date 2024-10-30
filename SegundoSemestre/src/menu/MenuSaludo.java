package menu;

import javax.swing.JOptionPane;

public class MenuSaludo {
	public void menu () {
		//realizar la creacion de los objetos o instancias
		SaludoMx s1 = new SaludoMx();
		SaludoUsa s2 = new SaludoUsa();
		SaludoIt s3 = new SaludoIt();
		SaludoGe s4 = new SaludoGe();
		SaludoFra s5 = new SaludoFra();
		int opc;
		do {
			opc =Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Saludo Mexicano"
					+ "\n2.-Saludo USA \n3.-Saludo Italiano"
					+ "\n4.-Saludo Aleman"
					+ "\n5.-SaludoFrances"
					+ "\n6.-Salir","Menu Saludos",JOptionPane.INFORMATION_MESSAGE));
		switch(opc) {	
		case 1: s1.saludo();
			break;
			case 2: s2.saludo();
			break;
			case 3: s3.saludo();
			break;
			case 4: s4.saludo();
			break;
			case 5: s5.saludo();
			break;
			case 6: System.exit(0);
			default: JOptionPane.showMessageDialog(null, "Opcion Invalida","Error",JOptionPane.ERROR_MESSAGE);
		}
			
		}while(opc!=6);//fin del switch
	}

}
