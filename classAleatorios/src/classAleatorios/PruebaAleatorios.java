package classAleatorios;

public class PruebaAleatorios {
    public static void main(String[] args) {
        ClassAleatorios aleatorios = new ClassAleatorios();
        Menu menu = new Menu(aleatorios);
        menu.mostrarResultados();
    }
}