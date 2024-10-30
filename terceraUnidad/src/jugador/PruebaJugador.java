package jugador;

import javax.swing.JOptionPane;

public class PruebaJugador {

	public static void main(String[] args) {
		Jugador jugador1 = new Jugador("Carlos","martinez","cmartinez@gmail.com"
				+ "","Mapaches","Defensa","Mexicana",45,7,15000);
		Jugador jugador2 = new Jugador("Jhon","Smith","jsmith@gmail.com"
				+ "","Cuervos","Poste","EU",24,9,2500);
		Jugador jugador3 = new Jugador("Rafael","Almeida","ralmeida@yahoo.com"
				+ "","Medias Rojas","jardinero central","Cubano",30,35,45000);
		JOptionPane.showMessageDialog(null, jugador1.toString(),"Jugador 1"
				+ "",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, jugador2.toString(),"Jugador 2"
				+ "",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, jugador3.toString(),"Jugador 3"
				+ "",JOptionPane.INFORMATION_MESSAGE);
		jugador2.correr();
		jugador1.anotar();
		jugador3.festejar();
		
	}

}
