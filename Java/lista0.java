//package Java;
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
    
    int maxDiaMes = 0;
    boolean bissexto;
    
    if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
        bissexto = true;
        System.out.println("\no ano é bissexto");
    } else {
        bissexto = false;
        System.out.println("\no ano não é bissexto");
    }
        if (bissexto == true && mes == 2){
        maxDiaMes = 29;
        } else if (mes == 2){
        maxDiaMes = 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            maxDiaMes = 30;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            maxDiaMes = 31;
        } else {
            System.out.println("mês inválido");
        }
        
        if (dia <= 0 || dia > maxDiaMes) {
            System.out.println("data inválida");
            throw new IllegalArgumentException("dia inválido para o mês");
        } else {
            System.out.println("data válida");
        }
        
        

        if (dia >= 21 && mes == 3 || dia <= 19 && mes == 4) {
            System.out.println("áries");
        }else if (dia >= 20 && mes == 4 || dia <= 20 && mes == 5) {
            System.out.println("touro");
        } else if (dia >= 21 && mes == 5 || dia <= 20 && mes == 6) {
            System.out.println("gêmeos");
        } else if (dia >= 21 && mes == 6 || dia <= 22 && mes == 7) {
            System.out.println("câncer");
        } else if (dia >= 23 && mes == 7 || dia <= 22 && mes == 8) {
            System.out.println("leão");
        } else if (dia >= 23 && mes == 8 || dia <= 22 && mes == 9) {
            System.out.println("virgem");
        } else if (dia >= 23 && mes == 9 || dia <= 22 && mes == 10) {
            System.out.println("libra");
        } else if (dia >= 23 && mes == 10 || dia <= 21 && mes == 11) {
            System.out.println("escorpião");
        } else if (dia >= 22 && mes == 11 || dia <= 21 && mes == 12) {
            System.out.println("sagitário");
        } else if (dia >= 22 && mes == 12 || dia <= 19 && mes == 1) {
            System.out.println("capricórnio");
        } else if (dia >= 20 && mes == 1 || dia <= 18 && mes == 2) {
            System.out.println("aquário");
        } else if (dia >= 19 && mes == 2 || dia <= 20 && mes ==3) {
            System.out.println("peixes");
        } else {
            System.out.println("data inválida");
        }

        

    }
}