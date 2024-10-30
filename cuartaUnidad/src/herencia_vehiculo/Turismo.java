package herencia_vehiculo;

public class Turismo extends Vehiculo {
	int npuertas;
	String transmicion;
	public Turismo(String matricula, String marca, String modelo, String color, double precio,
			int npuertas, String transmicion) {
		super(matricula, marca, modelo, color, precio);
		this.npuertas = npuertas;
		this.transmicion = transmicion;
	}
	public int getNpuertas() {
		return npuertas;
	}
	public void setNpuertas(int npuertas) {
		this.npuertas = npuertas;
	}
	public String getTransmicion() {
		return transmicion;
	}
	public void setTransmicion(String transmicion) {
		this.transmicion = transmicion;
	}
	

	
	

}
