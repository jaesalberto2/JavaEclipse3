package pokemon;

import javax.swing.JOptionPane;

public class Menu {
	//Menu
	Ingresa i = new Ingresa();
	Muestra m = new Muestra();
	public void menuPrincipal() {
	int opc;
	do {
	opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
	+ "1.-Ingresar datos\n2.-Muestra datos\n3.-Salir","Menu Principal",JOptionPane.INFORMATION_MESSAGE));
	
	switch (opc) {
	case 1:menuIngresa();
		
		break;
	case 2:menuMuestra();
		
		break;
	case 3: System.exit(0);
		
		break;

	default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
			+ "","Error",JOptionPane.ERROR_MESSAGE);
		break;
	}
	
	}while(opc!=0);//Remplazar
	}
	
	public void menuIngresa() {
		//Menu
		int opc;
		do {
		opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
		+ "1.-Pigey\n2.-Zubat\n3.-Pikachu\n4.-Pichu\n5.-regresar","Menu Ingresa",JOptionPane.INFORMATION_MESSAGE));
		
		switch (opc) {
		case 1: i.ingresaPidgey();
			
			break;
		case 2:i.ingresaZubat();
			
			break;
		case 3:i.ingresaPikachu();
	
	break;
		case 4:i.ingresaPichu();
	
	break;
		case 5: menuPrincipal();
	
	break;

		default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
				+ "","Error",JOptionPane.ERROR_MESSAGE);
			break;
		}
		
		}while(opc!=0);//Remplazar
	}
	public void menuMuestra(){
		//Menu
		int opc;
		do {
		opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
		+ "1.-Pigey\n2.-Zubat\n3.-Pikachu\n4.-Pichu\n5.-regresar","Menu Ingresa",JOptionPane.INFORMATION_MESSAGE));
		
		switch (opc) {
		case 1:m.muestraPidgey();
			
			break;
		case 2:m.muestraZubat();
			
			break;
		case 3:m.muestraPikachu();
	
	break;
		case 4:m.muestraPichu();
	
	break;
		case 5: menuPrincipal();
	
	break;

		default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
				+ "","Error",JOptionPane.ERROR_MESSAGE);
			break;
		}
		
		}while(opc!=0);//Remplazar
		
	}

}
