package herencia_animal;

public class Animal {
	String name;
	double peso;
	int edad;
	public Animal(String name, double peso, int edad) {
		super();
		this.name = name;
		this.peso = peso;
		this.edad = edad;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return name + "\t" + peso + "\t" + edad + "\n";
	}
	
	

}
