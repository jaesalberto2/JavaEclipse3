package classIntercalacion;


public class ClassIntercalacion {
 private int[] arreglo1;
 private int[] arreglo2;
 private int[] arregloIntercalado;

 public ClassIntercalacion() {
     arreglo1 = new int[10];
     arreglo2 = new int[10];
     arregloIntercalado = new int[20];
     generarArreglosAleatorios();
     intercalarArreglos();
 }

 private void generarArreglosAleatorios() {
     for (int i = 0; i < 10; i++) {
         arreglo1[i] = (int) (Math.random() * 10) + 1;
         arreglo2[i] = (int) (Math.random() * 10) + 1;
     }
 }

 private void intercalarArreglos() {
     for (int i = 0; i < 10; i++) {
         arregloIntercalado[i * 2] = arreglo1[i];
         arregloIntercalado[i * 2 + 1] = arreglo2[i];
     }
 }

 public int[] getArreglo1() {
     return arreglo1;
 }

 public int[] getArreglo2() {
     return arreglo2;
 }

 public int[] getArregloIntercalado() {
     return arregloIntercalado;
 }
}


