package heroe;

public class Heroe {
	
	Villano villano;
	Ayudante ayudante;
	String nombre,power,universo,debilidad;
	int edad;
	public Heroe(Villano villano, Ayudante ayudante, String nombre, String power, String universo, String debilidad,
			int edad) {
		super();
		this.villano = villano;
		this.ayudante = ayudante;
		this.nombre = nombre;
		this.power = power;
		this.universo = universo;
		this.debilidad = debilidad;
		this.edad = edad;
	}
	public Villano getVillano() {
		return villano;
	}
	public void setVillano(Villano villano) {
		this.villano = villano;
	}
	public Ayudante getAyudante() {
		return ayudante;
	}
	public void setAyudante(Ayudante ayudante) {
		this.ayudante = ayudante;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getUniverso() {
		return universo;
	}
	public void setUniverso(String universo) {
		this.universo = universo;
	}
	public String getDebilidad() {
		return debilidad;
	}
	public void setDebilidad(String debilidad) {
		this.debilidad = debilidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
