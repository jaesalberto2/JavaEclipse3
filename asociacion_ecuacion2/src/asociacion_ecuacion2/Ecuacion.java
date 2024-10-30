package asociacion_ecuacion2;

import javax.swing.JOptionPane;

public class Ecuacion {
	public void ecuacion(int x[],int y[])
	{
		String datos="";
		int sumX=0,sumY=0,sumXY=0,sumX2Y=0,sumXY2=0,sumX_Y=0;
		int sumX2_Y2=0,sumX_Y2=0,a=0,b=0,c=0,z=0;
		
		for(int i=0;i<x.length;i++) {
			sumX+=x[i];//sumX=sumX+x[i]
			sumY+=y[i];
			sumXY+=x[i]*y[i];
			sumX2Y+=Math.pow(x[i], 2)*y[i];
			sumXY2+=Math.pow(y[i], 2)*x[i];
			sumX_Y+=x[i]-y[i];
			sumX2_Y2+=Math.pow(x[i], 2)-Math.pow(y[i], 2);
			sumX2_Y2+=x[i]-Math.pow(y[i], 2);
			
			
		}
		//Definir los encabezados de la tabla
		datos+="X    Y    XY     X2Y   XY2"
				+ "   X-Y   X2-Y2    X-Y2\n";
		datos+="-----------------------------------------"
				+ "--------------------------------------\n";
		for(int i=0;i<x.length;i++) {
			datos+=x[i]+"    "+y[i]+"    "+x[i]*y[i]+"    "
					+ ""+Math.pow(x[i], 2)*y[i]+"    "
					+ ""+x[i]*Math.pow(y[i], 2)+"    "
					+ ""+(x[i]-y[i])+"    "
					+ ""+(Math.pow(x[i], 2)-Math.pow(y[i], 2))+"    "
							+ ""+(x[i]-Math.pow(y[i], 2)+"\n");

			
		}
		datos+="----------------------------------------"
				+ "-------------------------------------\n";
		datos+=sumX+"    "+sumY+"    "+sumXY+"    "+sumX2Y+"    "
				+ ""+sumXY2+"    "+sumX_Y+"    "+sumX2_Y2+"    "
						+ ""+sumX_Y2+"\n";
		a+=sumX+sumXY+sumX2Y;
		b+=sumY+sumX2Y-sumX_Y+a;
		c+=sumX2_Y2;
		
		JOptionPane.showMessageDialog(null, datos,"Resultados"
				+ "",JOptionPane.INFORMATION_MESSAGE);		
	}

}
