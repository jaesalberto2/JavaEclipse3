package hotel2;

import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Ingresa i = new Ingresa();
		Imprime print = new Imprime();
		Hotel h1 = i.ingresa();
		JOptionPane.showMessageDialog(null, print.imprime(h1),"Informacion del hotel"
				+ "",JOptionPane.INFORMATION_MESSAGE);
	
		


	}

}
