package seleccionFutbol;

public class Futbolista extends SeleccionFutbol{
	 
	String posicion;
	int numero;
	
	
	public Futbolista(int id, int edad, String nombre, String apellido, double peso, String posicion, int numero) {
		super(id, edad, nombre, apellido, peso);
		this.posicion = posicion;
		this.numero = numero;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return posicion + "\t" + numero + "\t" + id + "\t" + edad + "\t" + nombre + "\t" + apellido + "\t" + peso
				+ "\n";
	}
	
	
	
	

}
