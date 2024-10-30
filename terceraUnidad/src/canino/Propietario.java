package canino;

public class Propietario {
	String nombre,telefono,direccion,correo;

	public Propietario(String nombre, String telefono, String direccion, String correo) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return " Nombre : " + nombre + "\nTelefono : "
				+ "" + telefono + "\nDireccion : " + direccion + "\nCorreo : "
				+ correo + "\n";
	}
	
	

}
