package asociacion_perimetros;

import javax.swing.JOptionPane;

public class PruebaPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perimetro P1 =new Perimetro();
		int opc;
		do {
			opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Circulo\n2.-Rectangulo\n3.-Triangulo"
					+ "\n4.-Cuadrado\n5.-Salir","Perimetros",JOptionPane.INFORMATION_MESSAGE));
			switch (opc) {
			case 1:P1.circulo();
				
				break;
			case 2:P1.rectangulo();
				
				break;
			case 3:P1.triangulo();
	
				break;
			case 4:P1.cuadrado();
	
				break;
			case 5:System.exit(0);
	
				break;

			default:JOptionPane.showConfirmDialog(null, "Opcion invalida","Error",JOptionPane.ERROR_MESSAGE);
				break;
			}
		}while(opc!=5);

	}

}
