package classTablas;

import javax.swing.JOptionPane;

public class Menu {
	
	ClassTablas t = new ClassTablas();
	public void menu() {
		int opc,num=0;
		do {
		opc = Integer.parseInt(JOptionPane.showInputDialog(null,"1.- Inicializar numero\n"
				+ "2.-Tablas\n3.-Salir","Menu",JOptionPane.INFORMATION_MESSAGE));
		switch (opc) {
		case 1:num=(int)(Math.random()*10+1);
			
			break;
		case 2:JOptionPane.showMessageDialog(null, t.tablas(num),"Resultado"
				+ "",JOptionPane.INFORMATION_MESSAGE);
			
			break;
		case 3: System.exit(0);
			
			

		default:JOptionPane.showMessageDialog(null, "Opcion incorrecta","Error",JOptionPane.ERROR_MESSAGE);
			
		}
		}while(opc!=3);
	}

}
