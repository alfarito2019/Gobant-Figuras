public class Triangulo extends Figura implements Dibujable{
    private double lado1;
    private double lado2;
    private double lado3;
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public Triangulo(double alto, double ancho, double lado1, double lado2, double lado3) {
        this.alto = alto;
        this.ancho = ancho;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return getAlto()*getAncho()/2;
    }

    @Override
    public double calcularPerimetro() {
        return getLado1()+getLado2()+getLado3();
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando triangulo");
        System.out.println("Su alto es: "+ getAlto());
        System.out.println("Su ancho es: "+ getAncho());
        System.out.println("Sus lados son: "+ getLado1()+", "+getLado2()+", "+getLado3());
        System.out.println("Su area es: "+calcularArea());
        System.out.println("Su perimetro es: "+calcularPerimetro());
    }
}
