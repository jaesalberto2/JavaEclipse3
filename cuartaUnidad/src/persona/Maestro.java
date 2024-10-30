package persona;

public class Maestro extends Persona{
	String grado;
	double salario;
	public Maestro(String name, String apellido, int edad, String sexo, String grado, double salario) {
		super(name, apellido, edad, sexo);
		this.grado = grado;
		this.salario = salario;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return grado + "\t" + salario + "\t" + name + "\t" + apellido + "\t" + edad + "\t" + sexo + "\n";
	}
	
	
	

}
