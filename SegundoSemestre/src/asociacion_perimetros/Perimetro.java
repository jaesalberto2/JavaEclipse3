package asociacion_perimetros;

import javax.swing.JOptionPane;

public class Perimetro {

	public void circulo() {
		double radio;
		radio = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el radio: ",""
				+ "Perimetro del circulo",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showConfirmDialog(null, "El valor del perimetro es "
				+ ""+(Math.PI*2*radio),"Perimetro del circulo",JOptionPane.INFORMATION_MESSAGE);
		
	}
	public void rectangulo() {
		double base,altura;
		base = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la base: ",""
				+ "Perimetro del rectangulo",JOptionPane.INFORMATION_MESSAGE));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la altura: ",""
				+ "Perimetro del rectangulo",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showConfirmDialog(null, "El valor del perimetro es "
				+ ""+(2*(base+altura)),"Perimetro del rectangulo",JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	public void triangulo() {
		
		double lado1,lado2,lado3;
		lado1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la base: ",""
				+ "Perimetro del triangulo",JOptionPane.INFORMATION_MESSAGE));
		lado2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la altura: ",""
				+ "Perimetro del triangulo",JOptionPane.INFORMATION_MESSAGE));
		lado3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la altura: ",""
				+ "Perimetro del triangulo",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showConfirmDialog(null, "El valor del perimetro es "
				+ ""+(lado1+lado2+lado3),"Perimetro del triangulo",JOptionPane.INFORMATION_MESSAGE);
		
	
	}
	public void cuadrado() {
		double lado;
		lado = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el lado: ",""
				+ "Perimetro del cuadrado",JOptionPane.INFORMATION_MESSAGE));
		
		JOptionPane.showConfirmDialog(null, "El valor del perimetro es "
				+ ""+(lado*4),"Perimetro del cuadrado",JOptionPane.INFORMATION_MESSAGE);
		
		
	
	}
}
