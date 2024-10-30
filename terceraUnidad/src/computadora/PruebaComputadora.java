package computadora;

import javax.swing.JOptionPane;

public class PruebaComputadora {

	public static void main(String[] args) {
		Computadora com1=new Computadora("Dell","Inspiron","Intel core I7",512,1080,15000,2.5,12,456248);
		Computadora com2=new Computadora("HP","probook","AMD",256,1920,6449,3.5,16,4687516);
		Computadora com3=new Computadora("Lenovo","Ideapad","Intel core I3",256,1080,7526,2.8,8,5468751);
		JOptionPane.showMessageDialog(null, com1.toString(),"Computadora 1"
				+ "",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, com2.toString(),"Computadora 2"
				+ "",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, com3.toString(),"Computadora 3"
				+ "",JOptionPane.INFORMATION_MESSAGE);
		
		com1.setCosto(13500);
		com1.setHd(1024);
		com2.setPantalla(1080);
		com2.setProcesador("Core I3");
		com3.setSerie(4561258);
		com3.setPeso(2.3);
		
		JOptionPane.showMessageDialog(null, com1.toString(),"Computadora 1 Modificada"
				+ "",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, com2.toString(),"Computadora 2 Modificada"
				+ "",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, com3.toString(),"Computadora 3 Modificada"
				+ "",JOptionPane.INFORMATION_MESSAGE);
		com1.Encender();
		com2.Apagar();
		com3.Procesar();
		com1.Imprime();
	}

}
