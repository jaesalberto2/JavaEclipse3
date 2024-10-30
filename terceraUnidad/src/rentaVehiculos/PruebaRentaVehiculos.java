package rentaVehiculos;

import javax.swing.JOptionPane;

public class PruebaRentaVehiculos {

	public static void main(String[] args) {
		String nombre, modelo,marca,placa,tipo_vehiculo,tipo_combustible,
		color;
		int cilindros;
		double costo_renta;
		
		nombre = JOptionPane.showInputDialog(null,"Nombre","Ingresa nombre",
				JOptionPane.INFORMATION_MESSAGE);
		
		marca = JOptionPane.showInputDialog(null,"Marca","Ingresa Marca",
				JOptionPane.INFORMATION_MESSAGE);
		
		
		modelo = JOptionPane.showInputDialog(null,"Modelo","Ingresa Modelo",
				JOptionPane.INFORMATION_MESSAGE);
		
		
		placa = JOptionPane.showInputDialog(null,"placa","Ingresa placa",
				JOptionPane.INFORMATION_MESSAGE);
		
		tipo_vehiculo = JOptionPane.showInputDialog(null,"tipo de vehiculo"
				+ "","Ingresa tipo de vehiculo",
				JOptionPane.INFORMATION_MESSAGE);
		
		tipo_combustible = JOptionPane.showInputDialog(null,"tipo de combustible"
				+ "","Ingresa tipo de combustible",
				JOptionPane.INFORMATION_MESSAGE);
		
		color = JOptionPane.showInputDialog(null,"color","Ingresa color",
				JOptionPane.INFORMATION_MESSAGE);
		
		cilindros = Integer.parseInt(JOptionPane.showInputDialog(null,"cilindros"
				+ "","ingresa numeros de cilindros",JOptionPane.INFORMATION_MESSAGE));
		

		costo_renta = Double.parseDouble(JOptionPane.showInputDialog(null,"Costo de renta","Ingresa el costo de renta",JOptionPane.INFORMATION_MESSAGE));
		
		
		Vehiculo v1 = new Vehiculo(nombre, modelo,marca,placa,tipo_vehiculo,tipo_combustible,
				color,cilindros,costo_renta);
		
		JOptionPane.showMessageDialog(null,v1.toString(),"Datos del Vehiculo",JOptionPane.INFORMATION_MESSAGE);
	}

}
