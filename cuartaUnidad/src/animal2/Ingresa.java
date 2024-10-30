package animal2;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;




public class Ingresa {
	

	String name;
	double peso;
	int edad;
	Fichero f = new Fichero();

	
	String alimento;

	
	String habitat;
	String salidaCanino="Habitat" + "\t" + "Alimento" + "\t" + "Nombre"
			+ "" + "\t" + "Peso" + "\t" + "Edad" + "\n";

	
	Imprime i = new Imprime();
	
	JTextArea datos = new JTextArea();
	
	public void ingresaCanino() {
		name = JOptionPane.showInputDialog(null,""
				+ "Ingresa Nombre","Canino",JOptionPane.INFORMATION_MESSAGE);
		peso = Double.parseDouble(JOptionPane.showInputDialog(null,""
				+ "Ingresa Peso","Canino",JOptionPane.INFORMATION_MESSAGE));
		edad =Integer.parseInt( JOptionPane.showInputDialog(null,""
				+ "Ingresa Edad","Canino",JOptionPane.INFORMATION_MESSAGE));

		
		alimento = JOptionPane.showInputDialog(null,""
				+ "Ingresa Alimento","Canino",JOptionPane.INFORMATION_MESSAGE);

		
		habitat = JOptionPane.showInputDialog(null,""
				+ "Ingresa Habitat","Canino",JOptionPane.INFORMATION_MESSAGE);
	
		Canino c = new Canino( name,  peso,  edad, 
				 alimento,  habitat);
		salidaCanino += i.imprimeCanino(c);
		datos.setText(salidaCanino);
		JOptionPane.showMessageDialog(null, datos,"Informacion de Canino"
				+ "",JOptionPane.INFORMATION_MESSAGE);
		
		f.ingresaCanino(c);
		
		
		

	}

}
