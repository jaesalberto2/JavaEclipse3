package vendedor;

import javax.swing.JOptionPane;

public class PruebaVendedor {

	public static void main(String[] args) {
		String nombre, apellido, direccion,comision,rfc,correo;
		int ventas;
		int opc;
		Vendedor v = new Vendedor(null,null,null,null,null,null,0);
	
		do{
			
			opc =Integer.parseInt(JOptionPane.showInputDialog(null,""
			+ "1.-Ingresar Datos\n2.-Imprimir Datos\n3.-Vender\n4.-Cobrar"
			+ "\n5.-Promocion\n6.-Salir","Menu Vendedor"
					+ "",JOptionPane.INFORMATION_MESSAGE));

			switch (opc) {
			case 1:
			{
				nombre = JOptionPane.showInputDialog(null,""
						+ "Ingresa nombre","Nombre",JOptionPane.INFORMATION_MESSAGE);

				apellido = JOptionPane.showInputDialog(null,"Ingresa apellido"
						+ "","Apellido",JOptionPane.INFORMATION_MESSAGE);

				direccion = JOptionPane.showInputDialog(null,"Ingresa direccion"
						+ "","Direccion",JOptionPane.INFORMATION_MESSAGE);

				comision = JOptionPane.showInputDialog(null,"Ingresa comision"
						+ "","Comision",JOptionPane.INFORMATION_MESSAGE);

				rfc = JOptionPane.showInputDialog(null,"Ingresa rfc"
						+ "","RFC",JOptionPane.INFORMATION_MESSAGE);
				
				correo = JOptionPane.showInputDialog(null,""
						+ "Ingresa correo","Correo",JOptionPane.INFORMATION_MESSAGE);
				ventas = Integer.parseInt(JOptionPane.showInputDialog(null,""
						+ "Ingresa ventas","Ventas",JOptionPane.INFORMATION_MESSAGE));
				
				v.setNombre(nombre);
				v.setApellido(apellido);
				v.setDireccion(direccion);
				v.setComision(comision);
				v.setRfc(rfc);
				v.setCorreo(correo);
				v.setVentas(ventas);

				
			}
				break;
			case 2: JOptionPane.showMessageDialog(null, v.toString(),"Vendedor"
					+ "",JOptionPane.INFORMATION_MESSAGE);

				
				break;

			case 3:v.Vender();
				
				break;


			case 4:v.Cobrar();
				
				break;


			case 5:v.Promocion();
				
				break;


			case 6: System.exit(0);
				
				


			default:JOptionPane.showMessageDialog(null, "Opcion incorrecta"
					+ "","Error",JOptionPane.ERROR_MESSAGE);
				
			}
		}while(opc!=0);
	}

}
