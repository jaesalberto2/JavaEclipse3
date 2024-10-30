package pokemon;

import java.io.Serializable;

public class Pokemon  implements Serializable{
	String nombre;
	double peso;
	int edad;
	String sexo;
	String habitat;
	public Pokemon(String nombre, double peso, int edad, String sexo, String habitat) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
		this.sexo = sexo;
		this.habitat = habitat;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
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
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	

}
