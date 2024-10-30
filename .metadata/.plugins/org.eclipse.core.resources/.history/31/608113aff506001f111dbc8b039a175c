package herencia_seleccion;

import javax.swing.JOptionPane;

public class Menu {
	//Menu
	int opc;
	Ingresa i = new Ingresa();
	public void menuPrincipal() {
	do {
	opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
	+ "1.-Futbolista\n2.-Masajista\n3.-Entrenador\n4.-Salir"
	+ "","Menu Principal",JOptionPane.INFORMATION_MESSAGE));
	
	switch (opc) {
	case 1:{i.ingresaSeleccion();
		i.IngresaFutbolista();}
		
		break;
	case 2:{i.ingresaSeleccion();
	i.IngresaMasajista();
	}
		
		break;
	case 3:{i.ingresaSeleccion();
		i.IngresaEntrenador();
	
	}
		
		break;
	case 4: System.exit(0);
		
		break;

	default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
			+ "","Error",JOptionPane.ERROR_MESSAGE);
		break;
	}
	
	}while(opc!=4);//Remplazar

}
}
