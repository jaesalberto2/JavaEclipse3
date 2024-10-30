package hotel2;

public class Hotel {
	Huesped huesped;
	Habitacion habitacion;
	String name,direccion,phone,www,rfc,categoria,ciudad;
	
	//Constructor
	public Hotel(Huesped huesped, Habitacion habitacion, String name, String direccion, String phone, String www,
			String rfc, String categoria, String ciudad) {
		super();
		this.huesped = huesped;
		this.habitacion = habitacion;
		this.name = name;
		this.direccion = direccion;
		this.phone = phone;
		this.www = www;
		this.rfc = rfc;
		this.categoria = categoria;
		this.ciudad = ciudad;
	}
	
	//gets and sets
	public Huesped getHuesped() {
		return huesped;
	}
	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}
	public Habitacion getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWww() {
		return www;
	}
	public void setWww(String www) {
		this.www = www;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	//toString method
	@Override
	public String toString() {
		return " Huesped : \n" + huesped + "\nHabitacion : \n"
				+ "" + habitacion + "\n\nHotel :\nNombre : "
				+ "" + name + "\nDireccion : "
				+ direccion + "\nTelefono : " + phone + "\nSitio web : "
				+ "" + www + "\nRFC : " + rfc + "\nCategoria : " + categoria
				+ "\nCiudad : " + ciudad + "\n";
	}
	
	
	
	
	
	

}
