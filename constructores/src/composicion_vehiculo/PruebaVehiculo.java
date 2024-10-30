package composicion_vehiculo;

import javax.swing.JOptionPane;

public class PruebaVehiculo {

	public static void main(String[] args) {
		// Instanciar a la clase Vehiculo
		Vehiculo coche1= new Vehiculo("Seat", "Leon"
				+ "", "Rojo", "ADF-123-A", 120000.00);
		Vehiculo coche2= new Vehiculo("Ferrari", "Enzo"
				+ "", "Rojo", "AMK-321-T", 555000.00);
		Vehiculo coche3= new Vehiculo("Renault", "Clio"
				+ "", "Blanco", "AHG-987-Z", 85000);
		
		JOptionPane.showMessageDialog(null, "Marca : " +coche1.marca
				+"\nModelo : "+coche1.modelo+"\nColor : "+coche1.color+""
				+ "\nMatricula : "+coche1.matricula+"\nPrecio : "+coche1.precio);
		
		JOptionPane.showMessageDialog(null, "Marca : " +coche2.marca
				+"\nModelo : "+coche2.modelo+"\nColor : "+coche2.color+""
				+ "\nMatricula : "+coche2.matricula+"\nPrecio : "+coche2.precio);
		
		JOptionPane.showMessageDialog(null, "Marca : " +coche3.marca
				+"\nModelo : "+coche3.modelo+"\nColor : "+coche3.color+""
				+ "\nMatricula : "+coche3.matricula+"\nPrecio : "+coche3.precio);
	}

}
