package ExamenAutomovil;

public class Piloto {

	String name, apellido;
	int edad;
	String escuderia;
	int puntaje;
	String email,patrocinador;

	public Piloto(String name, String apellido, int edad, String escuderia, int puntaje, String email,
			String patrocinador) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.edad = edad;
		this.escuderia = escuderia;
		this.puntaje = puntaje;
		this.email = email;
		this.patrocinador = patrocinador;
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

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPatrocinador() {
		return patrocinador;
	}

	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}

	@Override
	public String toString() {
		return " name : " + name + "\napellido : " + apellido + "\nedad : " + edad + "\nescuderia : " + escuderia
				+ "\npuntaje : " + puntaje + "\nemail : " + email + "\npatrocinador : " + patrocinador + "\n";
	}
	
	
}
