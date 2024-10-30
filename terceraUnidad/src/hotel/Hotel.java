package hotel;

import javax.swing.JOptionPane;

public class Hotel {
	String nombre, direccion,telefono,rfc,nHabitaciones,tHabitaciones,categoria;

	//Constructor
	public Hotel(String nombre, String direccion, String telefono, String rfc, String nHabitaciones,
			String tHabitaciones, String categoria) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.rfc = rfc;
		this.nHabitaciones = nHabitaciones;
		this.tHabitaciones = tHabitaciones;
		this.categoria = categoria;
		
		
	}
	
	//gets and sets

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getnHabitaciones() {
		return nHabitaciones;
	}

	public void setnHabitaciones(String nHabitaciones) {
		this.nHabitaciones = nHabitaciones;
	}

	public String gettHabitaciones() {
		return tHabitaciones;
	}

	public void settHabitaciones(String tHabitaciones) {
		this.tHabitaciones = tHabitaciones;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return " nombre : " + nombre + ", \ndireccion : " + direccion + ", \ntelefono : " + telefono + ", \nrfc : "
				+ rfc + ", \nnHabitaciones : " + nHabitaciones + ", \ntHabitaciones : " + tHabitaciones
				+ ", \ncategoria : " + categoria + "\n";
	}
	
	
	public void RentarHabitacion() {
		JOptionPane.showMessageDialog(null, "Habitacion rentada"
				+ "","Rentar Habitacion",JOptionPane.INFORMATION_MESSAGE);
		
	}
	public void DejarHabitacion() {
		JOptionPane.showMessageDialog(null, "Habitacion recibida"
				+ "","Dejar Habitacion",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ComerHotel() {
		JOptionPane.showMessageDialog(null, "Comida reservada"
				+ "","Comer en el hotel",JOptionPane.INFORMATION_MESSAGE);
	}
	public void Jugar() {
		JOptionPane.showMessageDialog(null, "Jugando..."
				+ "","Jugar en el hotel",JOptionPane.INFORMATION_MESSAGE);
	}

}
