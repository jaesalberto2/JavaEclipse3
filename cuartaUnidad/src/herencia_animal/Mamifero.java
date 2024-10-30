package herencia_animal;

public class Mamifero extends Animal {
	String alimento;

	public Mamifero(String name, double peso, int edad, String alimento) {
		super(name, peso, edad);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return alimento + "\t" + name + "\t" + peso + "\t" + edad + "\n";
	}
	
	
	

}
