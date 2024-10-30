package classEstudiante;


import java.util.Random;

public class ClassEstudiante {
 private String nombre;
 private int numCalificaciones;
 private int[] calificaciones;

 public ClassEstudiante(String nombre, int numCalificaciones) {
     this.nombre = nombre;
     this.numCalificaciones = numCalificaciones;
     calificaciones = new int[numCalificaciones];
     generarCalificacionesAleatorias();
 }

 private void generarCalificacionesAleatorias() {
     Random rand = new Random();
     for (int i = 0; i < numCalificaciones; i++) {
         calificaciones[i] = rand.nextInt(51) + 50; // Genera un número aleatorio entre 50 y 100
     }
 }

 public double calcularPromedio() {
     int sum = 0;
     for (int calif : calificaciones) {
         sum += calif;
     }
     return (double) sum / numCalificaciones;
 }

 public String obtenerMensaje() {
     double promedio = calcularPromedio();
     if (promedio >= 91) {
         return "Muchas Felicidades";
     } else if (promedio >= 81) {
         return "Sigue adelante";
     } else if (promedio >= 71) {
         return "Animo";
     } else if (promedio == 70) {
         return "Lo lograste";
     } else {
         return "Lastima Margarito";
     }
 }

 public String getNombre() {
     return nombre;
 }

 public int getNumCalificaciones() {
     return numCalificaciones;
 }
}


