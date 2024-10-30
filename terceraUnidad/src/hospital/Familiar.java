package hospital;

public class Familiar {
	String name,apellido,telefono,correo;

	//Metodo constructor
	public Familiar(String name, String apellido, String telefono, String correo) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		
		//gets and sets
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	//Metodo toString

	@Override
	public String toString() {
		return " Nombre : " + name + "\nApellido : " + apellido + "\nTelefono : " + telefono + "\nCorreo : " + correo
				+ "\n";
	}
	
	
	
	
	
	

}
