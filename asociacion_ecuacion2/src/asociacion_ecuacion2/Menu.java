package asociacion_ecuacion2;

import javax.swing.JOptionPane;

public class Menu {
public void menu() {
	int opc;
	int x[]=new int[5];
	int y[]=new int[5];
	//instanciar a la clase Ecuacion
	Ecuacion e = new Ecuacion();
	
	do {
	opc=Integer.parseInt(JOptionPane.showInputDialog(null,""
			+ "1.-Inicializacion de arreglos\n2.-Resuelve ecuacion\n"
			+ "3.-Salir","Menu principal",JOptionPane.INFORMATION_MESSAGE));
	switch (opc) {
	case 1:
	{
		for(int i=0;i<x.length;i++) {
			x[i]=(int)(Math.random()*10+1);
			y[i]=(int)(Math.random()*10+1);
		}
		JOptionPane.showMessageDialog(null, "Los arreglos han sido inicializados"
				+ "","Inicializacion de arreglos",JOptionPane.INFORMATION_MESSAGE);
	}
		
		break;
	case 2:
		e.ecuacion(x, y);
		
		
		break;
	case 3: System.exit(0);
		
		

	default: JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
			+ "","Error",JOptionPane.ERROR_MESSAGE);
	}
	}while(opc!=3);
}
}
