package jugador;

import javax.swing.JOptionPane;

public class Jugador {
	String nombre,apellido,correo,equipo,posicion,nacionalidad;
	int edad,numeral;
	double salario;
	


public Jugador(String nombre, String apellido, String correo, String equipo, String posicion, String nacionalidad,
			int edad, int numeral, double salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.equipo = equipo;
		this.posicion = posicion;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.numeral = numeral;
		this.salario = salario;
	}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public String getEquipo() {
	return equipo;
}

public void setEquipo(String equipo) {
	this.equipo = equipo;
}

public String getPosicion() {
	return posicion;
}

public void setPosicion(String posicion) {
	this.posicion = posicion;
}

public String getNacionalidad() {
	return nacionalidad;
}

public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public int getNumeral() {
	return numeral;
}

public void setNumeral(int numeral) {
	this.numeral = numeral;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

@Override
public String toString() {
	return "nombre=" + nombre + "\n apellido=" + apellido + "\n correo=" + correo + "\n equipo=" + equipo
			+ "\n posicion=" + posicion + "\n nacionalidad=" + nacionalidad + "\n edad=" + edad + "\n numeral=" + numeral
			+ "\n salario=" + salario ;
}


public void correr() {
	
}
public void Saltar() {
	JOptionPane.showMessageDialog(null, "Saltando...","Saltar",JOptionPane.INFORMATION_MESSAGE);
	
}
public void pegar() {
	JOptionPane.showMessageDialog(null, "Pegando...","Pegar",JOptionPane.INFORMATION_MESSAGE);

}
public void anotar() {
	JOptionPane.showMessageDialog(null, "Gooool","Anotar",JOptionPane.INFORMATION_MESSAGE);

}
public void festejar() {
	JOptionPane.showMessageDialog(null, "Hurraaa!!!","Festejar",JOptionPane.INFORMATION_MESSAGE);

}


}
