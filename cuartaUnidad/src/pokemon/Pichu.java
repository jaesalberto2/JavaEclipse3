package pokemon;

import java.io.Serializable;

public class Pichu extends Electrico implements Serializable{

	String colorPelo;

	public Pichu(String nombre, double peso, int edad, String sexo, String habitat, String alimentacion, String poder,
			String colorPelo) {
		super(nombre, peso, edad, sexo, habitat, alimentacion, poder);
		this.colorPelo = colorPelo;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	
}
