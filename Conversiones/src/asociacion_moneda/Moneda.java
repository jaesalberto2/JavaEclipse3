package asociacion_moneda;

public class Moneda {
	public double pesoDolar(int peso,double valor) {
		
		return(peso*valor);
	}
	public double dolarPeso(int dolar,double valor) {
		return(dolar*valor);
		
	}
	public double pesoEuro(int peso,double valor) {
		return(peso*0.054);
	}
	public double euroPeso(int euro,double valor) {
		return(euro*0.058);
		
	}
	public double pesoYen(int peso,double valor) {
		return valor;
		
	}
	public double yenPeso(int peso,double valor) {
		return valor;
		
	}

}
