
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


        Scanner ler = new Scanner(System.in);
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
        }







    }
}