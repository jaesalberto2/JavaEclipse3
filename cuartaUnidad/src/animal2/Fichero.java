package animal2;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class Fichero {
	public void ingresaCanino(Canino c) {
		FileOutputStream fichero=null;
		File arch = new File("C:/Users/ALBERTO/Documents/herramientas/eclipse3/archivos/canino.txt");
		ObjectOutputStream archivo=null;
		try {
			if(arch.exists())
			{
				fichero = new FileOutputStream("C:/Users/ALBERTO/Documents/herramientas/eclipse3/archivos/canino.txt",true);
				archivo = new ObjectOutputStream(fichero) {@Override
					protected void writeStreamHeader() throws IOException
					{//no hacer nada
					
					}
				};
						
			}//fin del if
			else {
				fichero = new FileOutputStream("C:/Users/ALBERTO/Documents/herramientas/eclipse3/archivos/canino.txt",true);
				archivo = new ObjectOutputStream(fichero);

			}//fin del else
			archivo.writeObject(c);
			archivo.close();
			JOptionPane.showMessageDialog(null, "Datos ingresados correctamente","Ingresa datos",JOptionPane.INFORMATION_MESSAGE);

		}catch(IOException exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage(),"Error de Archivo",JOptionPane.ERROR_MESSAGE);
		}
	}

}
