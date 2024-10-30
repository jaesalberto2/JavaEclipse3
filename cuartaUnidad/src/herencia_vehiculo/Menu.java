package herencia_vehiculo;

import javax.swing.JOptionPane;

public class Menu {

	public void menu() {
		int opc;
		Ingresa i = new Ingresa();//Instanciar a la calse ingresa
		do
		{
		opc = Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Turismo\n2.-"
				+ "Deportivo\n3.-Furgoneta\n4.-Salir"
		+ "","Menu Principal",JOptionPane.INFORMATION_MESSAGE));
		
			switch (opc) {
			case 1:
				
				break;
			case 2:i.ingresaDeportivo();
				
				break;
			case 3:i.ingresaFurgoneta();
				
				break;
			case 4:System.exit(0);
				
				

			default: JOptionPane.showInputDialog(null,"Opcion Incorrecta"
					+ "","Error",JOptionPane.INFORMATION_MESSAGE);
				break;
				
				
			}
		}while(opc!=3);
	}
}
