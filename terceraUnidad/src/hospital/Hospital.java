package hospital;

public class Hospital {
	String name,direccion,rfc,www;
	int telefono;
	public Hospital(String name, String direccion, String rfc, String www, int telefono) {
		super();
		this.name = name;
		this.direccion = direccion;
		this.rfc = rfc;
		this.www = www;
		this.telefono = telefono;
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return " Nombre : " + name + "\nDireccion : " + direccion + "\nRFC : "
				+ "" + rfc + "\nSitio Web : " + www + "\nTelefono : "
				+ telefono + "\n";
	}
	
	
	
	

}
