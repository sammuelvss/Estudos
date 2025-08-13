package treino.desafios;

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
    System.out.println(raiz(a, b, c));
    }
 

    public static double raiz (int a, int b, int c){
    double delta = b*b - 4 * a * c;
    double raiz = (-b + Math.sqrt(delta))/ 2 * a;
    System.out.println(raiz);
    return raiz;
    }

}    



  //(x = (-b ± √Δ) / 2a) 

