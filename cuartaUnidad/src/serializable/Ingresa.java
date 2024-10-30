package serializable;

import javax.swing.JOptionPane;

public class Ingresa {
	Fichero f = new Fichero();
	public void ingresaVehiculo() {
		String marca,modelo,matricula;
		marca = JOptionPane.showInputDialog(null,"Ingresa Marca"
				+ "","Deportivo",JOptionPane.INFORMATION_MESSAGE);
		modelo = JOptionPane.showInputDialog(null,"Ingresa Modelo"
				+ "","Deportivo",JOptionPane.INFORMATION_MESSAGE);
		matricula = JOptionPane.showInputDialog(null,"Ingresa Matricula"
				+ "","Deportivo",JOptionPane.INFORMATION_MESSAGE);
		//Instanciar a la clase Deportivo
		Vehiculo v = new Vehiculo(marca,modelo,matricula);
		f.ingresaVehiculo(v);
		
		
		
	}

}
