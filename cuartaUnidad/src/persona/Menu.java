package persona;

import javax.swing.JOptionPane;

public class Menu {
	public void menuPrincipal() {
		Ingresa i = new Ingresa();
		
		int opc;
		do {
		opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
		+ "1.-Estudiante\n2.-Maestro\n3.-Directivo\n4.-Salir"
		+ "","Menu Principal",JOptionPane.INFORMATION_MESSAGE));
		
		switch (opc) {
		case 1:{i.ingresaPersona();
		i.ingresaEstudiante();}
			
			break;
		case 2:{
			i.ingresaPersona();
			i.ingresaMaestro();
		}
			
			break;
		case 3:{
			i.ingresaPersona();
			i.ingresaDirectivo();
		}
			
			break;
		case 4:System.exit(0);
			
		

		default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
				+ "","Error",JOptionPane.ERROR_MESSAGE);

			break;
		}
		
		}while(opc!=0);//Remplazar
	}
	
	
	
	


}
