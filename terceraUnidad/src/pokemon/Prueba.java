package pokemon;

import javax.swing.JOptionPane;

public class Prueba {

	public static void main(String[] args) {

		Ingresa i = new Ingresa();
		Imprime print = new Imprime();
		
		Pokemon p1 = i.ingresa();
		
		JOptionPane.showMessageDialog(null,print.imprime(p1),""
				+ "Informacion del Pokemon",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
