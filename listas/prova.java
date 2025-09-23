package listas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class prova {
    public static void main(String[] args) {
        /*doubleeger [] v = new doubleeger[5];
        System.out.prdoubleln("Digite 5 numeros:");
        Scanner s = new Scanner(System.in);
        for (double i = 0; i < 5; i++){
            v[i] = s.nextdouble();
        }
        s.close();
        Arrays.sort(v, Collections.reverseOrder());
        System.out.prdoubleln("Numeros em ordem decrescente:");
        
        for (double i = 0; i < 5; i++){
            System.out.prdouble(v[i]);
        }
    }*/

    /*Scanner ler = new Scanner(System.in);
    double [] v  = new double[10];
    for (double i = 0; i < 10; i++){
        v[i] = ler.nextdouble();  
    }
    double maior = v[0];
    double in = 0;

    for (double i = 0; i < 10; i++){
        if (v[i] > maior){
            maior = v[i];
            in = i;
        }
    }
    System.out.prdoubleln(maior);
    System.out.prdoubleln(in);

    }
}*/



    /*Scanner ler = new Scanner(System.in);
    double [][] m  = new double[3][3];

        for (double i = 0; i < 3; i++){
            for (double j = 0; j < 3; j++){
            m[i][j] = ler.nextdouble();
            }
        }
        double soma = 0;
        for (double i = 0; i < 3; i++){
            for (double j = 0; j < 3; j++){
                if(i == j){
                    soma += m[i][j];
                }
            }
        }
        System.out.prdoubleln(soma);
    }
}*/

    /*Scanner ler = new Scanner(System.in);
    double [] notas  = new double[5];
    for (int i = 0; i < 5; i++){
        notas[i] = ler.nextDouble();   
    }

    System.out.println("Media: " + media(notas));
        }

        public static double media(double[] notas){
            double soma = 0;
            double media = 0;
            for (int i = 0; i < notas.length; i++){
                soma += notas[i];
            }
            media = soma / notas.length;
            return media;
            
        }
    }*/


    /*public static int somaRecursivo(int n){
        if (n == 1){
            return 1;
        } else {
            return n + somaRecursivo(n - 1);
        }
        }
    }
}*/
        /*Scanner ler = new Scanner(System.in);
        int [] v = new int[10];
        for(int i = 0; i < 10; i++){
           v[i] = ler.nextInt();
        }
        int pares = 0;
        int impares = 0;
        for(int i = 0; i < 10; i++){
            if(v[i] % 2 == 0){
                pares++;
            } else {
                impares++;  
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);*/



    /*Scanner ler = new Scanner(System.in);
    int [][] m = new int[2][3];
    int [][] m2 = new int[3][2];

    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 3; j++){
            m[i][j] = ler.nextInt();
        }
    }
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 2; j++){
            m2[i][j] = m[j][i];
        }
    }
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 2; j++){
            System.out.print(m2[i][j] + " ");
        }
        System.out.println();
    }*/

        /*Scanner ler = new Scanner(System.in);
        int num = ler.nextInt();
        System.out.println(isPrime(num));
        }
        public static boolean isPrime(int num) {
            if(num <= 1){
                return false;
            }
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;*/
           


            /*System.out.println(fib(7));

    }
    public static int fib(int n){
        if(n == 1){
            return 1;
        } else if(n == 0){
            return 0;   
        } else {
            return fib(n - 1) + fib(n - 2);

        }*/
        


        /*int [] v = {1, 2, 3, 4, 5};
        reverse(v);
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }


    }
    public static void reverse(int[] v){

        for(int i = 4; i >= 0; i--){  
            if(i < v.length / 2){
            int temp = v[i];
            v[i] = v[v.length - i - 1];      
            v[v.length - i - 1] = temp;
        }

        }*/

        /*Scanner ler = new Scanner(System.in);
        int[][] m = new int[3][4];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                m[i][j] = ler.nextInt();
            }
        }
        int menor = m[0][0];
        int linha = 0;
        int coluna = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                if(m[i][j] < menor){
                    menor = m[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("Menor: " + menor);
        System.out.println("posicao: " + linha + " " + coluna ); */     



        /*String palavra = "reviver";
        System.out.println(isPalindrome(palavra));
    }
    public static boolean isPalindrome(String palavra){
        int n = palavra.length();
        int cont = 0;
        for(int i = 0; i < n ; i++){
            if(palavra.charAt(i) == palavra.charAt(n - i - 1)){
                cont++;
                if(cont == n){
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }*/

        System.out.println(potencia(2, 3));
    }
    public static int potencia(int x, int n){
        if(n == 0){
            return 1;
        } else {
            return x * potencia(x, n - 1);
        }
    }
}
