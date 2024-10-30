package herencia_vehiculo;

public class Imprime {
	public String imprimeDeportivo(Deportivo d) {
		return d.getMarca()+"\t"+d.getModelo()+"\t"+d.getMatricula()+"\t"+
	d.getColor()+"\t"+d.getCilindros()+"\t"+d.getPrecio()+"\n";
	}
	
	public String imprimeFurgoneta(Furgoneta d) {
		return d.getMarca()+"\t"+d.getModelo()+"\t"+d.getMatricula()+"\t"+
	d.getColor()+"\t"+d.getVolumen()+"t"+d.getPrecio()+"t"+d.getCarga();
	}

}
