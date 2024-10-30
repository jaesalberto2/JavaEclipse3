package composicion_vehiculo;

public class Vehiculo {
	//definicion de los atributos de la clase
	
	String marca;
	String modelo;
	String color;
	String matricula;
	double precio;
	public Vehiculo(String marca, String modelo,String color, 
			String matricula, double precio) {
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
		this.matricula=matricula;
		this.precio=precio;
		
	}
	
}
