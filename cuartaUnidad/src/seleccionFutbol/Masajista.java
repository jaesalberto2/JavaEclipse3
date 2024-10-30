package seleccionFutbol;

public class Masajista extends SeleccionFutbol{

	String especialidad;
	int experiencia;
	public Masajista(int id, int edad, String nombre, String apellido, double peso, String especialidad,
			int experiencia) {
		super(id, edad, nombre, apellido, peso);
		this.especialidad = especialidad;
		this.experiencia = experiencia;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return especialidad + "\t" + experiencia + "\t" + id + "\t" + edad + "\t" + nombre + "\t" + apellido + "\t"
				+ peso + "\n";
	}
	
	
	
}
