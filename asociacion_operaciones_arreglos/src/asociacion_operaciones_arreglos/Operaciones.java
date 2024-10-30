package asociacion_operaciones_arreglos;

import javax.swing.JOptionPane;

public class Operaciones {
	public void suma(int x[],int y[]) {
		int z[]=new int[5];
		String resultado="";
		for (int i=0;i<x.length;i++) {
			z[i]=x[i]+y[i];
		}
		//muestra el resultado de la suma
		//concatenar los elementos de los arreglos en la variable resultado
		resultado+="x\t+\ty\t=\tz\n";
		for (int i=0;i<z.length;i++) {
			resultado += x[i]+"\t+"+y[i]+"\t=\t"+z[i]+"\n";
		}
		JOptionPane.showInternalMessageDialog(null, resultado,"Resultado de la suma",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void resta(int x[],int y[]) {
		int z[]=new int[5];
		String resultado="";
		for (int i=0;i<x.length;i++) {
			z[i]=x[i]-y[i];
		}
		//muestra el resultado de la suma
		//concatenar los elementos de los arreglos en la variable resultado
		resultado+="x\t-\ty\t=\tz\n";
		for (int i=0;i<z.length;i++) {
			resultado += x[i]+"\t-"+y[i]+"\t=\t"+z[i]+"\n";
		}
		JOptionPane.showInternalMessageDialog(null, resultado,"Resultado de la resta",JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	
	public void multiplicacion(int x[],int y[]) {
		int z[]=new int[5];
		String resultado="";
		for (int i=0;i<x.length;i++) {
			z[i]=x[i]*y[i];
		}
		//muestra el resultado de la suma
		//concatenar los elementos de los arreglos en la variable resultado
		
		resultado+="x\tX\ty\t=\tz\n";
		for (int i=0;i<z.length;i++) {
			resultado += x[i]+"\tX"+y[i]+"\t=\t"+z[i]+"\n";
		}
		JOptionPane.showInternalMessageDialog(null, resultado,"Resultado de la Multiplicacion",JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	
	public void intercalacion(int x[],int y[]) {
		int z[]=new int[10];
		String resultado="";
		for(int i=0,j=0;i<z.length;i+=2,j++)
		{
			z[i]=x[j];
		}
		for(int i=1,j=0;i<z.length;i+=2,j++)
		{
			z[i]=y[j];
		}
		
		//concatenar los arreglos x,y,z en resultado
		resultado+="Valores del arreglo X\n";
		resultado+="------------------------\n";
		for(int i=0;i<x.length;i++) {
			resultado+=x[i]+"  ";
		}
		resultado+="\nValores del arreglo Y\n";
		resultado+="------------------------\n";
		for(int i=0;i<y.length;i++) {
			resultado+=y[i]+"  ";
		}
		resultado+="\nValores del arreglo Z\n";
		resultado+="------------------------\n";
		for(int i=0;i<z.length;i++) {
			resultado+=z[i]+"  ";
			//Muestra resultado en joptionpane
			
		}
		JOptionPane.showMessageDialog(null, resultado,"Intercalacion"
				+ "",JOptionPane.INFORMATION_MESSAGE);
	}

}
