package asociacion_operaciones_arreglos;

import javax.swing.JOptionPane;

public class MenuOperaciones {
	public void menu() {
		int opc=0;
		//Instanciar a la clase Operaciones
		Operaciones o = new Operaciones();
		int x[]=new int[5];
		int y[]=new int[5];
		 do{
			opc=Integer.parseInt(JOptionPane.showInputDialog(null,""
					+ "1.-Inicializar Arreglos\n"
					+ "2.-Suma\n3.-Resta\n4.-Multiplicacion\n5.-Intercalacion"
					+ "\n6.-Salir"));
			switch (opc) {
			case 1:
			{
				for(int i=0; i< x.length; i++)
				{
					x[i]=(int)(Math.random()*10+1);
					y[i]=(int)(Math.random()*10+1);
				}
				JOptionPane.showMessageDialog(null, "Arrreglos inicializados"
						+ "","Inicializacion de arreglos",JOptionPane.INFORMATION_MESSAGE);
				
			}
				
				break;
			case 2: o.suma(x, y);
				
				break;
			case 3: o.resta(x, y);
				
				break;
			case 4:o.multiplicacion(x, y);
				
				break;
			case 5:o.intercalacion(x, y);
				
				break;
			case 6:System.exit(0);
				

			default: JOptionPane.showMessageDialog(null, "Opcion incorrecta","ERROR!!",JOptionPane.ERROR_MESSAGE);
				
			}
		}while(opc!=6); 
	}

}
