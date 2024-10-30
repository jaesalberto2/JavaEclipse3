package serializable;

import javax.swing.JOptionPane;

public class Menu {
	Ingresa i =new Ingresa();
	Consulta c = new Consulta();
	
	public void menuPrincipal() {
		int opc;
		
		do {
		opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "1.-Ingresa Datos\n2.-Muestra Datos\n3.-Salir","Menu principal"
						+ "",JOptionPane.INFORMATION_MESSAGE));

			switch (opc) {
			case 1:menuIngresa();
				
				break;
			case 2:menuMuestra();
				
				break;
			case 3:System.exit(0);
				
				break;

			default:JOptionPane.showMessageDialog(null, "Opcion incorrecta","ERROR"
					+ "",JOptionPane.ERROR_MESSAGE);
				break;
			}
		}while(opc!=3);
	}
	
	public void menuIngresa() {
		int opc;
		do {
		
		opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "1.-Deportivo\n2.-Furgoneta\n3.-Turismo\n4.-Regresa Menu Principal"
				+ "","Menu Ingresa"
						+ "",JOptionPane.INFORMATION_MESSAGE));

			switch (opc) {
			case 1:i.ingresaVehiculo();
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:menuPrincipal();
				
				break;

			default:JOptionPane.showMessageDialog(null, "Opcion incorrecta","ERROR"
					+ "",JOptionPane.ERROR_MESSAGE);
				break;
			}
		}while(opc!=4);
		
	}

		public void menuMuestra() {
	int opc;
	do {
	opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
			+ "1.-Deportivo\n2.-Furgoneta\n3.-Turismo\n4.-Regresa Menu Principal"
			+ "","Menu Muestra Datos"
					+ "",JOptionPane.INFORMATION_MESSAGE));

		switch (opc) {
		case 1:c.consultaDeportivo();
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:menuPrincipal();
			
			break;

		default:JOptionPane.showMessageDialog(null, "Opcion incorrecta","ERROR"
				+ "",JOptionPane.ERROR_MESSAGE);
			break;
		}
	}while(opc!=4);
	
}


}
