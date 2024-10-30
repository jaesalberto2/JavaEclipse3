package ExamenAutomovil;

public class Entrenador {
	String name,apellido;
	int edad;
	String sexo;
	int phone;
	String email,direccion;

	public Entrenador(String name, String apellido, int edad, String sexo, int phone, String email,
			String direccion) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.phone = phone;
		this.email = email;
		this.direccion = direccion;
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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return " name : " + name + "\napellido : " + apellido + "\nedad : " + edad + "\nsexo : " + sexo + "\nphone : "
				+ phone + "\nemail : " + email + "\ndireccion : " + direccion + "\n";
	}
	
	

}
