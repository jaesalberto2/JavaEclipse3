package herencia_seleccion;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ingresa {
	Imprime i = new Imprime(); 
	JTextArea datos = new JTextArea();
	//SeleccionFutbol
	int id,edad;
	String nombre,apellido;
	double peso;
	
	//futbolista
	String posicion;
	int numero;
	String salidaF="posicion" + "\t" + "numero" + "\t" + "id" + "\t" + "edad" + "\t"
			+ "" + "nombre" + "\t" + "apellido" + "\t" + "peso"
			+ "\n";
	
	//masajista
	String especialidad;
	int experiencia;
	String salidaM = "especialidad" + "\t" + "experiencia" + "\t" + "id" + "\t"
			+ "" + "edad" + "\t" + "nombre" + "\t" + "apellido" + "\t"
			+ "peso" + "\n";
	
	//entrenador
	String idFederacion;
	String salidaE = "idFederacion" + "\t" + "id" + "\t" + "edad" + "\t"
			+ "" + "nombre" + "\t" + "apellido" + "\t" + "peso" + "\n";
;
	
	public void ingresaSeleccion() {
		
		id=Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "Ingresa ID","Seleccion",JOptionPane.INFORMATION_MESSAGE));
		edad=Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "Ingresa Edad","Seleccion",JOptionPane.INFORMATION_MESSAGE));

		nombre=JOptionPane.showInputDialog(null,""
				+ "Ingresa Nombre","Seleccion",JOptionPane.INFORMATION_MESSAGE);
		apellido=JOptionPane.showInputDialog(null,""
				+ "Ingresa Apellido","Seleccion",JOptionPane.INFORMATION_MESSAGE);
		
		peso = Double.parseDouble(JOptionPane.showInputDialog(null,""
				+ "Ingresa Peso","Seleccion",JOptionPane.INFORMATION_MESSAGE));
		
	}
	
	public void IngresaFutbolista() {
		posicion=JOptionPane.showInputDialog(null,""
				+ "Ingresa Posicion","Futbolista",JOptionPane.INFORMATION_MESSAGE);
		numero=Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "Ingresa Numero","Futbolista",JOptionPane.INFORMATION_MESSAGE));
	Futbolista f = new Futbolista( id,  edad, nombre,  apellido,  peso,  posicion,  numero);
	salidaF += i.ImprimeFutbolista(f);
	datos.setText(salidaF);
	JOptionPane.showMessageDialog(null, datos,"Informacion Futbolista",JOptionPane.INFORMATION_MESSAGE);
	}
	public void IngresaMasajista() {
		especialidad=JOptionPane.showInputDialog(null,""
				+ "Ingresa Especialidad","Masajista",JOptionPane.INFORMATION_MESSAGE);
		experiencia=Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "Ingresa Experiencia","Masajista",JOptionPane.INFORMATION_MESSAGE));
	Masajista m = new Masajista( id,  edad,  nombre, apellido,  peso, especialidad,
			 experiencia);
	salidaM += i.ImprimeMasajista(m);
	datos.setText(salidaF);
	JOptionPane.showMessageDialog(null, datos,"Informacion Masajista",JOptionPane.INFORMATION_MESSAGE);

	}
	
	public void IngresaEntrenador() {
		idFederacion=JOptionPane.showInputDialog(null,""
				+ "Ingresa ID de Federacion","Entrenador",JOptionPane.INFORMATION_MESSAGE);
	Entrenador e = new Entrenador( id,  edad,  nombre,  apellido,  peso,  idFederacion);

	salidaE += i.ImprimeEntrenador(e);
	datos.setText(salidaF);
	JOptionPane.showMessageDialog(null, datos,"Informacion Entrenador",JOptionPane.INFORMATION_MESSAGE);

	}

}
