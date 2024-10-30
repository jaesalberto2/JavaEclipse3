package computadora;

import javax.swing.JOptionPane;

public class Computadora {
	String marca,modelo,procesador;
	double hd,pantalla,costo,peso;
	int ram,serie;
	public Computadora(String marca, String modelo, String procesador, double hd, double pantalla, double costo,
			double peso, int ram, int serie) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.hd = hd;
		this.pantalla = pantalla;
		this.costo = costo;
		this.peso = peso;
		this.ram = ram;
		this.serie = serie;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getProcesador() {
		return this.procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public double getHd() {
		return this.hd;
	}
	public void setHd(double hd) {
		this.hd = hd;
	}
	public double getPantalla() {
		return this.pantalla;
	}
	public void setPantalla(double pantalla) {
		this.pantalla = pantalla;
	}
	public double getCosto() {
		return this.costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getRam() {
		return this.ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getSerie() {
		return this.serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	@Override
	public String toString() {
		return "marca=" + marca + "\n modelo=" + modelo + "\n procesador="
				+ "" + procesador + "\n hd=" + hd
				+ "\n pantalla=" + pantalla + "\n costo=" + costo + "\n peso="
						+ "" + peso + "\n ram=" + ram + "\n serie=" + serie;
		
		
	}
	
	//METODOS
	public void Encender() {
		JOptionPane.showMessageDialog(null, "Encendida","Encender Computadora",JOptionPane.INFORMATION_MESSAGE);
	}
	public void Apagar() {
		JOptionPane.showMessageDialog(null, "Apagando...","Apagar Computadora",JOptionPane.INFORMATION_MESSAGE);

		
	}
	public void Procesar() {
		JOptionPane.showMessageDialog(null, "Procesando...","Procesar",JOptionPane.INFORMATION_MESSAGE);

	}
	public void Imprime() {
		JOptionPane.showMessageDialog(null, "Imprimiendo...","Imprimir",JOptionPane.INFORMATION_MESSAGE);

	}

}
