package heroe;

import javax.print.attribute.standard.JobPrioritySupported;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Entrada {
	public void ingresaDatos() {
		JTextArea datos =new JTextArea();
		
		//declaracion de variables locales
		//instanciar a la clase imprime
		Imprime i =new Imprime();
		String nombreVillano,powerVillano,mascota,vehiculo,nombreAyudante,origen;
		String nombreHeroe,powerHeroe,universo,debilidad;
		int edad;
		String salida = "Heroe\tPoder\tEdad\tUniverso\tDebilidad\tVillano\tPoder\tvehiculo\tmascota\tAyudante\tOrigen\n";
		
		//solicitar los valores de entrada del heroe
		
		nombreHeroe=JOptionPane.showInputDialog(null,"Ingresa Nombre","Nombre del heroe",JOptionPane.INFORMATION_MESSAGE);
		powerHeroe=JOptionPane.showInputDialog(null,"Ingresa Power","Power del heroe",JOptionPane.INFORMATION_MESSAGE);
		universo =JOptionPane.showInputDialog(null,"Ingresa Universo","Universo del heroe",JOptionPane.INFORMATION_MESSAGE);
		debilidad =JOptionPane.showInputDialog(null,"Ingresa Debilidad","Debilidad del Heroe",JOptionPane.INFORMATION_MESSAGE);
		edad =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa edad"," del ",JOptionPane.INFORMATION_MESSAGE));						
		
		//solicitar los valores de entrada del villano
		nombreVillano=JOptionPane.showInputDialog(null,"Ingresa Nombre","Nombre del Villano",JOptionPane.INFORMATION_MESSAGE);
		powerVillano=JOptionPane.showInputDialog(null,"Ingresa Power","Power del Villano",JOptionPane.INFORMATION_MESSAGE);
		mascota =JOptionPane.showInputDialog(null,"Ingresa Nombre","Mascota del Villano",JOptionPane.INFORMATION_MESSAGE);
		vehiculo =JOptionPane.showInputDialog(null,"Ingresa Vehiculo","Tipo  del Vehiculo",JOptionPane.INFORMATION_MESSAGE);
		
		//solicitar los valores de entrada del ayudante
		nombreAyudante=JOptionPane.showInputDialog(null,"Ingresa Nombre","Nombre del Ayudante",JOptionPane.INFORMATION_MESSAGE);
		origen=JOptionPane.showInputDialog(null,"Ingresa Origen","Origen del Ayudante",JOptionPane.INFORMATION_MESSAGE);
		Ayudante a = new Ayudante(nombreAyudante,origen);
		Villano v = new Villano(nombreVillano,powerVillano,mascota,vehiculo);
		Heroe h = new Heroe(v,a, nombreHeroe,  powerHeroe,universo,  debilidad,
				edad);
		
		//Llamar al metodo imprime
		salida += i.imprimeDatos(h);
		datos.setText(salida);// colocamos los datos en un JTextArea
		JOptionPane.showMessageDialog(null, datos,"Salida"
				+ "",JOptionPane.INFORMATION_MESSAGE);
		
		//modificando algunos atributos
		h.ayudante.setNombre("Robin");
		h.villano.setMacota("Raton");
		h.setDebilidad("Lloron");
		
		//muestra la informacion modificada
		
		
	}

}
