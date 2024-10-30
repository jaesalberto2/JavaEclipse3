package pokemon;

public class Pokemon {
Gimnasio gimnasio;
Entrenador entrenador;
String name,tipo,power;
float peso,altura;
String habitat,especie,evolucion;
public Pokemon(Gimnasio gimnasio, Entrenador entrenador, String name, String tipo, String power, float peso,
		float altura, String habitat, String especie, String evolucion) {
	super();
	this.gimnasio = gimnasio;
	this.entrenador = entrenador;
	this.name = name;
	this.tipo = tipo;
	this.power = power;
	this.peso = peso;
	this.altura = altura;
	this.habitat = habitat;
	this.especie = especie;
	this.evolucion = evolucion;
}
public Gimnasio getGimnasio() {
	return gimnasio;
}
public void setGimnasio(Gimnasio gimnasio) {
	this.gimnasio = gimnasio;
}
public Entrenador getEntrenador() {
	return entrenador;
}
public void setEntrenador(Entrenador entrenador) {
	this.entrenador = entrenador;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getPower() {
	return power;
}
public void setPower(String power) {
	this.power = power;
}
public float getPeso() {
	return peso;
}
public void setPeso(float peso) {
	this.peso = peso;
}
public float getAltura() {
	return altura;
}
public void setAltura(float altura) {
	this.altura = altura;
}
public String getHabitat() {
	return habitat;
}
public void setHabitat(String habitat) {
	this.habitat = habitat;
}
public String getEspecie() {
	return especie;
}
public void setEspecie(String especie) {
	this.especie = especie;
}
public String getEvolucion() {
	return evolucion;
}
public void setEvolucion(String evolucion) {
	this.evolucion = evolucion;
}
@Override
public String toString() {
	return "\nname : " + name + "\ntipo : " + tipo
			+ "\npower : " + power + "\npeso : " + peso + "\naltura : " + altura + "\nhabitat : " + habitat
			+ "\nespecie : " + especie + "\nevolucion : " + evolucion + "\n\nGimnasio : \n"
					+ "" + gimnasio + "\nEntrenador : \n" + entrenador;
}




}
