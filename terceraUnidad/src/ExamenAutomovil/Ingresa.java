package ExamenAutomovil;

import javax.swing.JOptionPane;

public class Ingresa {

	public Automovil ingresa() {
		String name="", apellido="",edad="",escuderia="", puntaje="",email="",patrocinador="";

		String nameE="",apellidoE="",edadE="",sexo="",phone="",emailE="",direccion="";
	
		
		String motor="",color="",numero="",velocidad="",modelo="",fabricante="",campeonatos="";
		
			//		String name, apellido,edad,escuderia, puntaje,email,patrocinador;
		name=JOptionPane.showInputDialog(null,""
		+ "Ingresa nombre","Piloto",JOptionPane.INFORMATION_MESSAGE);
		apellido=JOptionPane.showInputDialog(null,""
				+ "Ingresa apellido","Piloto",JOptionPane.INFORMATION_MESSAGE);
		edad=JOptionPane.showInputDialog(null,""
				+ "Ingresa edad","Piloto",JOptionPane.INFORMATION_MESSAGE);
		escuderia=JOptionPane.showInputDialog(null,""
				+ "Ingresa escuderia","Piloto",JOptionPane.INFORMATION_MESSAGE);
		puntaje=JOptionPane.showInputDialog(null,""
				+ "Ingresa puntaje","Piloto",JOptionPane.INFORMATION_MESSAGE);
		email=JOptionPane.showInputDialog(null,""
				+ "Ingresa email","Piloto",JOptionPane.INFORMATION_MESSAGE);
		patrocinador=JOptionPane.showInputDialog(null,""
				+ "Ingresa patrocinador","Piloto",JOptionPane.INFORMATION_MESSAGE);
		Piloto piloto = new Piloto(name, apellido,Integer.parseInt(edad),escuderia,Integer.parseInt(puntaje),email,patrocinador);
		
		//Entrenador
		
		nameE=JOptionPane.showInputDialog(null,""
				+ "Ingresa nombre","Entrenador",JOptionPane.INFORMATION_MESSAGE);
		apellidoE=JOptionPane.showInputDialog(null,""
				+ "Ingresa apellido","Entrenador",JOptionPane.INFORMATION_MESSAGE);
		edadE=JOptionPane.showInputDialog(null,""
				+ "Ingresa edad","Entrenador",JOptionPane.INFORMATION_MESSAGE);
		sexo=JOptionPane.showInputDialog(null,""
				+ "Ingresa sexo","Entrenador",JOptionPane.INFORMATION_MESSAGE);
		phone=JOptionPane.showInputDialog(null,""
				+ "Ingresa telefono","Entrenador",JOptionPane.INFORMATION_MESSAGE);
		emailE=JOptionPane.showInputDialog(null,""
				+ "Ingresa email","Entrenador",JOptionPane.INFORMATION_MESSAGE);
		direccion=JOptionPane.showInputDialog(null,""
				+ "Ingresa direccion","Entrenador",JOptionPane.INFORMATION_MESSAGE);
		Entrenador entrenador=new Entrenador(name,apellido,Integer.parseInt(edadE),sexo,Integer.parseInt(phone),email,direccion);
		
		//Automovil
		
		motor=JOptionPane.showInputDialog(null,""
				+ "Ingresa motor","Automovil",JOptionPane.INFORMATION_MESSAGE);
		
		color=JOptionPane.showInputDialog(null,""
				+ "Ingresa color","Automovil",JOptionPane.INFORMATION_MESSAGE);
		numero=JOptionPane.showInputDialog(null,""
				+ "Ingresa numero","Automovil",JOptionPane.INFORMATION_MESSAGE);
		velocidad=JOptionPane.showInputDialog(null,""
				+ "Ingresa velocidad","Automovil",JOptionPane.INFORMATION_MESSAGE);
		modelo=JOptionPane.showInputDialog(null,""
				+ "Ingresa modelo","Automovil",JOptionPane.INFORMATION_MESSAGE);
		fabricante=JOptionPane.showInputDialog(null,""
				+ "Ingresa fabricante","Automovil",JOptionPane.INFORMATION_MESSAGE);
		campeonatos=JOptionPane.showInputDialog(null,""
				+ "Ingresa campeonatos","Automovil",JOptionPane.INFORMATION_MESSAGE);
		
		Automovil automovil = new Automovil(piloto,entrenador,motor,color,Integer.parseInt(numero),Float.parseFloat(velocidad),modelo,fabricante,campeonatos);
		return automovil;
	}
}
