package prueba;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import serializable.Vehiculo;

public class Fichero {
	public void ingresaVehiculo(Vehiculo v) { 
		FileOutputStream fichero=null;
		File arch = new File("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\prueba.txt");
		ObjectOutputStream archivo=null;
		try {
			if(arch.exists())
			{
				fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\prueba.txt", true);
				archivo = new ObjectOutputStream(fichero) {@Override
				protected void writeStreamHeader() throws IOException
					{//no hacer nada
					
					}
				};
				}//fin del if
			else
			{
				fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\prueba.txt");
				archivo = new ObjectOutputStream(fichero);
			}
			archivo.writeObject(v);
			archivo.close();
			JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente","Ingresa Datos",
					JOptionPane.INFORMATION_MESSAGE);
		}catch(IOException exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage(),"Error de Archivo",JOptionPane.ERROR_MESSAGE);
		}
	}//fin del metodo
}//Fin de la clase