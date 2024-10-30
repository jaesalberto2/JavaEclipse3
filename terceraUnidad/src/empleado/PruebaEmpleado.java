package empleado;

import javax.swing.JOptionPane;

public class PruebaEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado1 =new Empleado("Gian Luka","Guerron","gian@gmail.com"
				+ "","Italianis",2500,"chef",38,"Masculino",120,"Italiano");
		
		JOptionPane.showMessageDialog(null, empleado1.imprime(),""
				+ "Datos del Empleado",JOptionPane.INFORMATION_MESSAGE);
	}

}
