package hospital;

import javax.swing.JOptionPane;

public class Prueba {

	public static void main(String[] args) {
		IngresaDatos ingresa = new IngresaDatos();
		Imprime i=new Imprime();
		Paciente paciente1 = ingresa.ingresaDatos();
		
		JOptionPane.showMessageDialog(null, i.imprime(paciente1),""
			+ "Informacion del Paciente",JOptionPane.INFORMATION_MESSAGE);

	}

}
