package ExamenAutomovil;

public class Automovil {
	
	Piloto piloto;
	Entrenador entrenador;
	String motor,color;
	int numero;
	float velocidad;
	String modelo,fabricante,campeonatos;
	public Automovil(Piloto piloto, Entrenador entrenador, String motor, String color, int numero, float velocidad,
			String modelo, String fabricante, String campeonatos) {
		super();
		this.piloto = piloto;
		this.entrenador = entrenador;
		this.motor = motor;
		this.color = color;
		this.numero = numero;
		this.velocidad = velocidad;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.campeonatos = campeonatos;
	}
	public Piloto getPiloto() {
		return piloto;
	}
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	public Entrenador getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCampeonatos() {
		return campeonatos;
	}
	public void setCampeonatos(String campeonatos) {
		this.campeonatos = campeonatos;
	}
	@Override
	public String toString() {
		return " piloto : \n" + piloto + "\n\nentrenador : \n" + entrenador + "\nh\nmotor : " + motor + "\ncolor : " + color
				+ "\nnumero : " + numero + "\nvelocidad : " + velocidad + "\nmodelo : " + modelo + "\nfabricante : "
				+ fabricante + "\ncampeonatos : " + campeonatos + "\n";
	}
	
	

}
