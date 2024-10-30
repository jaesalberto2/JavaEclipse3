package persona;

public class Directivo extends Persona{
	String puesto,departamento;

	public Directivo(String name, String apellido, int edad, String sexo, String puesto, String departamento) {
		super(name, apellido, edad, sexo);
		this.puesto = puesto;
		this.departamento = departamento;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return puesto + "\t" + departamento + "\t" + name + "\t" + apellido + "\t" + edad + "\t" + sexo + "\n";
	}

	
	
	
	
	

}
