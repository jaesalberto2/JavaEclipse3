package pokemon;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;



public class Fichero {
	public void ingresapidgey(Pidgey p) { 
	FileOutputStream fichero=null;
	File arch = new File("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\pidgey.txt");
	ObjectOutputStream archivo=null;
	try {
		if(arch.exists())
		{
			fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\pidgey.txt", true);
			archivo = new ObjectOutputStream(fichero) {@Override
			protected void writeStreamHeader() throws IOException
				{//no hacer nada
				
				}
			};
			}//fin del if
		else
		{
			fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\pidgey.txt");
			archivo = new ObjectOutputStream(fichero);
		}
		archivo.writeObject(p);
		archivo.close();
		JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente","Ingresa Datos",
				JOptionPane.INFORMATION_MESSAGE);
	}catch(IOException exc) {
		JOptionPane.showMessageDialog(null, exc.getMessage(),"Error de Archivo",JOptionPane.ERROR_MESSAGE);
	}
}//fin del metodo
	
	public void ingresaZubat(Zubat z) { 
	FileOutputStream fichero=null;
	File arch = new File("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\zubat.txt");
	ObjectOutputStream archivo=null;
	try {
		if(arch.exists())
		{
			fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\zubat.txt", true);
			archivo = new ObjectOutputStream(fichero) {@Override
			protected void writeStreamHeader() throws IOException
				{//no hacer nada
				
				}
			};
			}//fin del if
		else
		{
			fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\zubat.txt");
			archivo = new ObjectOutputStream(fichero);
		}
		archivo.writeObject(z);
		archivo.close();
		JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente","Ingresa Datos",
				JOptionPane.INFORMATION_MESSAGE);
	}catch(IOException exc) {
		JOptionPane.showMessageDialog(null, exc.getMessage(),"Error de Archivo",JOptionPane.ERROR_MESSAGE);
	}
}//fin del metodo
	
	public void ingresaPikachu(Pikachu p) { 
	FileOutputStream fichero=null;
	File arch = new File("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\pikachu.txt");
	ObjectOutputStream archivo=null;
	try {
		if(arch.exists())
		{
			fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\pikachu.txt", true);
			archivo = new ObjectOutputStream(fichero) {@Override
			protected void writeStreamHeader() throws IOException
				{//no hacer nada
				
				}
			};
			}//fin del if
		else
		{
			fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\pikachu.txt");
			archivo = new ObjectOutputStream(fichero);
		}
		archivo.writeObject(p);
		archivo.close();
		JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente","Ingresa Datos",
				JOptionPane.INFORMATION_MESSAGE);
	}catch(IOException exc) {
		JOptionPane.showMessageDialog(null, exc.getMessage(),"Error de Archivo",JOptionPane.ERROR_MESSAGE);
	}
}//fin del metodo
	
	public void ingresaPichu(Pichu p) { 
	FileOutputStream fichero=null;
	File arch = new File("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\pichu.txt");
	ObjectOutputStream archivo=null;
	try {
		if(arch.exists())
		{
			fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\pichu.txt", true);
			archivo = new ObjectOutputStream(fichero) {@Override
			protected void writeStreamHeader() throws IOException
				{//no hacer nada
				
				}
			};
			}//fin del if
		else
		{
			fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\pichu.txt");
			archivo = new ObjectOutputStream(fichero);
		}
		archivo.writeObject(p);
		archivo.close();
		JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente","Ingresa Datos",
				JOptionPane.INFORMATION_MESSAGE);
	}catch(IOException exc) {
		JOptionPane.showMessageDialog(null, exc.getMessage(),"Error de Archivo",JOptionPane.ERROR_MESSAGE);
	}
}//fin del metodo
	
}//Fin de la clase