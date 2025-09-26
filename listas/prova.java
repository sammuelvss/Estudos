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

        /*System.out.println(potencia(2, 3));
    }
    public static int potencia(int x, int n){
        if(n == 0){
            return 1;
        } else {
            return x * potencia(x, n - 1);
        }*/


        /*Scanner ler = new Scanner(System.in);
        int [][] m1 = new int[3][3];
        int [][] m2 = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
            m1[i][j] = ler.nextInt();
             }
             System.out.println();
         }
         int n = m2.length;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                m2[j][n - 1 - i] = m1[i][j];
             }
         }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(m2[i][j] + " ");
             }
             System.out.println();
         }*/


        /*int [] v  = new int[5];
        Scanner ler = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            v[i] = ler.nextInt();
        }
        selectionSort(v);
        System.out.println();
        for(int i = 0; i < v.length; i++){
            System.out.println(v[i] + " ");
        }

    }

        public static void selectionSort(int [] v){

           int n = v.length;
            int menor;
            for(int i = 0; i < n; i++){
                menor = v[i];
               
           
                for(int j = i + 1; j < n; j++){
                    if(v[j] < menor){
                        menor = v[j];
                        int temp = v[i];
                        v[i] = v[j];
                        v[j] = temp;
                    }
                }
            }
        }*/


        /*Scanner ler = new Scanner(System.in);
        int[][] m = new int[5][5];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                m[i][j] = i * j;
            }
        }
            System.out.println("digite um numero.");

            int num = ler.nextInt();
            int linha = 0;
            int coluna = 0;
            int cont = 0;
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                if(m[i][j] == num){
                    linha = i;
                    coluna = j;
                    System.out.println("Achei " + num + " na posicao " + linha + " " + coluna);
                    cont++;
                } if(cont == 0 && i == 4 && j == 4){
                    System.out.println("Numero nao encontrado");           
                }
            }
        }*/
 /*int [] v = new int[10];
        Scanner ler = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            v[i] = ler.nextInt();
        }

        encontrarModa(v);
    }

    public static void encontrarModa(int[] v){
        int num = 0;
        int maior = 0;
        int moda = 0;
        int cont = 0;
        for(int i = 0; i < 10; i++){
             cont = 0;
            num = v[i];
            for(int j = 0; j < 10; j++){
                if(num == v[j]){
                    moda = num;
                    cont++;
                }           
                
            }
            if(cont > maior){
                if(cont == 1){
                    System.out.println("");
                } else{
                        maior = cont;
                        System.out.println("Moda: " + moda + " Repeticoes: " + maior);
                    }
                }
            }*/


                /*int[] v = {1, -2, 3, -4, 5 , -6};
                removerNegativos(v);
                for(int i = 0; i < v.length; i++){
                    System.out.print(v[i] + " ");
                }

    }    public static void removerNegativos(int[] v){
        
        int n = v.length;
        int num;

        for(int i = 0; i < n; i++){
           num = v[i];
        
        for(int j = 0; j < n / 2; j++){         
            
            if(num < 0 && i < n / 2){
                int temp = v[n - i - 1];
                v[n - i - 1] = v[i];
                v[i] = temp;
                
                
                        
            } if(num > 0 && i >= n / 2){       
                int temp = v[i];
                v[i] = v[n - i - 1];
                v[n - i - 1] = temp;
                
            }
        }
        }*/


        /*int[][] m = {
              {1, 2, 3, 4, 5, 6, 7, 8}, 
              {9,10,11,12,13,14,15, 16},
              {17,18,19,20,21,22,23,24},
              {25,26,27,28,29,30,31,32},
              {33,34,35,36,37,38,39,40},
              {41,42,43,44,45,46,47,48},
              {49,50,51,52,53,54,55,56},
              {57,58,59,60,61,62,63,64}
        };
        char [] direcoes = {'D', 'B', 'E', 'C'};
        System.out.println(calcularItens(m, direcoes));
    }
    public static int calcularItens(int[][] m, char[] direcoes){
      
         int linha = 0, coluna = 0; // posição inicial
        int soma = m[linha][coluna];

        for (int i = 0; i < direcoes.length; i++) {
            char d = direcoes[i];
            if (d == 'D' && coluna < m[0].length - 1) { // direita
                coluna++;
            } else if (d == 'E' && coluna > 0) {        // esquerda
                coluna--;
            } else if (d == 'B' && linha < m.length - 1) { // baixo
                linha++;
            } else if (d == 'C' && linha > 0) {         // cima
                linha--;
            } else {
                System.out.println("Direção inválida ou movimento impossível!");
                continue;
            }
            soma += m[linha][coluna]; // soma o novo valor
        }

        return soma;*/


        /*int[][] m = new int[5][10];

        Scanner ler = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                m[i][j] = ler.nextInt();
            }
         }
        
         int filme = 1;
            int idadeM = 18;
            System.out.println("Media por filme: " + mediaPorFilme(m, filme));
            System.out.println("Espectador mais velho: " + espectadorMaisVelho(m));
            System.out.println("Filmes para maiores de " + idadeM + ": " + Arrays.toString(filmeParaMaiores(m, idadeM)));
            ler.close();

    }
    public static double mediaPorFilme(int[][] m, int filme){
        double media = 0;
        for(int j = 0; j < 10; j++){
           if(filme == 1){
            media += m[0][j];
           } else if(filme == 2){
            media += m[1][j];
           } else if(filme == 3){
            media += m[2][j];
           } else if(filme == 4){
            media += m[3][j];
           } else if(filme == 5){
            media += m[4][j];
           }
        }
        return media / m.length;

    }
    public static int espectadorMaisVelho(int[][] m){
        int maior = m[0][0];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                if(m[i][j] >= maior){
                    maior = m[i][j];
                }
            }
        }
        return maior;
    }
    public static int [] filmeParaMaiores(int[][] m, int idadeM){
        int [] v = new int[5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                if(m[i][j] >= m[i][j] && m[i][j] >= idadeM){
                    v[i] = i;
                }
            }
        }
        return v;*/

        /*int[][] m = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        System.out.println(isIdentityMatrix(m));
        }

        public static boolean isIdentityMatrix(int[][] m){
            int n = m.length;
            boolean identidade = true;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(i == j && m[i][j] != 1){
                        identidade = false;
                    } else if(i != j && m[i][j] != 0){
                        identidade = false;
                    }
                }
            }
            return identidade;*/



            /*int [] v1 = {1, 2, 2, 3, 4};
            int [] v2 = {2, 3, 3, 4, 6};
     
            intersecao(v1, v2);
        }
        public static void intersecao(int[] v1, int[] v2){
         
            for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    System.out.print(v1[i] + " ");
                    break; // evita repetir
                }
            }
         }*/



         /*int[] v = {1, 2, 3, 4, 5};
            System.out.println(somaVetor(v, 2));
    }
    public static int somaVetor(int[] v, int indice){
        if(indice == v.length){
            return 0;
        } else {
            return v[indice] + somaVetor(v, indice + 1);
        }*/

        /*int[] v = {1, 2, 3, 4, 5};
        particionar(v);
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
    }
    public static void particionar(int[] v){
        int n = v.length;
        int ini = 0;
        int fim = n - 1;

        for(int i = 0; i < n / 2; i ++){
            if(v[i] % 2 == 0 ){
                int temp = v[ini];
                v[ini] = v[i];
                v[i] = temp;
                ini++;
            }
            if(v[i] % 2 != 0){
                int temp = v[fim];
                v[fim] = v[i];
                v[i] = temp;
                fim--;
            }
        }*/
        

        /*int[][] m = {
            {1, 7, 3},
            {7, 4, 5},
            {3, 5, 6}

        };
        System.out.println(isSymmetric(m));
        }
        public static boolean isSymmetric(int[][] m){
         
            boolean simetrica = false;
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(m[i][j] == m[j][i]){
                        simetrica = true;
                    } else {
                        return false;
                
                 }     
             }   
        }
        return simetrica;*/


        int[] v = {1, 5, 3, 9};

        System.out.println(segundoMaior(v));
    }

        public static int segundoMaior(int[] v){

            int maior = 0;
             int  maior2 = 0;
            for(int i = 0; i < v.length; i++){
                if(v[i] >= maior){
                    maior = v[i];
                    
                 } if(v[i] >  maior2 && v[i] != maior){
                        maior2 = v[i];
                       
                }
            }
             
               return maior2;
        }
    }



           







    


