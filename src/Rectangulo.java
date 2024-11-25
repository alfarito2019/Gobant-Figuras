public class Rectangulo extends Figura implements Dibujable{
    private double alto;
    private double ancho;

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return getAlto()*getAncho();
    }

    @Override
    public double calcularPerimetro() {
        return 2*(getAlto()+getAncho());
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando rectangulo");
        System.out.println("Su alto es: "+ getAlto());
        System.out.println("Su ancho es: "+ getAncho());
        System.out.println("Su area es: "+calcularArea());
        System.out.println("Su perimetro es: "+calcularPerimetro());

    }
}
