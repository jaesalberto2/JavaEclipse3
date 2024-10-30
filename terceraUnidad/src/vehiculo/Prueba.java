package vehiculo;

import javax.swing.JOptionPane;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ingresa i = new Ingresa();
		Vehiculo v = i.IngresaDatos();
		Imprime im = new Imprime();
		JOptionPane.showMessageDialog(null, im.ImprimeDatos(v),""
				+ "Datos del vehiculo",JOptionPane.INFORMATION_MESSAGE);
		

		

	}

}
