package classIntercalacion;


import javax.swing.JOptionPane;

public class Menu {
 private ClassIntercalacion intercalacion;

 public Menu(ClassIntercalacion intercalacion) {
     this.intercalacion = intercalacion;
 }

 public void mostrarArreglos() {
     int[] arreglo1 = intercalacion.getArreglo1();
     int[] arreglo2 = intercalacion.getArreglo2();
     int[] arregloIntercalado = intercalacion.getArregloIntercalado();

     String message = "Arreglo 1: ";
     for (int num : arreglo1) {
         message += num + " ";
     }

     message += "\nArreglo 2: ";
     for (int num : arreglo2) {
         message += num + " ";
     }

     message += "\nArreglo Intercalado: ";
     for (int num : arregloIntercalado) {
         message += num + " ";
     }

     JOptionPane.showMessageDialog(null, message, "Arreglos Intercalados", JOptionPane.INFORMATION_MESSAGE);
 }
}

