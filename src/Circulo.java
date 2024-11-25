public class Circulo extends Figura implements Dibujable{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo");
        System.out.println("Su radio es: "+ getRadio());
        System.out.println("Su area es: "+calcularArea());
        System.out.println("Su perimetro es: "+calcularPerimetro());
    }
}
