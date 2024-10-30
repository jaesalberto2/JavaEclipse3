package pokemon;

import java.io.Serializable;

public class Pikachu extends Electrico implements Serializable{
String colorPiel;

public Pikachu(String nombre, double peso, int edad, String sexo, String habitat, String alimentacion, String poder,
		String colorPiel) {
	super(nombre, peso, edad, sexo, habitat, alimentacion, poder);
	this.colorPiel = colorPiel;
}

public String getColorPiel() {
	return colorPiel;
}

public void setColorPiel(String colorPiel) {
	this.colorPiel = colorPiel;
}

}
