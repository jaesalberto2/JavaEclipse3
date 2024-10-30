package arduino;

import javax.swing.JOptionPane;

public class PruebaArduino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, memoria, lineasdeIOdigitales,
		lineasdeEntradasAnalogicas,microcontrolador,modelo;
		double precio;
		
		
		nombre = JOptionPane.showInputDialog(null,"Nombre","Ingresa nombre",
				JOptionPane.INFORMATION_MESSAGE);
		
		memoria = JOptionPane.showInputDialog(null,"Memoria","Ingresa Memoria",
				JOptionPane.INFORMATION_MESSAGE);
		
		lineasdeIOdigitales = JOptionPane.showInputDialog(null,"lineas de IO digitales"
				+ "","Ingresa lineas de IO digitales",
				JOptionPane.INFORMATION_MESSAGE);
		
		lineasdeEntradasAnalogicas = JOptionPane.showInputDialog(null,""
				+ "Lineas de Entradas Analogicas","Ingresa Lineas de Entradas Analogicas",
				JOptionPane.INFORMATION_MESSAGE);
		
		microcontrolador = JOptionPane.showInputDialog(null,"Microcontrolador"
				+ "","Ingresa microcontrolador",
				JOptionPane.INFORMATION_MESSAGE);
		
		modelo= JOptionPane.showInputDialog(null,"Modelo","Ingresa Modelo",
				JOptionPane.INFORMATION_MESSAGE);
		
		precio = Double.parseDouble( JOptionPane.showInputDialog(null,"Precio"
				+ "","Ingresa Precio",
				JOptionPane.INFORMATION_MESSAGE));
		
		Arduino a1 = new Arduino(nombre, memoria, lineasdeIOdigitales,
				lineasdeEntradasAnalogicas,microcontrolador,modelo,precio);
		
		JOptionPane.showMessageDialog(null, a1.toString(),"Arduino a1",JOptionPane.INFORMATION_MESSAGE);

	}

}
