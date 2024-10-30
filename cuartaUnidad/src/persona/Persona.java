package persona;

public class Persona {
	String name, apellido;
	int edad;
	String sexo;
	public Persona(String name, String apellido, int edad, String sexo) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

}
