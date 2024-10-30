package vehiculo;

public class Empresa {
	
	String name,direccion,rfc,www;

	public Empresa(String name, String direccion, String rfc, String www) {
		super();
		this.name = name;
		this.direccion = direccion;
		this.rfc = rfc;
		this.www = www;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getWww() {
		return www;
	}

	public void setWww(String www) {
		this.www = www;
	}

	@Override
	public String toString() {
		return " name : " + name + "\ndireccion : " + direccion + "\nrfc : " + rfc + "\nwww : " + www + "\n";
	}
	

}
