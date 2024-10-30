package serializable;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Consulta {
	JTextArea salida = new JTextArea();
	String datos="Matricula\tMarca\tModelo\n";
	public void consultaDeportivo()
	{
		datos+="___________________\n";
		try(ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
				("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\canino.txt"))){
			while(true)
			{
				Vehiculo aux = (Vehiculo)fichero.readObject();
				datos+=aux.getMatricula()+"\t"+aux.getMarca()+"\t"+aux.getModelo()+"\n";
			}//fin del while
		}catch(ClassNotFoundException exc) {
			JOptionPane.showMessageDialog(null, "ERROR!!!");
		}catch(EOFException exc) {
			salida.setText(datos);
			JOptionPane.showMessageDialog(null, salida, "Datos Vehiculo", JOptionPane.INFORMATION_MESSAGE);
		}catch (IOException exc) {
			JOptionPane.showMessageDialog(null, "Error en la Apertura del Archivo",
					"ERROR!!!",JOptionPane.ERROR_MESSAGE);
		}
		}//Fin del metodo
	}//Fin de la clase
