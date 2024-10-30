package animal2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Consulta {
	JTextArea salida = new JTextArea();
	String datos = "Alimento\tEdad\tHabitat\tName\tPeso\n"
			+ "";
	public void consultaDeportivo() {
		datos+="_______________________________";
				try(ObjectInputStream fichero =  new ObjectInputStream(
				new FileInputStream("C:/Users/ALBERTO/Documents/herramientas/clipse3/archivos/canino.txt"))){
					while(true)
					{
						Canino aux = (Canino)fichero.readObject();
						datos+=aux.getAlimento()+"\t"+aux.getEdad()+"\t"+aux.getHabitat()+aux.getName()+"\t"+aux.getPeso()+"\n";
						
					}//fin fel while
				}catch(ClassNotFoundException exc) {
					JOptionPane.showMessageDialog(null, "error");
					
				}catch(EOFException exc) {
					salida.setText(datos);
					JOptionPane.showMessageDialog(null, salida,"Datos del vehiculo",JOptionPane.INFORMATION_MESSAGE);
				
				}catch(IOException exc) {
					JOptionPane.showMessageDialog(null, "Error en la apertura del archivo","Error",JOptionPane.ERROR_MESSAGE);
				}
	}

}
