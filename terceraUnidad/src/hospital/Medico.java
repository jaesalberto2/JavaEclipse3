package hospital;

public class Medico {
	String name,apellido,direccion, email, especialidad;
	int edad, celula;
	double salario;
	
	//constructor method
	public Medico(String name, String apellido, String direccion, String email, String especialidad, int edad,
			int celula, double salario) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.direccion = direccion;
		this.email = email;
		this.especialidad = especialidad;
		this.edad = edad;
		this.celula = celula;
		this.salario = salario;
		
	}
	
	//gets and sets
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
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCelula() {
		return celula;
	}
	public void setCelula(int celula) {
		this.celula = celula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//metodo toString
	@Override
	public String toString() {
		return " Nombre : " + name + "\nApellido : " + apellido + "\nDireccion : "
				+ "" + direccion + "\ne-mail : " + email
				+ "\nEspecialidad : " + especialidad + "\nEdad : "
				+ "" + edad + "\nCelula : " + celula + "\n"
				+ "Salario : "+ salario + "\n";
	}
	
	
	
	

}
