package herencia_animal;

public class Canino extends Mamifero{
	String habitat;

	public Canino(String name, double peso, int edad, String alimento, String habitat) {
		super(name, peso, edad, alimento);
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		return habitat + "\t" + alimento + "\t" + name + "\t" + peso + "\t" + edad + "\n";
	}
	
}
