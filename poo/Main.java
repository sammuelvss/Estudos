package poo;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        circulo c1 = new circulo(2);
        circulo c2 = new circulo(5);
        System.out.println(c1.area());
        System.out.println(c2.area());

        ret re1 = new ret(3,5);
        ret re2 = new ret(6,2);
        ret re3 = new ret();
        System.out.println(re1.area());
        System.out.println(re2.area());
        System.out.println(re3.area());

        System.out.println("-----------");

        quadrado q1 = new quadrado(5);
        System.out.println(q1.area());
        quadrado q2 = new quadrado(5);
        System.out.println(q2.comprimento());
        quadrado q3 = new quadrado();
        System.out.println(q3.area());

        quad(q1.lado,q2.area(), q2.comprimento());

        q1.desenha();
    }


    public static void quad(double lado, double area, double comprimento){
        System.out.println("O quadrado de lado " + lado + " tem " + area + " de área e " + comprimento + " de comprimento.");

    }
}
