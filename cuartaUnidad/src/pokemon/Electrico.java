package pokemon;

import java.io.Serializable;

public class Electrico extends Pokemon implements Serializable{
	String alimentacion,poder;

	public Electrico(String nombre, double peso, int edad, String sexo, String habitat, String alimentacion,
			String poder) {
		super(nombre, peso, edad, sexo, habitat);
		this.alimentacion = alimentacion;
		this.poder = poder;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}
	
	

}
