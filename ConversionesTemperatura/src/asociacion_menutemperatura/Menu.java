package asociacion_menutemperatura;

import javax.swing.JOptionPane;

import asociacion_temperatura.Temperatura;

public class Menu {
	
	public void menu() {
		int opc;
		Temperatura t = new Temperatura();
		double grados=0;
		
		do {
		opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "1.-Centigrados-Fahrenheit"
				+ "\n2.-Fahrenheit - Centigrados"
				+ "\n3.-Centigrados - Kelvin"
				+ "\n4.-Kelvin - centigrados"
				+ "\n5.-Centigrados - Rankin"
				+ "\n6.-Rankin - Centigrados"
				+ "\n7.-Salir","Menu Principal Temperaturas"
						+ "",JOptionPane.INFORMATION_MESSAGE));
		switch (opc) {
		case 1:
			grados = Double.parseDouble(JOptionPane.showInputDialog(null,""
					+ "Ingresa valor","Grados a Fahrenheit",JOptionPane.INFORMATION_MESSAGE));
			JOptionPane.showMessageDialog(null, t.centFahrenheit(grados),""
					+ "Grados Fahrenheit",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			grados = Double.parseDouble(JOptionPane.showInputDialog(null,""
					+ "Ingresa valor","Fahrenheit a Grados ",JOptionPane.INFORMATION_MESSAGE));
			JOptionPane.showMessageDialog(null, t.farenheitCent(grados),""
					+ "Grados Centigrados",JOptionPane.INFORMATION_MESSAGE);
			
			break;
		case 3:
			grados = Double.parseDouble(JOptionPane.showInputDialog(null,""
					+ "Ingresa valor","Centigrados a Kelvin ",JOptionPane.INFORMATION_MESSAGE));
			JOptionPane.showMessageDialog(null, t.centKelvin(grados),""
					+ "Grados kelvin",JOptionPane.INFORMATION_MESSAGE);
			
			break;
		case 4:
			grados = Double.parseDouble(JOptionPane.showInputDialog(null,""
					+ "Ingresa valor","kelvin a Grados ",JOptionPane.INFORMATION_MESSAGE));
			JOptionPane.showMessageDialog(null, t.kelvinCent(grados),""
					+ "Grados Centigrados",JOptionPane.INFORMATION_MESSAGE);
			
			break;
		case 5:
			grados = Double.parseDouble(JOptionPane.showInputDialog(null,""
					+ "Ingresa valor","Grados a Rankin ",JOptionPane.INFORMATION_MESSAGE));
			JOptionPane.showMessageDialog(null, t.centRankin(grados),""
					+ "Grados Rankin",JOptionPane.INFORMATION_MESSAGE);
			
			break;
		case 6:
			grados = Double.parseDouble(JOptionPane.showInputDialog(null,""
					+ "Ingresa valor","Rankin a Grados ",JOptionPane.INFORMATION_MESSAGE));
			JOptionPane.showMessageDialog(null, t.rankinCent(grados),""
					+ "Grados Centigrados",JOptionPane.INFORMATION_MESSAGE);
			
			break;
		case 7:System.exit(0);
			
			

		default: JOptionPane.showConfirmDialog(null, ""
				+ "opcion incorrecta","Error",JOptionPane.ERROR_MESSAGE);
			break;
		}
		}while(opc!=7);
	}

}
