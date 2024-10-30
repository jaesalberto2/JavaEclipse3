package classEstudiante;

import javax.swing.JOptionPane;

public class PruebaEstudiante {
 public static void main(String[] args) {
     String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
     int numCalificaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calificaciones (no mayor a 10):"));

     if (numCalificaciones <= 0 || numCalificaciones > 10) {
         JOptionPane.showMessageDialog(null, "Número de calificaciones inválido. Debe ser mayor a 0 y no mayor a 10.");
         return;
     }

     ClassEstudiante estudiante = new ClassEstudiante(nombre, numCalificaciones);
     Menu menu = new Menu(estudiante);
     menu.mostrarResultados();
 }
}
