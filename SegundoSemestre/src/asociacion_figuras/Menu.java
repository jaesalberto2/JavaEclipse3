package asociacion_figuras;

import javax.swing.JOptionPane;

import asociacion_perimetros.Perimetro;

public class Menu {

	public static void main(String[] args) {
		Perimetro P1 =new Perimetro();
		Areas A1 = new Areas();
		int opc1;
		do {
			opc1=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Perimetro\n2.-Areas\n3.-Salir",JOptionPane.INFORMATION_MESSAGE));
			switch (opc1) {
			case 1:{
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
				
				break;
			case 2:{
				int opc;
				do {
					opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Circulo\n2.-Rectangulo\n3.-Triangulo"
							+ "\n4.-Cuadrado\n5.-Salir","Perimetros",JOptionPane.INFORMATION_MESSAGE));
					switch (opc) {
					case 1:A1.circulo();
						
						break;
					case 2:A1.rectangulo();
						
						break;
					case 3:A1.triangulo();
			
						break;
					case 4:A1.cuadrado();
			
						break;
					case 5:System.exit(0);
			
						break;

					default:JOptionPane.showConfirmDialog(null, "Opcion invalida","Error",JOptionPane.ERROR_MESSAGE);
						break;
					}
				}while(opc!=5);
			}
				
			
			case 3:System.exit(0);
	
				break;

			default:JOptionPane.showConfirmDialog(null, "Opcion invalida","Error",JOptionPane.ERROR_MESSAGE);
				break;
			}
		}while(opc1!=3);
	}

}
