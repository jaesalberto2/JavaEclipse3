package heroe;

public class Villano {
	
	String nombre, power,macota,vehiculo;

	public Villano(String nombre, String power, String macota, String vehiculo) {
		super();
		this.nombre = nombre;
		this.power = power;
		this.macota = macota;
		this.vehiculo = vehiculo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPower() {
		return this.power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getMacota() {
		return this.macota;
	}

	public void setMacota(String macota) {
		this.macota = macota;
	}

	public String getVehiculo() {
		return this.vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	

}
