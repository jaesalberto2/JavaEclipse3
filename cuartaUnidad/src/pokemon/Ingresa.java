package pokemon;

import javax.swing.JOptionPane;

public class Ingresa {
	
	String nombre; 
	double peso; 
	int edad;
	String sexo;
	String habitat;
	String tamaño;
	String habilidad;
	
	Fichero f = new Fichero();
	
	String alimentacion,poder;
	
	public void ingresaPidgey() {
		
		String garras;
		String vista;
		
		nombre = JOptionPane.showInputDialog(null,""
				+ "Ingresa nombre","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		peso =Double.parseDouble(JOptionPane.showInputDialog(null,""
				+ "Ingresa peso","Pidgey",JOptionPane.INFORMATION_MESSAGE));
		edad =Integer.parseInt( JOptionPane.showInputDialog(null,""
				+ "Ingresa edad","Pidgey",JOptionPane.INFORMATION_MESSAGE));
		sexo = JOptionPane.showInputDialog(null,""
				+ "Ingresa sexo","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		habitat = JOptionPane.showInputDialog(null,""
				+ "Ingresa habitat","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		tamaño = JOptionPane.showInputDialog(null,""
				+ "Ingresa tamaño","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		habilidad = JOptionPane.showInputDialog(null,""
				+ "Ingresa habilidad","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		garras  = JOptionPane.showInputDialog(null,""
				+ "Ingresa garras","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		vista  = JOptionPane.showInputDialog(null,""
				+ "Ingresa vista","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		Pidgey p = new Pidgey(nombre,  peso,  edad,  sexo,  habitat,  tamaño,  habilidad,
			 garras,  vista);
		f.ingresapidgey(p);
		
	}
	
	
	public void ingresaZubat() {
		
		int longevidad;
		String veneno;
		
		nombre = JOptionPane.showInputDialog(null,""
				+ "Ingresa nombre","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		peso =Double.parseDouble(JOptionPane.showInputDialog(null,""
				+ "Ingresa peso","Pidgey",JOptionPane.INFORMATION_MESSAGE));
		edad =Integer.parseInt( JOptionPane.showInputDialog(null,""
				+ "Ingresa edad","Pidgey",JOptionPane.INFORMATION_MESSAGE));
		sexo = JOptionPane.showInputDialog(null,""
				+ "Ingresa sexo","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		habitat = JOptionPane.showInputDialog(null,""
				+ "Ingresa habitat","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		tamaño = JOptionPane.showInputDialog(null,""
				+ "Ingresa tamaño","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		habilidad = JOptionPane.showInputDialog(null,""
				+ "Ingresa habilidad","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		longevidad  =Integer.parseInt( JOptionPane.showInputDialog(null,""
				+ "Ingresa longevidad","Pidgey",JOptionPane.INFORMATION_MESSAGE));
		veneno  = JOptionPane.showInputDialog(null,""
				+ "Ingresa veneno","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		Zubat z = new Zubat( nombre,  peso,  edad,  sexo,  habitat,  tamaño,  habilidad,
				 longevidad,  veneno);
	
		f.ingresaZubat(z);
		
	}
	
	public void ingresaPikachu() {
		
		String colorPiel;
		
		
		nombre = JOptionPane.showInputDialog(null,""
				+ "Ingresa nombre","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		peso =Double.parseDouble(JOptionPane.showInputDialog(null,""
				+ "Ingresa peso","Pidgey",JOptionPane.INFORMATION_MESSAGE));
		edad =Integer.parseInt( JOptionPane.showInputDialog(null,""
				+ "Ingresa edad","Pidgey",JOptionPane.INFORMATION_MESSAGE));
		sexo = JOptionPane.showInputDialog(null,""
				+ "Ingresa sexo","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		habitat = JOptionPane.showInputDialog(null,""
				+ "Ingresa habitat","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		alimentacion = JOptionPane.showInputDialog(null,""
				+ "Ingresa alimentacion","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		poder = JOptionPane.showInputDialog(null,""
				+ "Ingresa habilidad","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		colorPiel  = JOptionPane.showInputDialog(null,""
				+ "Ingresa color de piel","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		
		Pikachu p = new Pikachu( nombre,  peso,  edad,  sexo,  habitat,  alimentacion,  poder,
				 colorPiel);
	
		f.ingresaPikachu(p);
	}
	
	public void ingresaPichu() {
		
		String colorPelo;
		
		
		nombre = JOptionPane.showInputDialog(null,""
				+ "Ingresa nombre","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		peso =Double.parseDouble(JOptionPane.showInputDialog(null,""
				+ "Ingresa peso","Pidgey",JOptionPane.INFORMATION_MESSAGE));
		edad =Integer.parseInt( JOptionPane.showInputDialog(null,""
				+ "Ingresa edad","Pidgey",JOptionPane.INFORMATION_MESSAGE));
		sexo = JOptionPane.showInputDialog(null,""
				+ "Ingresa sexo","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		habitat = JOptionPane.showInputDialog(null,""
				+ "Ingresa habitat","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		alimentacion = JOptionPane.showInputDialog(null,""
				+ "Ingresa alimentacion","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		poder = JOptionPane.showInputDialog(null,""
				+ "Ingresa habilidad","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		colorPelo  = JOptionPane.showInputDialog(null,""
				+ "Ingresa color de piel","Pidgey",JOptionPane.INFORMATION_MESSAGE);
		
		Pichu p = new Pichu( nombre,  peso,  edad,  sexo,  habitat,  alimentacion,  poder,
				 colorPelo);
	
		f.ingresaPichu(p);
	}
	
	

}
