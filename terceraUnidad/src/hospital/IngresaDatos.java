package hospital;

import javax.swing.JOptionPane;

public class IngresaDatos {
	
	public Paciente ingresaDatos() {
		Medico medico = new Medico(null,null,null,null,null,0,0,0);
		
		String nameMedico,apellido,direccionMedico, emailMedico, especialidad;
		int edad, celula;
		double salario;
		
		Familiar familiar = new Familiar(null,null,null,null);
		
		String nameFamiliar,apellidoFamiliar,telefono,correo;
		
		Hospital hospital = new Hospital(null,null,null,null,0);
		
		String nameHospital,direccionHospital,rfc,www;
		int telefonoHospital;
		
		String name = null,direccion = null,padecimiento = null,nss = null,email = null,phone = null;
		Paciente paciente = new Paciente(medico,hospital,familiar,name,direccion,padecimiento,nss,email,phone);
		
		
		//Ingresar los Datos del medico
		
		nameMedico=JOptionPane.showInputDialog(null,""
				+ "Ingresa Nombre:","Medico",JOptionPane.INFORMATION_MESSAGE);
		apellido=JOptionPane.showInputDialog(null,""
				+ "Ingresa Apellido:","Medico",JOptionPane.INFORMATION_MESSAGE);
		direccionMedico=JOptionPane.showInputDialog(null,""
				+ "Ingresa Direccion:","Medico",JOptionPane.INFORMATION_MESSAGE);
		emailMedico=JOptionPane.showInputDialog(null,""
				+ "Ingresa e-mail:","Medico",JOptionPane.INFORMATION_MESSAGE);
		especialidad=JOptionPane.showInputDialog(null,""
				+ "Ingresa Especialidad:","Medico",JOptionPane.INFORMATION_MESSAGE);
		
		edad=Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "Ingresa Edad:","Medico",JOptionPane.INFORMATION_MESSAGE));
		celula=Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "Ingresa Celula:","Medico",JOptionPane.INFORMATION_MESSAGE));
		salario=Double.parseDouble(JOptionPane.showInputDialog(null,""
				+ "Ingresa Salario:","Medico",JOptionPane.INFORMATION_MESSAGE));
		
		//asignar valores a los atrributos de medico
		
		

		
		paciente.medico.setName(nameMedico);
		paciente.medico.setApellido(apellido);
		paciente.medico.setDireccion(direccionMedico);
		paciente.medico.setEmail(emailMedico);
		paciente.medico.setEspecialidad(especialidad);
		paciente.medico.setEdad(edad);
		paciente.medico.setCelula(celula);
		paciente.medico.setSalario(salario);
		
		//Ingresar datos de Hospital
		
		nameHospital=JOptionPane.showInputDialog(null,""
				+ "Ingresa Nombre:","Hospital",JOptionPane.INFORMATION_MESSAGE);
		direccionHospital=JOptionPane.showInputDialog(null,""
				+ "Ingresa Direccion:","Hospital",JOptionPane.INFORMATION_MESSAGE);
		rfc=JOptionPane.showInputDialog(null,""
				+ "Ingresa RFC:","Hospital",JOptionPane.INFORMATION_MESSAGE);
		www=JOptionPane.showInputDialog(null,""
				+ "Ingresa Sitio web:","Hospital",JOptionPane.INFORMATION_MESSAGE);
		telefonoHospital=Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "Ingresa Telefono:","Hospital",JOptionPane.INFORMATION_MESSAGE));
		
		//asignar atributos de Hospital
		
		paciente.hospital.setName(nameHospital);
		paciente.hospital.setDireccion(direccionHospital);
		paciente.hospital.setRfc(rfc);
		paciente.hospital.setWww(www);
		paciente.hospital.setTelefono(telefonoHospital);
		
		//Ingresar datos de familiar
		nameFamiliar=JOptionPane.showInputDialog(null,""
				+ "Ingresa Nombre:","Familiar",JOptionPane.INFORMATION_MESSAGE);
		apellidoFamiliar=JOptionPane.showInputDialog(null,""
				+ "Ingresa Apellido:","Familiar",JOptionPane.INFORMATION_MESSAGE);
		telefono=JOptionPane.showInputDialog(null,""
				+ "Ingresa Telefono:","Familiar",JOptionPane.INFORMATION_MESSAGE);
		correo=JOptionPane.showInputDialog(null,""
				+ "Ingresa Correo:","Familiar",JOptionPane.INFORMATION_MESSAGE);
		
		/*
		 * Asignar los atributos de familiar
		 */
		paciente.familiar.setName(nameFamiliar);
		paciente.familiar.setApellido(apellidoFamiliar);
		paciente.familiar.setTelefono(telefono);
		paciente.familiar.setCorreo(correo);
		
		//Ingresar valores de paciente
		
		name=JOptionPane.showInputDialog(null,""
				+ "Ingresa Nombre:","Paciente",JOptionPane.INFORMATION_MESSAGE);
		direccion=JOptionPane.showInputDialog(null,""
				+ "Ingresa Direccion:","Paciente",JOptionPane.INFORMATION_MESSAGE);
		padecimiento=JOptionPane.showInputDialog(null,""
				+ "Ingresa Padecimiento:","Paciente",JOptionPane.INFORMATION_MESSAGE);
		nss=JOptionPane.showInputDialog(null,""
				+ "Ingresa NSS:","Paciente",JOptionPane.INFORMATION_MESSAGE);
		email=JOptionPane.showInputDialog(null,""
				+ "Ingresa e-mail:","Paciente",JOptionPane.INFORMATION_MESSAGE);
		phone=JOptionPane.showInputDialog(null,""
				+ "Ingresa Telefono:","Paciente",JOptionPane.INFORMATION_MESSAGE);
		
		/*
		 * Asignar atributos de paciente
		 */
		
		paciente.setName(name);
		paciente.setDireccion(direccion);
		paciente.setPadecimiento(padecimiento);
		paciente.setNss(nss);
		paciente.setEmail(email);
		paciente.setPhone(phone);
		
		
		return paciente;
		
	}

}
