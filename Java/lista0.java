package Java;
import java.util.Scanner;

public class lista0 {
    public static void main(String[] args) {

        //QUESTÃO 01

    /*Scanner ler = new Scanner(System.in);
        System.out.println("digite o volume:");
    int volume = ler.nextInt();
    if (volume <= 0) {
        System.out.println("min volume");
    } else if (volume > 0 && volume <= 25) {
        System.out.println("low volume");
    } else if (volume > 0 && volume <= 25) {
        System.out.println("medium volume");
    }else if (volume > 25 && volume <= 75) {
        System.out.println("high volume");
    }else if (volume >= 100) {
        System.out.println("max volume");
    }*/




        // QUESTÃO 02


        /*Scanner ler = new Scanner(System.in);
        int cont = 0;
        System.out.println("digite o primeiro número:");
        int num1 = ler.nextInt();
        System.out.println("digite o segundo número:");
        int num2 = ler.nextInt();
        System.out.println("digite o terceiro número:");
        int num3 = ler.nextInt();
        if (num1 <= num2 && num2 <= num3){
            System.out.println(num3 + "," + num2 + "," + num1);
        } else if (num3 <= num2 && num2 <= num1){
            System.out.println(num1 + "," + num2 + "," + num3);
        } else if (num2 >= num1 && num1 >= num3){
            System.out.println(num2 + "," + num1 + "," + num3);
        } else if (num1 >= num2 && num1 <= num3){
            System.out.println(num3 + "," + num1 + "," + num2);
        } else if (num1 >= num3 && num2 <= num3){
            System.out.println(num1 + "," + num3 + "," + num2);
        } else if (num2 >= num1 && num1 <= num3) {
            System.out.println(num2 + "," + num3 + "," + num1);
        }*/


        //QUESTÂO 3


    /*Scanner ler = new Scanner(System.in);
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
    }*/



    //QUESTÃO 4


    Scanner ler = new Scanner(System.in);
    System.out.println("digite o dia:");
    int dia = ler.nextInt();
    System.out.println("digite o mês:");
    int mes = ler.nextInt();
    System.out.println("digite o ano:");
    int ano = ler.nextInt();
    
    if (dia >= 21 && dia <= 19 && mes == 3 || mes == 4) {
        System.out.println("ARIES");
    } else if (dia >= 20 && dia <= 20 && mes == 4 || mes == 5 ){
        System.out.println("TOURO");
    }



    }
}