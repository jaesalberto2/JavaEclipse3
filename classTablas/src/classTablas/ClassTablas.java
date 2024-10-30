package classTablas;

public class ClassTablas {
	public  String tablas(int num) {
		String resultado="";
		for(int i=1;i<=10;i++) {
			resultado+=num+"  X  "+i+"  =  "+(i*num)+"      "
					+ ""+(11-i)+"  X  "+num+"  =  "+(i*num)+"      "
					+ ""+num+"  X  "+i+"  =  "+(i*num)+"\n";
			
		}
		return resultado;
	}

}
