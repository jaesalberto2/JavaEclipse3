package vehiculo;

public class Chofer {
	String name, apellido, direccion,email;
	int edad;
	float salario;
	public Chofer(String name, String apellido, String direccion, String email, int edad, float salario) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.direccion = direccion;
		this.email = email;
		this.edad = edad;
		this.salario = salario;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return " name : " + name + "\napellido : " + apellido + "\ndireccion : " + direccion + "\nemail : " + email
				+ "\nedad : " + edad + "\nsalario : " + salario + "\n";
	}
	

}
