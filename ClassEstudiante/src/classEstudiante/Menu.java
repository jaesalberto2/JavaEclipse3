package classEstudiante;



import javax.swing.JOptionPane;

public class Menu {
 private ClassEstudiante estudiante;

 public Menu(ClassEstudiante estudiante) {
     this.estudiante = estudiante;
 }

 public void mostrarResultados() {
     String nombre = estudiante.getNombre();
     int numCalificaciones = estudiante.getNumCalificaciones();
     double promedio = estudiante.calcularPromedio();
     String mensaje = estudiante.obtenerMensaje();

     String message = "Nombre del estudiante: " + nombre + "\n"
             + "Número de calificaciones solicitadas: " + numCalificaciones + "\n"
             + "Promedio: " + promedio + "\n"
             + mensaje;

     JOptionPane.showMessageDialog(null, message);
 }
}

