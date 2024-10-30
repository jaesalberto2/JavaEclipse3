package alumno;

public class Escuela {
	String nombre,telefono,web;

	public Escuela(String nombre, String telefono, String web) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.web = web;
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

	public String getWeb() {
		return this.web;
	}

	public void setWeb(String web) {
		this.web = web;
	}
	
	

}
