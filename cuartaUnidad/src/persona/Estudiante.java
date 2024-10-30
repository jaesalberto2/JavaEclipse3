package persona;

public class Estudiante extends Persona{
	
	String escuela;
	double promedio;
	
	public Estudiante(String name, String apellido, int edad, String sexo, String escuela, double promedio) {
		super(name, apellido, edad, sexo);
		this.escuela = escuela;
		this.promedio = promedio;
	}

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return escuela + "\t" + promedio + "\t" + name + "\t" + apellido + "\t"
				+ "" + edad + "\t" + sexo + "\n";
	}
	
	

	
	
	
	
	

}
