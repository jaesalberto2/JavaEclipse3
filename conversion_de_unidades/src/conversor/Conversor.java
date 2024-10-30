package conversor;

public class Conversor {
	
	//conversor a metros
	public double kilometrosMetros(double unidad) {
	
		return(unidad*1000);
	}
	public double hectometrosMetros(double unidad) {
		
		return(unidad*100);
	}
	public double decametrosMetros(double unidad) {
		
		return(unidad*10);
	}
	public double metrosMetros(double unidad) {
		
		return(unidad);
	}
	public double decimetrosMetros(double unidad) {
		
		return(unidad/10);
	}
	public double centimetrosMetros(double unidad) {
		
		return(unidad/100);
	}
	public double milimetrosMetros(double unidad) {
		
		return(unidad/1000);
	}

}
