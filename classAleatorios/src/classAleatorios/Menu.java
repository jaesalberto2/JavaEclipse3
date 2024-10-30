package classAleatorios;


//Menu.java
import javax.swing.JOptionPane;

public class Menu {
 private ClassAleatorios aleatorios;

 public Menu(ClassAleatorios aleatorios) {
     this.aleatorios = aleatorios;
 }

 public void mostrarResultados() {
     int[] numeros = aleatorios.getNumeros();
     int sumPares = 0;
     int sumImpares = 0;
     int numCeros = 0;

     for (int num : numeros) {
         if (num % 2 == 0) {
             sumPares += num;
         } else {
             sumImpares += num;
         }
         if (num == 0) {
             numCeros++;
         }
     }

     String message = "Sumatoria de números pares: " + sumPares + "\n"
             + "Sumatoria de números impares: " + sumImpares + "\n"
             + "Cantidad de números pares: " + (20 - numCeros - sumImpares) + "\n"
             + "Cantidad de números impares: " + (20 - numCeros - sumPares) + "\n";

     if (sumPares == sumImpares) {
         message += "Sumatorias Iguales";
     } else {
         message += "Sumatorias Diferentes";
     }

     message += "\nCantidad de ceros generados: " + numCeros;

     JOptionPane.showMessageDialog(null, message);
 }
}

