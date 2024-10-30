package herencia_vehiculo;

public class Deportivo extends Vehiculo{
int cilindros;

public Deportivo(String matricula, String marca, String modelo, String color, double precio, int cilindros) {
	super(matricula, marca, modelo, color, precio);
	this.cilindros = cilindros;
}

public int getCilindros() {
	return cilindros;
}

public void setCilindros(int cilindros) {
	this.cilindros = cilindros;
}







}
