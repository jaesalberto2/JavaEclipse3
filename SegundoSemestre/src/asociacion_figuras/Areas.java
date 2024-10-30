package asociacion_figuras;

import javax.swing.JOptionPane;

public class Areas {
	public void circulo() {
		double radio;
		radio = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el radio: ",""
				+ "Perimetro del circulo",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showConfirmDialog(null, "El valor del perimetro es "
				+ ""+(Math.PI*Math.pow(radio, 2)),"Perimetro del circulo",JOptionPane.INFORMATION_MESSAGE);
		
	}
	public void rectangulo() {
		double base,altura;
		base = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la base: ",""
				+ "Perimetro del rectangulo",JOptionPane.INFORMATION_MESSAGE));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la altura: ",""
				+ "Perimetro del rectangulo",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showConfirmDialog(null, "El valor del perimetro es "
				+ ""+(base*altura),"Perimetro del rectangulo",JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	public void triangulo() {
		
		double base,altura;
		base = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la base: ",""
				+ "Perimetro del triangulo",JOptionPane.INFORMATION_MESSAGE));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la altura: ",""
				+ "Perimetro del triangulo",JOptionPane.INFORMATION_MESSAGE));
		
		JOptionPane.showConfirmDialog(null, "El valor del perimetro es "
				+ ""+(base*altura),"Perimetro del triangulo",JOptionPane.INFORMATION_MESSAGE);
		
	
	}
	public void cuadrado() {
		double lado;
		lado = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el lado: ",""
				+ "Perimetro del cuadrado",JOptionPane.INFORMATION_MESSAGE));
		
		JOptionPane.showConfirmDialog(null, "El valor del perimetro es "
				+ ""+(lado*lado),"Perimetro del cuadrado",JOptionPane.INFORMATION_MESSAGE);
		
		
	
	}

}
