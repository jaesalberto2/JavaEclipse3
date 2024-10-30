package hotel2;

public class Huesped {
	String name,apellido,direccion,email,origen;
	int edad,phone;
	
	//Constructor
	public Huesped(String name, String apellido, String direccion, String email, String origen, int edad, int phone) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.direccion = direccion;
		this.email = email;
		this.origen = origen;
		this.edad = edad;
		this.phone = phone;
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

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	//toString method

	@Override
	public String toString() {
		return " Nombre : " + name + "\nApellido : " + apellido + "\nDireccion : "
				+ "" + direccion + "\ne-mail : " + email
				+ "\nOrigen : " + origen + "\nEdad : " + edad + "\nTelefono : "
						+ "" + phone + "\n";
	}
	
	
	
	
	
	

}
