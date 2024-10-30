package zapateria;

import javax.swing.JOptionPane;

public class Zapateria {
	
	String nombre, marca ,color,modelo,genero;
	int medida;
	double precio;
	
	//Constructor
	public Zapateria(String nombre, String marca, String color, String modelo, String genero, int medida,
			double precio) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.genero = genero;
		this.medida = medida;
		this.precio = precio;
	}
	//gets and sets

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getMedida() {
		return medida;
	}

	public void setMedida(int medida) {
		this.medida = medida;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return " nombre : " + nombre + "\nmarca : " + marca + "\ncolor : " + color + "\nmodelo : " + modelo
				+ "\ngenero : " + genero + "\nmedida : " + medida + "\nprecio : " + precio + "\n";
	}

	public void Comprar() {
		JOptionPane.showMessageDialog(null, "Comprando...","Comprar",JOptionPane.INFORMATION_MESSAGE);
	}
	public void Medir() {
		JOptionPane.showMessageDialog(null, "Midiendo...","Medir",JOptionPane.INFORMATION_MESSAGE);
	}
	public void Caminar() {
		JOptionPane.showMessageDialog(null, "Caminando...","Medir",JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	
	

	
	
	

}
