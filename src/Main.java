public class Main {
    public static void main(String[] args) {
        Circulo circ = new Circulo(2);
        Rectangulo rect = new Rectangulo(2,4);
        Triangulo tri = new Triangulo(2,2,2,2,2);
        circ.dibujar();
        rect.dibujar();
        tri.dibujar();

    }
}