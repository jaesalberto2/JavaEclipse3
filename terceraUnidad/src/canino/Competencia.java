package canino;

public class Competencia {
	String lugar,categoria,fecha;
	double premio;
	public Competencia(String lugar, String categoria, String fecha, double premio) {
		super();
		this.lugar = lugar;
		this.categoria = categoria;
		this.fecha = fecha;
		this.premio = premio;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getPremio() {
		return premio;
	}
	public void setPremio(double premio) {
		this.premio = premio;
	}
	@Override
	public String toString() {
		return " Lugar : " + lugar + "\nCategoria : " + categoria + "\nFecha : "
				+ "" + fecha + "\nPremio : " + premio
				+ "\n";
	}
	
	
	

}
