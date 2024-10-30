package hotel;

import javax.swing.JOptionPane;

public class PruebaHotel {

	public static void main(String[] args) {
		int opc;
		Hotel h1 =new Hotel(null,null,null,null,null,null,null);
		
		do {

		opc =Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Ingresar datos"
		+ "\n2.-Imprimir datos de habitacion\n3.-Rentar Habitacion"
		+ "\n4.-Dejar Habitacion \n5.-Comer \n6.-Jugar\n7.-Salir"));
		switch (opc) {
		case 1:
			{String nombre, direccion,telefono,rfc,nHabitaciones,tHabitaciones,categoria;
			nombre = JOptionPane.showInputDialog(null,"Ingresa Nombre","Nombre",JOptionPane.INFORMATION_MESSAGE);
			direccion = JOptionPane.showInputDialog(null,"Ingresa direccion","direccion",JOptionPane.INFORMATION_MESSAGE);
			telefono = JOptionPane.showInputDialog(null,"Ingresa telefono","telefono",JOptionPane.INFORMATION_MESSAGE);
			rfc = JOptionPane.showInputDialog(null,"Ingresa rfc","rfc",JOptionPane.INFORMATION_MESSAGE);
			nHabitaciones = JOptionPane.showInputDialog(null,"Ingresa numero de "
					+ "Habitaciones","Nombre nnumero de Habitaciones",JOptionPane.INFORMATION_MESSAGE);
			tHabitaciones = JOptionPane.showInputDialog(null,"Ingresa tipo de Habitaciones","tipo de Habitaciones",JOptionPane.INFORMATION_MESSAGE);
			categoria = JOptionPane.showInputDialog(null,"Ingresa categoria","categoria",JOptionPane.INFORMATION_MESSAGE);
			h1.setNombre(nombre);
			h1.setDireccion(direccion);
			h1.setTelefono(telefono);
			h1.setnHabitaciones(nHabitaciones);
			h1.settHabitaciones(tHabitaciones);
			h1.setCategoria(categoria);
			}
			break;
		case 2: JOptionPane.showMessageDialog(null, h1.toString() ,"Informacion del Huesped",JOptionPane.INFORMATION_MESSAGE);
		
			
			break;
		case 3:h1.RentarHabitacion();
			
			break;
		case 4:h1.DejarHabitacion();
			
			break;
		case 5:h1.ComerHotel();
			
			break;
		case 6:h1.Jugar();
			
			break;
		case 7:System.exit(0);
		
		break;

		default:JOptionPane.showMessageDialog(null, "Opcion incorrecta"
				+ "","Error",JOptionPane.ERROR_MESSAGE);
		}
		}while(opc!=7);
	
	}

}
