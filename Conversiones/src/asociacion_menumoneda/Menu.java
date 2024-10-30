package asociacion_menumoneda;

import javax.swing.JOptionPane;

public class Menu {
	
	public void Menu1() {
		int opc;
		do {
		opc = Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Peso a Dolar"
				+ "\n2.-Dolar a Peso\n3.-Peso a Euro\n4.-Euro a Peso\n5.-Peso a Yen"
				+ "\n6.-Yen a Peso\n7.-Salir","Conversiones",JOptionPane.INFORMATION_MESSAGE));
		switch (opc) {
		case 1:
			
			break;

		case 2:
			
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
			

		default:JOptionPane.showConfirmDialog(null, "Opcion incorrecta","ERROR",JOptionPane.ERROR_MESSAGE);
			break;
		}
		}while(opc!=7);
	}

}
