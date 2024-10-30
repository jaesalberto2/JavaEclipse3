package hotel2;

public class Habitacion {
	
	int numero, capacidad;
	String piso,categoria;
	
	
	//Constructor
	public Habitacion(int numero, int capacidad, String piso, String categoria) {
		super();
		this.numero = numero;
		this.capacidad = capacidad;
		this.piso = piso;
		this.categoria = categoria;
	}

	
	//gets and sets

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public String getPiso() {
		return piso;
	}


	public void setPiso(String piso) {
		this.piso = piso;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	//toString method
	@Override
	public String toString() {
		return " Numero : " + numero + "\nCapacidad : " + capacidad + "\nPiso : "
				+ "" + piso + "\nCategoria : " + categoria
				+ "\n";
	}
	
	
	
	
	
	

}
