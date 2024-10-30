package pokemon;

import java.io.Serializable;

public class Volador extends Pokemon implements Serializable{
	String tamaño, habilidad;

	public Volador(String nombre, double peso, int edad, String sexo, String habitat, String tamaño, String habilidad) {
		super(nombre, peso, edad, sexo, habitat);
		this.tamaño = tamaño;
		this.habilidad = habilidad;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	
	

	
	

}
