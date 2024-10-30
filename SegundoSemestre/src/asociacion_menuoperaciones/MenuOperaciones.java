package asociacion_menuoperaciones;

import javax.swing.JOptionPane;

import asociacion_operaciones.Operaciones;

public class MenuOperaciones {
		public void Menu() {
		int opc;
		int n1,n2;
		Operaciones O = new Operaciones();
		
		do{
			opc=Integer.parseInt(JOptionPane.showInputDialog(null,""
					+ "1.-Suma\n2.-Rectangulo\n3.-Triangulo"
					+ "\n4.-Cuadrado\n5.-Salir","Perimetros",JOptionPane.INFORMATION_MESSAGE));
			n1=Integer.parseInt(JOptionPane.showInputDialog(null,""
					+ "Ingresa valor","Numero 1",JOptionPane.INFORMATION_MESSAGE));
			n2=Integer.parseInt(JOptionPane.showInputDialog(null,""
					+ "Ingresa valor","Numero 2",JOptionPane.INFORMATION_MESSAGE));
			
			switch (opc) {
			case 1:
			
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
				
				

			default:
				break;
			}
		}while(opc!=6);
		
}
}
