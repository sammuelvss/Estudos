package poo2;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica quadrado = new Quadrado(5);
        FormaGeometrica circulo = new Circulo(3);

        System.out.println("Área do quadrado: " + quadrado.area());
        System.out.println("Comprimento do quadrado: " + quadrado.comprimento());

        System.out.println("Área do círculo: " + circulo.area());
        System.out.println("Comprimento do círculo: " + circulo.comprimento());
    }
}
