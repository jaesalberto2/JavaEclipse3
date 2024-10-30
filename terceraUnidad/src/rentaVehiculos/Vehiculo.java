package rentaVehiculos;

public class Vehiculo {
	
	String nombre, modelo,marca,placa,tipo_vehiculo,tipo_combustible,
	color;
	int cilindros;
	double costo_renta;
	
	//constructor
	public Vehiculo(String nombre, String modelo, String marca, String placa, String tipo_vehiculo,
			String tipo_combustible, String color, int cilindros, double costo_renta) {
		super();
		this.nombre = nombre;
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.tipo_vehiculo = tipo_vehiculo;
		this.tipo_combustible = tipo_combustible;
		this.color = color;
		this.cilindros = cilindros;
		this.costo_renta = costo_renta;
	}

	//gets y sets
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo_vehiculo() {
		return this.tipo_vehiculo;
	}

	public void setTipo_vehiculo(String tipo_vehiculo) {
		this.tipo_vehiculo = tipo_vehiculo;
	}

	public String getTipo_combustible() {
		return this.tipo_combustible;
	}

	public void setTipo_combustible(String tipo_combustible) {
		this.tipo_combustible = tipo_combustible;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCilindros() {
		return this.cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}

	public double getCosto_renta() {
		return this.costo_renta;
	}

	public void setCosto_renta(double costo_renta) {
		this.costo_renta = costo_renta;
	}

	//Imprime
	@Override
	public String toString() {
		return " nombre : " + nombre + ", \nmodelo : " + modelo + ", \nmarca : " + marca + ", \nplaca : " + placa
				+ ", \ntipo_vehiculo : " + tipo_vehiculo + ", \ntipo_combustible : " + tipo_combustible + ", \ncolor : "
				+ color + ", \ncilindros : " + cilindros + ", \ncosto_renta : " + costo_renta + "\n";
	}
	
	
	
	
	

	

}
