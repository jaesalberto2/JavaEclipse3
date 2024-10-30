package vehiculo;

import javax.swing.JOptionPane;

public class Ingresa {
	
	public Vehiculo IngresaDatos() {
		//Chofer
		String name, apellido, direccion,email;
		int edad;
		float salario;
		
		//empresa
		String nameEmpresa,direccionEmpresa,rfc,www;
		
		//Vehiculo
		Chofer chofer = new Chofer(null,null,null,null,0,0);
		Empresa empresa = new Empresa(null,null,null,null) ;
		String marca="", matricula="", modelo="", color="";
		
		
		//objeto Vehiculo
		Vehiculo vehiculo = new Vehiculo(chofer,
				empresa,marca, matricula, modelo, color);
		
		//Ingresar datos chofer
		name = JOptionPane.showInputDialog(null,"Ingresa nombre del chofer"
		+ "","Nombre del chofer",JOptionPane.INFORMATION_MESSAGE);
		
		apellido = 	JOptionPane.showInputDialog(null,""
				+ "Ingresa apellido","Apellido"
						+ "",JOptionPane.INFORMATION_MESSAGE);
		
		direccion =	JOptionPane.showInputDialog(null,""
				+ "Ingresa direccion","Direccion"
						+ "",JOptionPane.INFORMATION_MESSAGE);
		
		email = JOptionPane.showInputDialog(null,""
				+ "Ingresa e-mail","e-mail"
						+ "",JOptionPane.INFORMATION_MESSAGE);
		
		edad = Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "Ingresa edad","Edad"
						+ "",JOptionPane.INFORMATION_MESSAGE));
		
		salario = Float.parseFloat(JOptionPane.showInputDialog(null,""
				+ "Ingresa salario","Salario"
						+ "",JOptionPane.INFORMATION_MESSAGE));
		//Ingresa datos Empresa
		
		nameEmpresa = JOptionPane.showInputDialog(null,""
				+ "Ingresa nombre ","Nombre de empresa"
						+ "",JOptionPane.INFORMATION_MESSAGE);
		
		direccionEmpresa = JOptionPane.showInputDialog(null,""
				+ "Ingresa direccion","Direccion de empresa"
						+ "",JOptionPane.INFORMATION_MESSAGE);
		
		rfc= JOptionPane.showInputDialog(null,""
				+ "Ingresa RFC","RFC"
						+ "",JOptionPane.INFORMATION_MESSAGE);
		
		www= JOptionPane.showInputDialog(null,""
				+ "Ingresa sitio web","Sitio web"
						+ "",JOptionPane.INFORMATION_MESSAGE);
		//asignando valores a chofer
	
		chofer.setName(name);
		chofer.setApellido(apellido);
		chofer.setDireccion(direccion);
		chofer.setEmail(email);
		chofer.setEdad(edad);
		chofer.setSalario(salario);
		
		//asignando valores a empresa
		
		/*
		 * nameEmpresa,direccionEmpresa,rfc,www;
		 */
		empresa.setName(nameEmpresa);
		empresa.setDireccion(direccionEmpresa);
		empresa.setRfc(rfc);
		empresa.setWww(www);
		
		//ingresar datos de Vehiculo
		marca=	JOptionPane.showInputDialog(null,""
				+ "Ingresa marca","Marca de Vehiculo"
						+ "",JOptionPane.INFORMATION_MESSAGE);
		
		matricula= JOptionPane.showInputDialog(null,""
				+ "Ingres matricula","Matricula de vehiculo"
						+ "",JOptionPane.INFORMATION_MESSAGE);
		
		modelo=	JOptionPane.showInputDialog(null,""
				+ "Ingresa modelo","Modelode vehiculo"
						+ "",JOptionPane.INFORMATION_MESSAGE);
		
		color=	JOptionPane.showInputDialog(null,""
				+ "Ingresa color","Color de vehiculo"
						+ "",JOptionPane.INFORMATION_MESSAGE);
		
		//asignar valores a Vehiculo
		
		
		vehiculo.setChofer(chofer);
		vehiculo.setEmpresa(empresa);
		vehiculo.setMarca(marca);
		vehiculo.setMatricula(matricula);
		vehiculo.setModelo(modelo);
		vehiculo.setColor(color);
		
		return vehiculo;
		
		
	}

}
