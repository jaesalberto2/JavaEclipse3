package prueba;

import javax.swing.JOptionPane;

public class Ingresa {
	String a;
	String b; 
	String c; 
	String d;
	String e; 
	String f;
	
	public void ingresaPrueba() {
		a=	JOptionPane.showInputDialog(null,""
				+ "a","",JOptionPane.INFORMATION_MESSAGE);
		b=	JOptionPane.showInputDialog(null,""
				+ "a","",JOptionPane.INFORMATION_MESSAGE);
		
		c=	JOptionPane.showInputDialog(null,""
				+ "a","",JOptionPane.INFORMATION_MESSAGE);
		
		d=	JOptionPane.showInputDialog(null,""
				+ "a","",JOptionPane.INFORMATION_MESSAGE);
		
		e=	JOptionPane.showInputDialog(null,""
				+ "a","",JOptionPane.INFORMATION_MESSAGE);
		
		f=	JOptionPane.showInputDialog(null,""
				+ "a","",JOptionPane.INFORMATION_MESSAGE);
	
		Prueba p = new Prueba(a,b,c,d,e,f);
		

	}

}
