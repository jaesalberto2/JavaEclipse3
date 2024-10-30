package pokemon;

import javax.swing.JOptionPane;

public class Ingresa {
	
	public Pokemon ingresa() {
	
	Gimnasio gimnasio=new Gimnasio(null,null,null,null,0);
	String nameGimnasio,place, propietario, superficie;
	int capacidad;
	
	Entrenador entrenador = new Entrenador(null,null,null,0,0,0,0);
	String nameEntrenador,apellido,sexo;
	int edad, phone,npokemons,nmedallas;
	
	Pokemon pokemon = new Pokemon(gimnasio,entrenador,null,null,null,0,0,null,null,null);
	String name,tipo,power;
	float peso,altura;
	String habitat,especie,evolucion;
	
	
	
	
	name=JOptionPane.showInputDialog(null,""
			+ "Ingresa Nombre:","Pokemon",JOptionPane.INFORMATION_MESSAGE);
	tipo=JOptionPane.showInputDialog(null,""
			+ "Ingresa  Tipoi:","Pokemon",JOptionPane.INFORMATION_MESSAGE);
	power=JOptionPane.showInputDialog(null,""
			+ "Ingresa Poder:","Pokemon",JOptionPane.INFORMATION_MESSAGE);
	
	peso=Float.parseFloat(JOptionPane.showInputDialog(null,""
			+ "Ingresa Peso:","Pokemon",JOptionPane.INFORMATION_MESSAGE)); 
	altura=Float.parseFloat(JOptionPane.showInputDialog(null,""
			+ "Ingresa Altura:","Pokemon",JOptionPane.INFORMATION_MESSAGE));
	habitat=JOptionPane.showInputDialog(null,""
			+ "Ingresa Habitat:","Pokemon",JOptionPane.INFORMATION_MESSAGE);
	especie=JOptionPane.showInputDialog(null,""
			+ "Ingresa Ingresa Especie:","Pokemon",JOptionPane.INFORMATION_MESSAGE);
	evolucion=JOptionPane.showInputDialog(null,""
			+ "Ingresa Evolucion:","Pokemon",JOptionPane.INFORMATION_MESSAGE);
	
	
	
	
	/*
	 * set pokemon
	 */
	
	pokemon.setName(name);
	pokemon.setTipo(tipo);
	pokemon.setPower(power);
	pokemon.setPeso(peso);
	pokemon.setAltura(altura);
	pokemon.setHabitat(habitat);
	pokemon.setEspecie(especie);
	pokemon.setEvolucion(evolucion);
	
	
	//get values Gimnasio
	
	nameGimnasio=JOptionPane.showInputDialog(null,""
			+ "Ingresa Nombre:","Gimnasio",JOptionPane.INFORMATION_MESSAGE);
	place=JOptionPane.showInputDialog(null,""
			+ "Ingresa Lugar:","Gimnasio",JOptionPane.INFORMATION_MESSAGE);
	propietario=JOptionPane.showInputDialog(null,""
			+ "Ingresa Propietario:","Gimnasio",JOptionPane.INFORMATION_MESSAGE);
	superficie=JOptionPane.showInputDialog(null,""
			+ "Ingresa Superficie:","Gimnasio",JOptionPane.INFORMATION_MESSAGE);
	capacidad=Integer.parseInt(JOptionPane.showInputDialog(null,""
			+ "Ingresa Capacidad:","Gimnasio",JOptionPane.INFORMATION_MESSAGE));
	
	
	/*
	 *  set Gimnasio
	 */
	pokemon.gimnasio.setName(nameGimnasio);
	pokemon.gimnasio.setPlace(place);
	pokemon.gimnasio.setPropietario(propietario);
	pokemon.gimnasio.setSuperficie(superficie);
	pokemon.gimnasio.setCapacidad(capacidad);
	
	
	//get values Entrenador
	nameEntrenador=JOptionPane.showInputDialog(null,""
			+ "Ingresa Nombre:","Entrenador",JOptionPane.INFORMATION_MESSAGE);
	apellido=JOptionPane.showInputDialog(null,""
			+ "Ingresa Apellido:","Entrenador",JOptionPane.INFORMATION_MESSAGE);
	sexo=JOptionPane.showInputDialog(null,""
			+ "Ingresa sexo:","Entrenador",JOptionPane.INFORMATION_MESSAGE);
	edad=Integer.parseInt(JOptionPane.showInputDialog(null,""
			+ "Ingresa Edad:","Entrenador",JOptionPane.INFORMATION_MESSAGE));
	phone=Integer.parseInt(JOptionPane.showInputDialog(null,""
			+ "Ingresa Telefono;","Entrenador",JOptionPane.INFORMATION_MESSAGE));
	npokemons=Integer.parseInt(JOptionPane.showInputDialog(null,""
			+ "Ingresa Numero de pokemons:","Entrenador",JOptionPane.INFORMATION_MESSAGE));
	nmedallas=Integer.parseInt(JOptionPane.showInputDialog(null,""
			+ "Ingresa Numero de medallas:","Entrenador",JOptionPane.INFORMATION_MESSAGE));
	
	
	
	/*
	 * Asignando valores a Entrenador
	 */
	
	pokemon.entrenador.setName(nameEntrenador);
	pokemon.entrenador.setApellido(apellido);
	pokemon.entrenador.setSexo(sexo);
	pokemon.entrenador.setEdad(edad);
	pokemon.entrenador.setNpokemons(npokemons);
	pokemon.entrenador.setNmedallas(nmedallas);
	pokemon.entrenador.setPhone(phone);
	
	return pokemon;
	
	}
	

	
	
	
	
	
}

