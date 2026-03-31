package poo2;

public class Circulo implements FormaGeometrica {

    private double raio;
    private static final double PI = Math.PI;
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI * raio * raio;
    }

    @Override
    public double comprimento() {
        return 2 * PI * raio;
    }
}