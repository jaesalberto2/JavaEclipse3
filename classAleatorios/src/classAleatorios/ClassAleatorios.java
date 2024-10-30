package classAleatorios;

//ClassAleatorios.java
import java.util.Random;

public class ClassAleatorios {
 private int[] numeros;

 public ClassAleatorios() {
     numeros = new int[20];
     Random rand = new Random();
     for (int i = 0; i < 20; i++) {
         numeros[i] = rand.nextInt(101); // Genera un número aleatorio entre 0 y 100
     }
 }

 public int[] getNumeros() {
     return numeros;
 }
}
