package canino;

public class Imprime {
	public String imprime(Canino canino) {
		return "Nombre : "+canino.nombre+"\nAltura : "+canino.altura+"Peso : "
		+ ""+canino.peso+"\nNacimiento : "+canino.nacimiento+"\nNombre del Propietario : "
		+ ""+canino.propietario.nombre+"\nTelefono : "+canino.propietario.telefono+""
		+ "\nTelefono : "+canino.propietario.telefono+"\nDireccion del Propietario: "
		+ ""+canino.propietario.direccion+"\nCorreo : "+canino.propietario.correo+"\nLugar : "
		+ ""+canino.competencia.lugar+"\nFecha : "+canino.competencia.fecha+"\nPremio : "
		+ ""+canino.competencia.premio;
	}
}
