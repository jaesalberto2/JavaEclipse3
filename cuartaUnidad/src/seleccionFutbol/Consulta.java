package seleccionFutbol;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;



public class Consulta {

	JTextArea salida = new JTextArea();
	String datos="Matricula\tMarca\tModelo\n";
	public void consultaEntrenador()
	{
		datos+="___________________\n";
		try(ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
				("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\entrenador.txt"))){
			while(true)
			{
				Entrenador aux = (Entrenador)fichero.readObject();
				datos+= aux.getId()+"\t"+  aux.getEdad()+"\t"+  aux.getNombre()+"\t"+  aux.getApellido()+"\t"+  aux.getPeso()+"\t"+  aux.getIdFederacion()+"\t";
			}//fin del while
		}catch(ClassNotFoundException exc) {
			JOptionPane.showMessageDialog(null, "ERROR!!!");
		}catch(EOFException exc) {
			salida.setText(datos);
			JOptionPane.showMessageDialog(null, salida, "Datos Entrenador", JOptionPane.INFORMATION_MESSAGE);
		}catch (IOException exc) {
			JOptionPane.showMessageDialog(null, "Error en la Apertura del Archivo",
					"ERROR!!!",JOptionPane.ERROR_MESSAGE);
		}
		}//Fin del metodo
	}//Fin de la clase
