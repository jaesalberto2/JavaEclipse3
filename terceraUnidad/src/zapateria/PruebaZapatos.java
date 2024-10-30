package zapateria;

import javax.swing.JOptionPane;

public class PruebaZapatos {

	public static void main(String[] args) {
		String nombre, marca ,color,modelo,genero;
		int medida,opc;
		double precio;
		Zapateria z = new Zapateria(null,null,null,null,null,0,0);
		
		
		do {
		
		opc =Integer.parseInt(JOptionPane.showInputDialog(null,""
		+ "1.-Ingresar Datos\n2.-Imprimir Datos\n3.-Comprar\n4.-Medir"
		+ "\n5.-Caminar\n6.-Salir","Menu Zapateria"
				+ "",JOptionPane.INFORMATION_MESSAGE));

		switch (opc) {
		case 1:
		{
			nombre = JOptionPane.showInputDialog(null,""
					+ "Ingresa nombre","Nombre",JOptionPane.INFORMATION_MESSAGE);

			marca = JOptionPane.showInputDialog(null,"Ingresa marca"
					+ "","Marca",JOptionPane.INFORMATION_MESSAGE);

			color = JOptionPane.showInputDialog(null,"Ingresa color"
					+ "","Color",JOptionPane.INFORMATION_MESSAGE);

			modelo = JOptionPane.showInputDialog(null,"Ingresa modelo"
					+ "","Modelo",JOptionPane.INFORMATION_MESSAGE);

			genero = JOptionPane.showInputDialog(null,"Ingresa genero"
					+ "","Genero",JOptionPane.INFORMATION_MESSAGE);
			
			medida = Integer.parseInt(JOptionPane.showInputDialog(null,""
					+ "Ingresa medida","Medida",JOptionPane.INFORMATION_MESSAGE));
			precio = Double.parseDouble(JOptionPane.showInputDialog(null,""
					+ "Ingresa precio","Precio",JOptionPane.INFORMATION_MESSAGE));
			z.setColor(color);
			z.setNombre(nombre);
			z.setMarca(marca);
			z.setModelo(modelo);
			z.setGenero(genero);
			z.setMedida(medida);
			z.setPrecio(precio);
			
		}
			break;
		case 2: JOptionPane.showMessageDialog(null, z.toString(),"Zapateria"
				+ "",JOptionPane.INFORMATION_MESSAGE);

			
			break;

		case 3:z.Comprar();
			
			break;


		case 4:z.Medir();
			
			break;


		case 5:z.Caminar();
			
			break;


		case 6: System.exit(0);
			
			


		default:JOptionPane.showMessageDialog(null, "Opcion incorrecta"
				+ "","Error",JOptionPane.ERROR_MESSAGE);
			
		}
		
		

		}while(opc!=6);

	}

}
