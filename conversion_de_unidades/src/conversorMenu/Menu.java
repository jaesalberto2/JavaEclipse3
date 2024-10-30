package conversorMenu;

import javax.swing.JOptionPane;

import conversor.Conversor;
import conversor.Conversor2;

public class Menu {
	public void menu() {
		int opc,opc2;
		double unidad,resultado=0;
		String cadena="";
		Conversor c1 =new Conversor();
		Conversor2 c2 = new Conversor2();
		
		do {
			//Primero convertimos de la unidad de medida a metros
		opc=Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "1.-Kilometro\n2.-Hectometro\n3.-Decametros\n4.-Metros"
				+ "\n5.-Decimetros\n6.-Centimetros\n7.-Milimetros\n8.-Salir",""
						+ "Ingrese la unidad de medida por convertir"
						+ "",JOptionPane.INFORMATION_MESSAGE));
		if(opc!=8) {
		unidad = Double.parseDouble(JOptionPane.showInputDialog(null,"Cantidad"
				+ "","Ingrese cantidad",JOptionPane.INFORMATION_MESSAGE));
		}else unidad=0;
		
		switch (opc) {
		case 1:unidad=c1.kilometrosMetros(unidad);
			
			break;
		case 2:unidad=c1.hectometrosMetros(unidad);
			
			break;
		case 3:unidad=c1.decametrosMetros(unidad);
			
			break;
		case 4:unidad=c1.decimetrosMetros(unidad);
			
			break;
		case 5:unidad=c1.metrosMetros(unidad);
			
			break;
		case 6:unidad=c1.centimetrosMetros(unidad);
			
			break;
		case 7:unidad=c1.milimetrosMetros(unidad);
			
			break;
		case 8: System.exit(0);
			
			
			

		default: JOptionPane.showMessageDialog(null, "Opcion incorrecta"
				+ "", "Error", JOptionPane.ERROR_MESSAGE);
			break;
		}
		//Despues convertimos de metros a la otra unidad de medida 
		opc2=Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "1.-Kilometro\n2.-Hectometro\n3.-Decametros\n4.-Metros"
				+ "\n5.-Decimetros\n6.-Centimetros\n7.-Milimetros\n8.-Salir",""
						+ "Ingrese la unidad de medida a convertir"
						+ "",JOptionPane.INFORMATION_MESSAGE));
		switch (opc2) {
		case 1:resultado=c2.metroskilometros(unidad);
		cadena = " Kilometros";
			
			break;
		case 2:resultado=c2.metrosHectometros(unidad);
		cadena = " Hectometros";
			
			break;
		case 3:resultado=c2.metrosDecametros(unidad);
		cadena = " Decametros";
			
			break;
		case 4:resultado=c2.metrosMetros(unidad);
		cadena = " Metros";	
			break;
		case 5:resultado=c2.metrosDecimetros(unidad);
		cadena = " Decimetros";
			break;
		case 6:resultado=c2.metrosCentimetros(unidad);
		cadena = " Centimetros";
			break;
		case 7:resultado=c2.metrosMilimetros(unidad);
		cadena = " Milimetros";
			break;
		case 8: System.exit(0);
			
			
			

		default: JOptionPane.showMessageDialog(null, "Opcion incorrecta"
				+ "", "Error", JOptionPane.ERROR_MESSAGE);
			break;
		}
		
		JOptionPane.showMessageDialog(null, resultado+cadena,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		
		}while(opc!=8);
	}
}
