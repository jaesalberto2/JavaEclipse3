package heroe;

public class Imprime {
		public String imprimeDatos(Heroe h)
		{
			return h.getNombre()+"\t"+h.getPower()+"\t"+h.getEdad()+"\t"+h.getUniverso()+"\t"+h.getDebilidad()
					+"\t"+h.villano.getNombre()+"\t"+h.villano.getPower()+"\t"+h.villano.getVehiculo()
					+"\t"+h.villano.getMacota()+"\t"+h.ayudante.getNombre()+"\t"+h.ayudante.getOrigen()+"\n";
		}
		
}
	
	

	
	


