package herencia_vehiculo;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ingresa {
	
	String matricula,marca,modelo,color;
	double precio;
	int cilindros;
	
	int npuertas;
	String transmicion;
	
	int carga;
	double volumen;
	
	String salida="Marca\tModelo\tMatricula\tColor\tCilindros\tPrecio\n";
	String salidaf="Marca\tModelo\tMatricula\tColor\tvolumen\tPrecio\tCarga\n";
	Imprime i = new Imprime();
	JTextArea datos = new JTextArea();
	
	public void ingresaDeportivo() {
		matricula= JOptionPane.showInputDialog(null,""
				+ "Ingresa Matricula","Deportivo",JOptionPane.INFORMATION_MESSAGE);
		marca = JOptionPane.showInputDialog(null,""
				+ "Ingresa Marca","Deportivo",JOptionPane.INFORMATION_MESSAGE);
		
		modelo= JOptionPane.showInputDialog(null,""
				+ "Ingresa Modelo","Deportivo",JOptionPane.INFORMATION_MESSAGE);
		
		color= JOptionPane.showInputDialog(null,""
				+ "Ingresa color","Deportivo",JOptionPane.INFORMATION_MESSAGE);
		precio= Double.parseDouble( JOptionPane.showInputDialog(null,""
				+ "Ingresa Precio","Deportivo",JOptionPane.INFORMATION_MESSAGE));
		cilindros =Integer.parseInt( JOptionPane.showInputDialog(null,""
				+ "Ingresa Cilindros","Deportivo",JOptionPane.INFORMATION_MESSAGE));
		Deportivo d = new Deportivo(matricula,marca,modelo,color,precio,cilindros);
		
		//mandar llamar al metodo imprimeDeportivo
		salida += i.imprimeDeportivo(d);
		datos.setText(salida);
		JOptionPane.showMessageDialog(null, datos,"Informacion de vehiculos deportivos"
				,JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void ingresaTurismo() {
		matricula= JOptionPane.showInputDialog(null,""
				+ "Ingresa Matricula","Turismo",JOptionPane.INFORMATION_MESSAGE);
		marca = JOptionPane.showInputDialog(null,""
				+ "Ingresa Marca","Turismo",JOptionPane.INFORMATION_MESSAGE);
		
		modelo= JOptionPane.showInputDialog(null,""
				+ "Ingresa Modelo","Turismo",JOptionPane.INFORMATION_MESSAGE);
		
		color= JOptionPane.showInputDialog(null,""
				+ "Ingresa color","Turismo",JOptionPane.INFORMATION_MESSAGE);
		precio= Double.parseDouble( JOptionPane.showInputDialog(null,""
				+ "Ingresa Precio","Turismo",JOptionPane.INFORMATION_MESSAGE));
		npuertas =Integer.parseInt( JOptionPane.showInputDialog(null,""
				+ "Ingresa numero de puertas","Turismo",JOptionPane.INFORMATION_MESSAGE));
		transmicion =  JOptionPane.showInputDialog(null,""
				+ "Ingresa transmision","Turismo",JOptionPane.INFORMATION_MESSAGE);
		
		Deportivo d = new Deportivo(matricula,marca,modelo,color,precio,cilindros);
		
		//mandar llamar al metodo imprimeDeportivo
		salida += i.imprimeDeportivo(d);
		datos.setText(salida);
		JOptionPane.showMessageDialog(null, datos,"Informacion de vehiculos deportivos"
				,JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void ingresaFurgoneta() {
		matricula= JOptionPane.showInputDialog(null,""
				+ "Ingresa Matricula","Furgoneta",JOptionPane.INFORMATION_MESSAGE);
		marca = JOptionPane.showInputDialog(null,""
				+ "Ingresa Marca","Furgoneta",JOptionPane.INFORMATION_MESSAGE);
		
		modelo= JOptionPane.showInputDialog(null,""
				+ "Ingresa Modelo","Furgoneta",JOptionPane.INFORMATION_MESSAGE);
		
		color= JOptionPane.showInputDialog(null,""
				+ "Ingresa color","Furgoneta",JOptionPane.INFORMATION_MESSAGE);
		precio= Double.parseDouble( JOptionPane.showInputDialog(null,""
				+ "Ingresa Precio","Furgoneta",JOptionPane.INFORMATION_MESSAGE));
		carga =Integer.parseInt( JOptionPane.showInputDialog(null,""
				+ "Ingresa carga","Furgoneta",JOptionPane.INFORMATION_MESSAGE));
		volumen = Double.parseDouble( JOptionPane.showInputDialog(null,""
				+ "Ingresa Volumen","Furgoneta",JOptionPane.INFORMATION_MESSAGE));
		
		Furgoneta f = new Furgoneta(matricula,marca,modelo,color,precio,carga,volumen);
		
		//mandar llamar al metodo imprimeDeportivo
		
		salidaf += i.imprimeFurgoneta(f);
		datos.setText(salidaf);
		JOptionPane.showMessageDialog(null, datos,"Informacion de vehiculos deportivos"
				,JOptionPane.INFORMATION_MESSAGE);
	}

}
