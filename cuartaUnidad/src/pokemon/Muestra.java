package pokemon;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;



public class Muestra {
	
	JTextArea salida = new JTextArea();
	String datosPidgey="nombre\t peso\tedad\tsexo\thabitat\ttamaño\thabilidad\t"
			+ "garras\tvista\n_____________________________________________________________________\n";
	String datosZubat =  "nombre\t"+  "peso\t"  +"edad\t"  +"sexo\t"+  "habitat\t"+  "tamaño\t"+  "habilidad\t"+
			 "longevidad\t"+  "veneno\t\n_____________________________________\n";
	String datosPikachu =  "nombre\t"+  "peso\t"  +"edad\t"  +"sexo\t"+  "habitat\t"+  "alimentacion\t"+  "poder\t"+
			 "color de piel\t"+  "\n_____________________________________\n";
	String datosPichu =  "nombre\t"+  "peso\t"  +"edad\t"  +"sexo\t"+  "habitat\t"+  "alimentacion\t"+  "poder\t"+
			 "color de pelo\t"+  "\n_____________________________________\n";

	public void muestraPidgey()
	{

	
		try(ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
				("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\pidgey.txt"))){
			while(true)
			{
				Pidgey aux = (Pidgey)fichero.readObject();
				datosPidgey+=aux.getNombre()+"\t"+aux.getPeso() +"\t"+ aux.getEdad()+ "\t"+aux.getSexo()+"\t"+aux.getHabitat()+ "\t"+aux.getTamaño()+ "\t"+aux.getHabilidad()+
						"\t"+aux.getGarras()+ "\t"+aux.getVista()+"\n";
			}//fin del while
		}catch(ClassNotFoundException exc) {
			JOptionPane.showMessageDialog(null, "ERROR!!!");
		}catch(EOFException exc) {
			salida.setText(datosPidgey);
			JOptionPane.showMessageDialog(null, salida, "Datos Vehiculo", JOptionPane.INFORMATION_MESSAGE);
		}catch (IOException exc) {
			JOptionPane.showMessageDialog(null, "Error en la Apertura del Archivo",
					"ERROR!!!",JOptionPane.ERROR_MESSAGE);
		}
		 datosPidgey="nombre\t peso\tedad\tsexo\thabitat\ttamaño\thabilidad\t"
				+ "\tgarras\tvista\n_____________________________________\n";
		}//Fin del metodo
	public void muestraZubat()
	{

	
		try(ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
				("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\zubat.txt"))){
			while(true)
			{
				Zubat aux = (Zubat)fichero.readObject();
				datosZubat+=aux.getNombre()+"\t"+aux.getPeso() +"\t"+ aux.getEdad()+ "\t"+aux.getSexo()+"\t"+aux.getHabitat()+ "\t"+aux.getTamaño()+ "\t"+aux.getHabilidad()+
						"\t"+aux.getLongevidad()+ "\t"+aux.getVeneno()+"\n";
			}//fin del while
		}catch(ClassNotFoundException exc) {
			JOptionPane.showMessageDialog(null, "ERROR!!!");
		}catch(EOFException exc) {
			salida.setText(datosZubat);
			JOptionPane.showMessageDialog(null, salida, "Datos Vehiculo", JOptionPane.INFORMATION_MESSAGE);
		}catch (IOException exc) {
			JOptionPane.showMessageDialog(null, "Error en la Apertura del Archivo",
					"ERROR!!!",JOptionPane.ERROR_MESSAGE);
		}
		 datosZubat =  "nombre\t"+  "peso\t"  +"edad\t"  +"sexo\t"+  "habitat\t"+  "tamaño\t"+  "habilidad\t"+
				 "longevidad\t"+  "veneno\t\n_____________________________________\n";
		}//Fin del metodo
	public void muestraPikachu()
	{

	
		try(ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
				("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\pikachu.txt"))){
			while(true)
			{
				Pikachu aux = (Pikachu)fichero.readObject();
				datosPikachu+=aux.getNombre()+"\t"+aux.getPeso() +"\t"+ aux.getEdad()+ "\t"+aux.getSexo()+"\t"+aux.getHabitat()+ "\t"+aux.getAlimentacion()+ "\t"+aux.getPoder()+
						"\t"+aux.getColorPiel()+ "\n";
			}//fin del while
		}catch(ClassNotFoundException exc) {
			JOptionPane.showMessageDialog(null, "ERROR!!!");
		}catch(EOFException exc) {
			salida.setText(datosPikachu);
			JOptionPane.showMessageDialog(null, salida, "Datos Vehiculo", JOptionPane.INFORMATION_MESSAGE);
		}catch (IOException exc) {
			JOptionPane.showMessageDialog(null, "Error en la Apertura del Archivo",
					"ERROR!!!",JOptionPane.ERROR_MESSAGE);
		}
		 datosPikachu =  "nombre\t"+  "peso\t"  +"edad\t"  +"sexo\t"+  "habitat\t"+  "alimentacion\t"+  "poder\t"+
				 "color de piel\t"+  "\n_____________________________________\n";
		}//Fin del metodo
	
	public void muestraPichu()
	{

	
		try(ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
				("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\pichu.txt"))){
			while(true)
			{
				Pichu aux = (Pichu)fichero.readObject();
				datosPichu+=aux.getNombre()+"\t"+aux.getPeso() +"\t"+ aux.getEdad()+ "\t"+aux.getSexo()+"\t"+aux.getHabitat()+ "\t"+aux.getAlimentacion()+ "\t"+aux.getPoder()+
						"\t"+aux.getColorPelo()+ "\n";
			}//fin del while
		}catch(ClassNotFoundException exc) {
			JOptionPane.showMessageDialog(null, "ERROR!!!");
		}catch(EOFException exc) {
			salida.setText(datosPichu);
			JOptionPane.showMessageDialog(null, salida, "Datos Pichu", JOptionPane.INFORMATION_MESSAGE);
		}catch (IOException exc) {
			JOptionPane.showMessageDialog(null, "Error en la Apertura del Archivo",
					"ERROR!!!",JOptionPane.ERROR_MESSAGE);
		}
		 datosPichu =  "nombre\t"+  "peso\t"  +"edad\t"  +"sexo\t"+  "habitat\t"+  "alimentacion\t"+  "poder\t"+
				 "color de pelo\t"+  "\n_____________________________________\n";

		}//Fin del metodo
	
	
	
	}//Fin de la clase
