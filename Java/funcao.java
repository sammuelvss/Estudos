package JavaIDE;

import java.util.Scanner;



public class funcao {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("calcular raiz:");
    System.out.println("digite o numero 1:");
    int a = ler.nextInt();
    System.out.println("digite o numero 2:");
    int b = ler.nextInt();
    System.out.println("digite o numero 3:");
    int c = ler.nextInt();
    ler.close();
    calcraiz(a, b, c);
    }
 
    public static double calcdelta (int a, int b, int c){
    return (b*b) - 4.0 * a * c;
    }


    public static void calcraiz (int a, int b, int c){
    double delta = calcdelta(a, b, c);
    System.out.println("\nO valor de delta é: " + delta);
    if (delta < 0) {
      System.out.println("\nNão há raízes reais.");
    } else if (delta == 0) {
      System.out.println("\nHá apenas uma raiz real.");
      double x = -b / (2 * a);
      System.out.println("\nA raiz é: " + x);
    } else {
      double raiz1 = (-b + Math.sqrt(delta)) / (2.0 * a);
      double raiz2 = (-b - Math.sqrt(delta)) / (2.0 * a);
      System.out.println("\nas raízes são: " + raiz1 + " e " + raiz2);
    }

    }
}




