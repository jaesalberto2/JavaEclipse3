package pokemon;

import java.io.Serializable;

public class Zubat extends Volador implements Serializable{
	
	int longevidad;
	String veneno;
	public Zubat(String nombre, double peso, int edad, String sexo, String habitat, String tamaño, String habilidad,
			int longevidad, String veneno) {
		super(nombre, peso, edad, sexo, habitat, tamaño, habilidad);
		this.longevidad = longevidad;
		this.veneno = veneno;
	}
	public int getLongevidad() {
		return longevidad;
	}
	public void setLongevidad(int longevidad) {
		this.longevidad = longevidad;
	}
	public String getVeneno() {
		return veneno;
	}
	public void setVeneno(String veneno) {
		this.veneno = veneno;
	}
	
	

}
