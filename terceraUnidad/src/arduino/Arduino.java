package arduino;

public class Arduino {
	public Arduino(String nombre, String memoria, String lineasdeIOdigitales, String lineasdeEntradasAnalogicas,
			String microcontrolador, String modelo, double precio) {
		super();
		this.nombre = nombre;
		this.memoria = memoria;
		this.lineasdeIOdigitales = lineasdeIOdigitales;
		this.lineasdeEntradasAnalogicas = lineasdeEntradasAnalogicas;
		this.microcontrolador = microcontrolador;
		this.modelo = modelo;
		this.precio = precio;
	}
	String nombre, memoria, lineasdeIOdigitales,
	lineasdeEntradasAnalogicas,microcontrolador,modelo;
	double precio;
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMemoria() {
		return this.memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getLineasdeIOdigitales() {
		return this.lineasdeIOdigitales;
	}
	public void setLineasdeIOdigitales(String lineasdeIOdigitales) {
		this.lineasdeIOdigitales = lineasdeIOdigitales;
	}
	public String getLineasdeEntradasAnalogicas() {
		return this.lineasdeEntradasAnalogicas;
	}
	public void setLineasdeEntradasAnalogicas(String lineasdeEntradasAnalogicas) {
		this.lineasdeEntradasAnalogicas = lineasdeEntradasAnalogicas;
	}
	public String getMicrocontrolador() {
		return this.microcontrolador;
	}
	public void setMicrocontrolador(String microcontrolador) {
		this.microcontrolador = microcontrolador;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return this.precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return " nombre : " + nombre + ", \nmemoria : " + memoria + ", \nlineasdeIOdigitales : " + lineasdeIOdigitales
				+ ", \nlineasdeEntradasAnalogicas : " + lineasdeEntradasAnalogicas + ", \nmicrocontrolador : "
				+ microcontrolador + ", \nmodelo : " + modelo + ", \nprecio : " + precio + "\n";
	}
	
	
	

}
