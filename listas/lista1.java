package listas;

import java.util.Scanner;

public class lista1 {

public static void main(String[] args) {
    

    //questão 01

/*  int a[] = {1,0,5,-2,-5,7};
    int soma = a[0] + a[1] + a[5];
    System.out.println("a soma do valores do vetor é " + soma);
    a[4] = 100;
    for (int i = 0; i < 6; i++){
    System.out.println("posição " + i + " do vetor é: " + a[i]);
    }*/


    //questão 02

    
    /*Scanner ler = new Scanner(System.in);
    int [] v = new int [6];
    for (int i = 0; i < v.length; i++) {
        v[i] = ler.nextInt();
    }
    for (int i = 0; i < v.length; i++){
        System.out.print(v[i] + ",");
    }*/
    

    //questão 03

    /*Scanner ler = new Scanner(System.in);
    int [] nomes = new int [10];
    for (int i = 0; i < nomes.length; i++) {
     nomes[i] = ler.nextInt();   
     }
     for (int i =0; i < nomes.length; i++){  
         if  nomes[i] % 2 == 0){
                System.out.print nomes[i] + ",");
         }
    }
    System.out.println();*/



    
    //questão 04

/*Scanner ler = new Scanner(System.in);
    String [] nomes = new String [15];
    for (int i = 0; i < nomes.length; i++) {
        nomes[i] = ler.nextLine();   
    }
System.out.println();

for (int i = nomes.length-1; i >= 0  ; i--){  
            System.out.println(nomes[i]);
        }*/




    //questão 05



    /*Scanner ler = new Scanner(System.in);
    int numeros[] = new int[10];
    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = ler.nextInt();   
    }

    System.out.println();
    System.out.println("números impares: ");
    for (int i = 0; i < numeros.length; i++){  
        if  (numeros[i] % 2 != 0){
            System.out.print(numeros[i] + ",");
        } 
    }
    System.out.println();
    System.out.println("números pares: ");
    for (int i = 0; i < numeros.length; i++){  
        if  (numeros[i] % 2 == 0){
            System.out.print(numeros[i] + ",");
        } 
    }*/



    //questão 06
    /*Scanner ler = new Scanner(System.in);
    String[] nomes = new String[10];
    int [] idades = new int[10];
    double media = 0;
    for (int i = 0; i < idades.length; i++) {
        System.out.println("Digite o nome: ");
        nomes[i] = ler.next();
        System.out.println("Digite a idade: ");
        idades[i] = ler.nextInt();
        nomes[i].equals(idades[i]);
    }
    System.out.println();


    for (int i = 0; i < idades.length; i++){
        media = media + idades[i];
    }

    media = media / idades.length;
    System.out.println("A média das idades é: " + media);


    for (int i = 0; i < idades.length; i++){
    if(idades[i] > media){
        System.out.println("Nomes com idade acima da média: " + nomes[i]);
        }
    }*/


    //questão 07


    /*Scanner ler = new Scanner(System.in);
    int [] a = new int [10];
    int [] b = new int [10];
    int [] c = new int [20];

    for (int i = 0; i < a.length; i++) {
        a[i] = ler.nextInt();  
    } 
       for (int i = 0; i < b.length; i++) {
        b[i] = ler.nextInt();
    }
    System.out.println();
    for (int i = 0; i < a.length; i++){
        c[i] = a[i];
        System.out.print(c[i] + ",");
        c[i] = b[i];
        System.out.print(c[i] + ",");
    }*/



    //questão 08

    /*Scanner ler = new Scanner(System.in);
    int [] a = new int [10];
    int [] b = new int [10];
    int [] c = new int [10];
    for (int i = 0; i < a.length; i++) {
        a[i] = ler.nextInt();  
    } 
       for (int i = 0; i < b.length; i++) {
        b[i] = ler.nextInt();
    }


    System.out.println();

    for (int i = 0; i < a.length; i++){
        if (a[i] % 2 == 0){
            c[i] = a[i];
        } else{
            c[i] = b[i];
        }
        System.out.print(c[i] + ",");
        }*/




    //questão 09


    /*Scanner ler = new Scanner(System.in);
    int [] numeros = new int [100];

    for (int i = 0; i < numeros.length; i++) {
        if ( i  <= 1000 && i % 7 != 0 && i % 10 != 7){
        numeros[i] = i;  
        System.out.print(numeros[i] + ","); 
        }
        }*/



        //questão 10

        /*Scanner ler = new Scanner(System.in);
        int [] x = new int [5];
        int [] y = new int [5];
        int [] soma = new int [5];
        int [] produto = new int [5];
        int [] diferenca = new int [5];
        int [] intersecao = new int [5];
        int [] uniao = new int [10];
    for (int i = 0; i < x.length; i++) {
        x[i] = ler.nextInt();  
    } 
    System.out.println();
       for (int i = 0; i < y.length; i++) {
        y[i] = ler.nextInt();
       }



         System.out.println("soma: ");
       for (int i = 0; i < x.length; i++){
       soma[i] = x[i] + y[i];
       System.out.print(soma[i] + ","); 
       }


         System.out.println("\nproduto: ");
         for (int i = 0; i < x.length; i++){
          produto[i] = x[i] * y[i];
          System.out.print(produto[i] + ","); 
          }


          System.out.println("\ndiferença: ");
          for (int i = 0; i < x.length; i++){
           diferenca[i] = x[i] - y[i];
           System.out.print( diferenca[i] + ","); 
           }

           System.out.println("\ninterseção: ");
              for (int i = 0; i < x.length; i++){
                if (x[i] == y[i]){
                intersecao[i] = y[i];
                System.out.print( intersecao[i] + ","); 
                }
                }
    
                System.out.println("\nunião: ");
                    for (int i = 0; i < uniao.length; i++){
                 System.arraycopy(x, 0, uniao, 0, x.length);
                    System.arraycopy(y, 0, uniao, x.length, y.length);
                 System.out.print( uniao[i] + ","); 
                    }*/


    //questão 11

    /*Scanner ler = new Scanner(System.in);
    int [] v = new int [10];
    double media = 0;
    int somaQuadrados = 0;
    double variancia = 0;
    for (int i = 0; i < v.length; i++) {
        v[i] = ler.nextInt();  
    }
    for (int i = 0; i < v.length; i++){
        media = media + v[i];
    }
    media = media / v.length;

    for (int i = 0; i < v.length; i++){
        somaQuadrados += Math.pow(v[i] - media, 2);
        }
        variancia = somaQuadrados / (v.length - 1);
        
         double desvioPadrao = Math.sqrt(variancia);

        System.out.println("Média: " + media);
        System.out.println("Desvio padrão: " + desvioPadrao);*/




        //questão 12


        /*Scanner ler = new Scanner(System.in);
        int [] v = new int [10];
        for (int i = 0; i < v.length; i++) {
            System.out.println("Digite um número (" + (i + 1)  + ") : ");
            int numero = ler.nextInt();
            v[i] = numero;
            for(int j = 0; j < i; j++){
            if (v[j] == numero){
                System.out.println("numero repetido, escreva outro número: ");
                i--;
                }
            }
        }
        for(int i = 0; i < 10; i++){
        System.out.print(v[i] + ",");
        }*/



        //questão 13

        //---------------------------INCOMPLETA--------------------------------------!

        
        /*Scanner ler = new Scanner(System.in);
        int [] v = new int [30];
        int num = ler.nextInt();
        v[0] = num;
        for (int i = 0; i < num; i++){
            System.out.println();
            for(int j = 0; j < num; j++){
                System.out.print(num);
            }
        }*/

        //---------------------------------------------------------------------------!










        // questão 14

        /*Scanner ler = new Scanner(System.in);
        int[][] m = new int[4][4];
        int cont = 0;
        for (int i = 0; i < 4; i++){
            System.out.println();
            for(int j = 0; j < 4; j++){
                m[i][j] = ler.nextInt();
                if (m[i][j] > 10){
                    cont++;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < 4; i++){
        for (int j = 0; j < 4; j++){
        System.out.print(m[i][j] + ",");
        }
        System.out.println();
        }

        System.out.println("tem " + cont + " numeros maiores que 10.");*/



        //questão 15


        /*Scanner ler = new Scanner(System.in);
        int[][] m = new int[5][5];
        int um = 1;
        int zero = 0;
        for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                if(i == j){
                    m[i][j] = um;
                } else {
                     m[i][j] = zero;
                }
            }
        }
        System.out.println();

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(m[i][j] + ",");
            }
            System.out.println();
        }*/


        //questão 16

        /*Scanner ler = new Scanner(System.in);
        int[][] m = new int[4][4];

        int produto = 0;
        for (int i = 0; i < 4; i++){
            System.out.println();
            for(int j = 0; j < 4; j++){
                produto = i * j;
                m[i][j] = produto;
            }
        }
        
        for (int i = 0; i < 4; i++){
        for (int j = 0; j < 4; j++){
        System.out.print(m[i][j] + ",");
        }
        System.out.println();
        }*/

        
        //questão 17


        /*Scanner ler = new Scanner(System.in);
        int[][] m = new int[4][4];
        int linha = -1;
        int coluna = -1;
        int maior = 0;
        int num = 0;
        for (int i = 0; i < 4; i++){
            System.out.println();
            for(int j = 0; j < 4; j++){
               num = ler.nextInt();
               m[i][j] = num;
               if  ( num > maior){
                 maior = num;
                 linha = i;
                 coluna = j;
               }
            }
        }
        for (int i = 0; i < 4; i++){
        for (int j = 0; j < 4; j++){
        System.out.print(m[i][j] + ",");
        }
        System.out.println();
        }
        System.out.println("o maior numero colocado foi: " + maior);
        System.out.println("localizado na linha " + linha + " e coluna " + coluna);*/



        //questão 18


        /*Scanner ler = new Scanner(System.in);
        int[][] m = new int[4][4];
        int linha = -1;
        int coluna = -1;
        int num = 0;
        int valor;
         System.out.println("digite o valor na matriz:");
        valor = ler.nextInt();
        System.out.println("digite a matriz:");
        for (int i = 0; i < 4; i++){
            System.out.println();
            for(int j = 0; j < 4; j++){
               num = ler.nextInt();
               m[i][j] = num;  
            }
        }

        System.out.println();

        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
               if (m[i][j] == valor){ 
                    linha = i;
                    coluna = j;
                } 
            }
        }
        
    
        for (int i = 0; i < 4; i++){
        for (int j = 0; j < 4; j++){
        System.out.print(m[i][j] + ",");
        }
        System.out.println();
        }
        if(linha != -1){
        System.out.println("\nO valor digitado está na posição " + linha + "," + coluna);
        } else {
            System.out.println("\nvalor não encontrado.");
        }*/


        //questão 19


    }
}