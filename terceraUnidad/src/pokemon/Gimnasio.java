package pokemon;

public class Gimnasio {
	String name,place, propietario, superficie;
	int capacidad;
	
	//constructor
	public Gimnasio(String name, String place, String propietario, String superficie, int capacidad) {
		super();
		this.name = name;
		this.place = place;
		this.propietario = propietario;
		this.superficie = superficie;
		this.capacidad = capacidad;
		
		//Gets and sets
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	//toString method

	@Override
	public String toString() {
		return " Nombre : " + name + "\nLugar : " + place + "\nPropietario :"
				+ "" + propietario + "\nSuperficie : "
				+ superficie + "\nCapacidad : " + capacidad + "\n";
	}
	
	

	
	
	
	

}
