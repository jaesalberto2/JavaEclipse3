package asociacion_temperatura;

public class Temperatura {
	
	public double centFahrenheit(double grados){
		return (grados*1.8+32);
	}
	public double farenheitCent(double grados){
		return ((grados-32)/1.8);
	}
	public double centKelvin(double grados){
		return (grados+273.15);
	}
	public double kelvinCent(double grados){
		return (grados-273.15);
	}
	public double centRankin(double grados){
		return ((grados+273.15)*1.8);
	}
	public double rankinCent(double grados){
		return ((grados-491.67)*1.8);
	}
	

}
