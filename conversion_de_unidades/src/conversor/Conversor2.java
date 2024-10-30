package conversor;

public class Conversor2 {
	//conversor a la unidad de medida deseada
	public double metroskilometros(double unidad) {
		
		return(unidad/1000);
	}
	public double metrosHectometros(double unidad) {
		
		return(unidad/100);
	}
	public double metrosDecametros(double unidad) {
		
		return(unidad/10);
	}
	public double metrosMetros(double unidad) {
		
		return(unidad);
	}
	public double metrosDecimetros(double unidad) {
		
		return(unidad*10);
	}
	public double metrosCentimetros(double unidad) {
		
		return(unidad*100);
	}
	public double metrosMilimetros(double unidad) {
		
		return(unidad*1000);
	}

}
