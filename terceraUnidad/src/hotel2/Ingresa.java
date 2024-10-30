package hotel2;

import javax.swing.JOptionPane;

public class Ingresa {
	public Hotel ingresa() {
		
		Huesped huesped=new Huesped(null,null,null,null,null,0,0);
		String nameHuesped,apellido,direccionHuesped,email,origen;
		int edad,phoneHuesped;
		
		Habitacion habitacion=new Habitacion(0,0,null,null);
		int numero, capacidad;
		String piso,categoriaHabitacion;
		
		Hotel hotel = new Hotel(huesped,habitacion,null,null,null,null,null,null,null);
		String name,direccion,phone,www,rfc,categoria,ciudad;
		
		//Ingresa datos de hotel
		
		name = JOptionPane.showInputDialog(null,""
		+ "Ingresa Nombre","Hotel",JOptionPane.INFORMATION_MESSAGE);
		direccion = JOptionPane.showInputDialog(null,""
				+ "Ingresa Direccion","Hotel",JOptionPane.INFORMATION_MESSAGE);
		phone = JOptionPane.showInputDialog(null,""
				+ "Ingresa Telefono","Hotel",JOptionPane.INFORMATION_MESSAGE);
		www = JOptionPane.showInputDialog(null,""
				+ "Ingresa Sitio web","Hotel",JOptionPane.INFORMATION_MESSAGE);
		rfc = JOptionPane.showInputDialog(null,""
				+ "Ingresa RFC","Hotel",JOptionPane.INFORMATION_MESSAGE);
		categoria = JOptionPane.showInputDialog(null,""
				+ "Ingresa Categoria","Hotel",JOptionPane.INFORMATION_MESSAGE);
		ciudad = JOptionPane.showInputDialog(null,""
				+ "Ingresa Ciudad","Hotel",JOptionPane.INFORMATION_MESSAGE);
		
		//asignando atributos de hotel
		
		hotel.setName(name);
		hotel.setDireccion(direccion);
		hotel.setPhone(phone);
		hotel.setRfc(rfc);
		hotel.setWww(www);
		hotel.setCategoria(categoria);
		hotel.setCiudad(ciudad);
		
		//solicitar datos de huesped
		nameHuesped = JOptionPane.showInputDialog(null,""
				+ "Ingresa Nombre","Huesped",JOptionPane.INFORMATION_MESSAGE);
		apellido = JOptionPane.showInputDialog(null,""
				+ "Ingresa Apellido","Huesped",JOptionPane.INFORMATION_MESSAGE);
		direccionHuesped = JOptionPane.showInputDialog(null,""
				+ "Ingresa Direccion","Huesped",JOptionPane.INFORMATION_MESSAGE);
		email = JOptionPane.showInputDialog(null,""
				+ "Ingresa e-mail","Huesped",JOptionPane.INFORMATION_MESSAGE);
		origen = JOptionPane.showInputDialog(null,""
				+ "Ingresa Origen","Huesped",JOptionPane.INFORMATION_MESSAGE);
		edad  =Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "Ingresa Edad","Huesped",JOptionPane.INFORMATION_MESSAGE));
		phoneHuesped =Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "Ingresa Telefono","Huesped",JOptionPane.INFORMATION_MESSAGE));
		//asignar atributos de huesped
		//String nameHuesped,apellido,direccionHuesped,email,origen;
		//int edad,phoneHuesped;
		
		hotel.huesped.setName(nameHuesped);
		hotel.huesped.setApellido(apellido);
		hotel.huesped.setDireccion(direccionHuesped);
		hotel.huesped.setEmail(email);
		hotel.huesped.setOrigen(origen);
		hotel.huesped.setEdad(edad);
		hotel.huesped.setPhone(phoneHuesped);
		
		
		//solicitar valores de habitacion
		
		numero =Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "Ingresa Numero","Habitacion",JOptionPane.INFORMATION_MESSAGE));
		capacidad = Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "Ingresa Capacidad","Habitacion",JOptionPane.INFORMATION_MESSAGE));
		piso = JOptionPane.showInputDialog(null,""
				+ "Ingresa Piso","Habitacion",JOptionPane.INFORMATION_MESSAGE);
		categoriaHabitacion = JOptionPane.showInputDialog(null,""
				+ "Ingresa Categoria","Habitacion",JOptionPane.INFORMATION_MESSAGE);
		
		//asignar atributos de habitacion
		/*
		int numero, capacidad;
		String piso,categoriaHabitacion;
		*/
		
		hotel.habitacion.setNumero(numero);
		hotel.habitacion.setCapacidad(capacidad);
		hotel.habitacion.setPiso(piso);
		hotel.habitacion.setCategoria(categoriaHabitacion);
		
		
		return hotel;
	}

}
