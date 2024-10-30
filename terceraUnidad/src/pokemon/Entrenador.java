package pokemon;

public class Entrenador {
	String name,apellido,sexo;
	int edad, phone,npokemons,nmedallas;
	//constructor
	
	public Entrenador(String name, String apellido, String sexo, int edad, int phone, int npokemons, int nmedallas) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
		this.phone = phone;
		this.npokemons = npokemons;
		this.nmedallas = nmedallas;
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}



	public int getNpokemons() {
		return npokemons;
	}



	public void setNpokemons(int npokemons) {
		this.npokemons = npokemons;
	}



	public int getNmedallas() {
		return nmedallas;
	}



	public void setNmedallas(int nmedallas) {
		this.nmedallas = nmedallas;
	}



	@Override
	public String toString() {
		return " Nombre : " + name + "\nApellido : " + apellido + "\nSexo :"
				+ " " + sexo + "\nEdad : " + edad + "\nTelefono : "
				+ phone + "\nNumero de ppokemons : "
						+ "" + npokemons + "\nNumero de medallas : "
								+ "" + nmedallas + "\n";
	}
	
	

	
}
