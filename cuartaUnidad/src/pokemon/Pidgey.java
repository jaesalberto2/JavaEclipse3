package pokemon;

import java.io.Serializable;

public class Pidgey extends Volador implements Serializable{
	String garras,vista;

	public Pidgey(String nombre, double peso, int edad, String sexo, String habitat, String tamaño, String habilidad,
			String garras, String vista) {
		super(nombre, peso, edad, sexo, habitat, tamaño, habilidad);
		this.garras = garras;
		this.vista = vista;
	}

	public String getGarras() {
		return garras;
	}

	public void setGarras(String garras) {
		this.garras = garras;
	}

	public String getVista() {
		return vista;
	}

	public void setVista(String vista) {
		this.vista = vista;
	}
	
	

	
	

}
