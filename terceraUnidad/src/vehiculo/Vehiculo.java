package vehiculo;

public class Vehiculo {
	
	Chofer chofer;
	Empresa empresa;
	String marca, matricula, modelo, color;
	
	
	public Vehiculo(Vehiculo v) {
		
		// TODO Auto-generated constructor stub
	}
	public Vehiculo(Chofer chofer, Empresa empresa, String marca, String matricula, String modelo, String color) {
		super();
		this.chofer = chofer;
		this.empresa = empresa;
		this.marca = marca;
		this.matricula = matricula;
		this.modelo = modelo;
		this.color = color;
	}
	public Chofer getChofer() {
		return chofer;
	}
	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "\n Chofer : \n" + chofer + "\nEmpresa : \n" + empresa + "\nVehiculo:\nmarca : " + marca + "\nmatricula : " + matricula
				+ "\nmodelo : " + modelo + "\ncolor : " + color + "\n";
	}
	
	
	

}
