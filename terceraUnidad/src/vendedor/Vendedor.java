package vendedor;

import javax.swing.JOptionPane;

public class Vendedor {
	
	String nombre, apellido, direccion,comision,rfc,correo;
	int ventas;
	public Vendedor(String nombre, String apellido, String direccion, String comision, String rfc, String correo,
			int ventas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.comision = comision;
		this.rfc = rfc;
		this.correo = correo;
		this.ventas = ventas;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getVentas() {
		return ventas;
	}
	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	@Override
	public String toString() {
		return " nombre : " + nombre + "\napellido : " + apellido + "\ndireccion : " + direccion + "\ncomision : "
				+ comision + "\nrfc : " + rfc + "\ncorreo : " + correo + "\nventas : " + ventas + "\n";
	}
	
	public void Vender() {
		JOptionPane.showMessageDialog(null, "Vendiendo...","Vender"
				+ "",JOptionPane.INFORMATION_MESSAGE);
	}
	public void Cobrar() {
		JOptionPane.showMessageDialog(null, "Cobrando...","Cobrar"
				+ "",JOptionPane.INFORMATION_MESSAGE);
	}
	public void Promocion() {
		JOptionPane.showMessageDialog(null, "Promocionando...","Promocion"
				+ "",JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	

}
