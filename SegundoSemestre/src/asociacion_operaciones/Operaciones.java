package asociacion_operaciones;

import javax.swing.JOptionPane;

public class Operaciones {
	public int Suma(int x,int y){
		return(x+y);
	}
	public int Resta(int x,int y){
		return(x-y);
	}
	public int Multiplicacion(int x,int y){
		return(x*y);
	}
	public int Residuo(int x,int y){
		return(x%y);
	}
	public double Division(int x,int y){
		if(y==0) {
			JOptionPane.showConfirmDialog(null, ""
					+ "Operacion Invalida","Division por cero",JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		return(x/y);
	}

}
