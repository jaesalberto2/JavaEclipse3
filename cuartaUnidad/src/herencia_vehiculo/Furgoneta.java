package herencia_vehiculo;

public class Furgoneta extends Vehiculo {
	int carga;
	double volumen;
	public Furgoneta(String matricula, String marca, String modelo, String color, double precio,
			int carga, double volumen) {
		super(matricula, marca, modelo, color, precio);
		this.carga = carga;
		this.volumen = volumen;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public double getVolumen() {
		return volumen;
	}
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	
	
	

}
