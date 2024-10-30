package persona;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ingresa {
	String name, apellido;
	int edad;
	String sexo;
	
	
	String escuela;
	double promedio;
	
	
	String grado;
	double salario;
	
	
	String puesto;
	String departamento;

	String salidaE = "escuela" + "\t" + "promedio" + "\t" + "name"
			+ "" + "\t" + "apellido" + "\t" + "edad" + "\t" + "sexo" + "\n";
	String salidaM = "grado" + "\t" + "salario" + ",\t" + "name" + ",\t"
			+ "" + "apellido" + ",\t" + "edad" + ",\t" + "sexo" + "\n";
	String salidaD = "puesto" + "\t" + departamento + ",\t" + name + ",\t"
			+ "" + apellido + ",\t" + edad + ",\t" + sexo + "\n";
	
	Imprime i = new Imprime();
	JTextArea datos = new JTextArea();
	
	public void ingresaPersona() {
		
		name = JOptionPane.showInputDialog(null,""
				+ "Ingresa Nombre","Informacion General"
						+ "",JOptionPane.INFORMATION_MESSAGE);
		
		apellido = JOptionPane.showInputDialog(null,""
				+ "Ingresa Apellido","Informacion General"
						+ "",JOptionPane.INFORMATION_MESSAGE);

		edad = Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "Ingresa Edad","Informacion General"
						+ "",JOptionPane.INFORMATION_MESSAGE));
		
		sexo = JOptionPane.showInputDialog(null,""
				+ "Ingresa Sexo","Informacion General"
						+ "",JOptionPane.INFORMATION_MESSAGE);

	}
	
	public void ingresaEstudiante() {
		escuela=JOptionPane.showInputDialog(null,""
				+ "Ingresa Escuela","Informacion Estudiante"
						+ "",JOptionPane.INFORMATION_MESSAGE);

		promedio= Double.parseDouble(JOptionPane.showInputDialog(null,""
				+ "Ingresa Promedio","Informacion Estudiante"
						+ "",JOptionPane.INFORMATION_MESSAGE));
		Estudiante e = new Estudiante( name,  apellido,  edad,  sexo,  escuela,  promedio); 
	salidaE += i.ImprimeEstudiante(e);
	datos.setText(salidaE);
	JOptionPane.showMessageDialog(null, datos,"Informacion del Estudiante"
			+ "",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void ingresaMaestro() {
		grado=JOptionPane.showInputDialog(null,""
				+ "Ingresa Grado","Informacion Maestro",JOptionPane.INFORMATION_MESSAGE);

		salario=Double.parseDouble(JOptionPane.showInputDialog(null,""
				+ "Ingresa Salario","Informacion Maestro",JOptionPane.INFORMATION_MESSAGE));
		Maestro m = new Maestro( name,  apellido,  edad,  sexo,  grado,  salario);
		salidaM += i.ImprimeMaestro(m);
		datos.setText(salidaM);
		JOptionPane.showMessageDialog(null, datos,"Informacion del Maestro"
				+ "",JOptionPane.INFORMATION_MESSAGE);

	}
	
	public void ingresaDirectivo() {
		puesto=JOptionPane.showInputDialog(null,""
				+ "Ingresa Puesto","Informacion Directivo",JOptionPane.INFORMATION_MESSAGE);
		departamento=JOptionPane.showInputDialog(null,""
				+ "Ingresa Departamento","Informacion Directivo",JOptionPane.INFORMATION_MESSAGE);

		Directivo d = new Directivo( name,  apellido,  edad,  sexo,  puesto,  departamento);
		salidaD += i.ImprimeDirectivo(d);
		datos.setText(salidaD);
		JOptionPane.showMessageDialog(null, datos,"Informacion del Directivo"
				+ "",JOptionPane.INFORMATION_MESSAGE);

	}

}
