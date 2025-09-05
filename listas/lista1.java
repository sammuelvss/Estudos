package listas;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
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

        
        /*Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();

        if (n <= 0){
            System.out.println("numero não é positivo!");
            return;
        }

        int [][] v = new int [n][n];
        
        for (int i = 0; i < n; i++) {
            v[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    v[i][j] = 1;
                } else {
                    v[i][j] = v[i - 1][j - 1] + v[i - 1][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
        for (int k = 0; k < n - i - 1; k++) {    
        }
            
        for (int j = 0; j <= i; j++) {
             System.out.print(v[i][j] + " ");
        }
        System.out.println();
        }*/
       
//-----------------------------------------------------------------------------------------

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

        /*Scanner ler = new Scanner(System.in);
        
        int [][] m = new int[10][10];
        int a;
        int b;
        int c;

        for(int i = 0; i < m.length; i++){
            System.out.println();
            for(int j = 0; j < m.length; j++){
                m[i][j] = ler.nextInt();
                if(i < j ){
                    a = (((2 * i) + (7 * j))-2);
                    m[i][j] = a;
                } else if (i == j){
                    b = ((3*(i*2)-1));
                    m[i][j] = b;
                } else if (i > j){
                    c = (4*(i*i*i) - (5*(j*2)) + 1);
                    m[i][j] = c;
                } else {
                    m[i][j] = ler.nextInt();
                }
            }
        }
        System.out.println();
        for(int i = 0; i < m.length; i++){
            System.out.println();
            for(int j = 0; j < m.length; j++){
                System.out.println(m[i][j] + ",");
            }
        } */


        //questão 20;

        /*Scanner ler = new Scanner(System.in);
        
        int [][] m = new int[3][3];
        int somaDPC = 0;
        int somaDPB = 0;
        int somaDP = 0;
        int somaDS = 0;
        for (int i = 0; i < 3; i++){
            System.out.println();
         for (int j = 0; j < 3; j++){
            m[i][j] = ler.nextInt();
            if (i == j){
                somaDP += m[i][j];
            } if (i + j == 2){
                somaDS += m[i][j];
            } if (i > j){
                somaDPB += m[i][j];
            } if (j > i){
                somaDPC += m[i][j];
            }
            }
        }

        for (int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 3; j ++){
                System.out.print(m[i][j] + ",");
            }
        }
        System.out.println("\nsoma diagonal principal: " + somaDP);
        System.out.println("soma diagonal secundaria: " + somaDS);
        System.out.println("soma diagonal principal cima: " + somaDPC);
        System.out.println("soma diagonal principal baixo: " + somaDPB);
    }
}*/


    //questão 21

        /*Scanner ler = new Scanner(System.in);
        
        int [][] m = new int[4][4];
        int zero = 0;
        int numeros = 0;
        for(int i = 0; i < 4; i++){
            System.out.println();
            for(int j = 0; j < 4; j++){
                 numeros = ler.nextInt();
                if (numeros >= 1 && numeros <= 20){
                    m[i][j] = numeros;
                } else {
                    break;
                }
               
            }
        }

        for(int i = 0; i < 4; i++){
            System.out.println();
            for(int j = 0; j < 4; j++){
                 System.out.print(m[i][j] + ",");
            }
        }

        System.out.println();

       for(int i = 0; i < 4; i++){
            System.out.println();
            for(int j = 0; j < 4; j++){
                 if (j > i){
                    m[i][j] = zero;
                }
                 System.out.print(m[i][j] + ",");
            }
        }*/


        //questão 22

        //Scanner ler = new Scanner(System.in);
        
        /*int [][] m = new int[5][5];
        List<Integer> numerosUsados = new ArrayList<>();
       
        for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                int numAleatorio;
                do {
                numAleatorio = (int) (Math.random() * 100);
                } while (numerosUsados.contains(numAleatorio));
                numerosUsados.add(numAleatorio);
                m[i][j] = numAleatorio;
               
            }
        }

          for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                 System.out.print(m[i][j] + ",");
            }
        }*/


        //questão 23

        /*Scanner ler = new Scanner(System.in);
        int [] v = new int[3];
        int [][] m = new int[3][3];
        int soma1 = 0;
        int soma2 = 0;
        int soma3 = 0;
        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 3; j++){
                m[i][j] = ler.nextInt();
                if (j == 0){
                    soma1 += m[i][j];
                   
                } if (j == 1){
                    soma2 += m[i][j];
                  
                } if (j == 2){
                    soma3 += m[i][j];
                
                }

            }
        }
        
           for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 3; j++){
                 System.out.print(m[i][j] + ",");
            }
        }

        System.out.println();
        System.out.println(soma1 + "," + soma2 + "," + soma3);
         v[0] = soma1;
         v[1] = soma2;
         v[2] = soma3;
         ler.close();
        System.out.println("vetor: " + java.util.Arrays.toString(v));*/



        //questão 24


        /*Scanner ler = new Scanner(System.in);
        int matricula = 0;
        double mediaProvas = 0.0;
        double mediaTrabalhos = 0.0;
        double notaFinal = 0.0;
        double maiornota = -1.0;
        double melhoraluno = -1.0;
        double somaGeral = 0.0;
        double mediaGeral = 0.0;
        double [][] m = new double[5][4];
        for (int i = 0; i < 5; i++){
            System.out.println();
                System.out.println("digite a matricula:");
                matricula = ler.nextInt();
                System.out.println("digite a media das provas:");
                mediaProvas = ler.nextDouble();
                System.out.println("digite a media dos trabalhos:");
                mediaTrabalhos = ler.nextDouble();
                notaFinal = mediaProvas + mediaTrabalhos;
                    m[i][0] = matricula;
                    m[i][1] = mediaProvas;
                    m[i][2] = mediaTrabalhos;
                    m[i][3] = notaFinal;
                    somaGeral += notaFinal;
                if (notaFinal > maiornota) {
                maiornota = notaFinal;
                melhoraluno = matricula;
            }
        }
        mediaGeral = somaGeral/5;
        System.out.println();
        System.out.println("MATRÍCULA   |   MÉDIA PROVAS   |   MÉDIA TRABALHOS   |  NOTA FINAL");

         for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 4; j++){
                 System.out.print("|  " + m[i][j] + "  |   |   ");
            }
        }


    System.out.println("");
      System.out.println("MAIOR NOTA:" + maiornota + ", MATRICULA: " + melhoraluno);

        System.out.println("media geral dos alunos: " +  mediaGeral);*/



        //questão 25

        /*Scanner ler = new Scanner(System.in);
        int [][] m1 = new int[2][2];
        int [][] m2 = new int[2][2];
        int [][] mEscolha = new int [2][2];

        System.out.println("MATRIZ 1");
        for(int i = 0; i < 2; i++){
            System.out.println();
            for(int j = 0; j < 2; j++){
                m1[i][j] = ler.nextInt();
            }
        }
        System.out.println("MATRIZ 2");
        for(int i = 0; i < 2; i++){
            System.out.println();
            for(int j = 0; j < 2; j++){
                m2[i][j] = ler.nextInt();
            }
        }
        ler.nextLine();

        System.out.println("Escolha uma operação:");
        System.out.println(" (a) Somar as duas matrizes");
        System.out.println(" (b) Subtrair as duas matrizes");
        System.out.println(" (c) Adicionar uma constante as duas matrizes");
        System.out.println(" (d) Imprimir as matrizes");
        System.out.print("Sua opção: ");
        String letra = ler.nextLine();
        
         System.out.println();
            if (letra.equals("a")) {
            System.out.println("RESULTADO DA SOMA:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    mEscolha[i][j] = m1[i][j] + m2[i][j];
                }
            }
            imprimirMatriz(mEscolha);
                    
                } else if (letra.equals("b")) {
            System.out.println("RESULTADO DA SUBTRAÇÃO:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    mEscolha[i][j] = m1[i][j] - m2[i][j];
                }
            }
            imprimirMatriz(mEscolha);
            
        } else if (letra.equals("c")) {
            System.out.print("Digite a constante a ser adicionada: ");
            int constante = ler.nextInt();
            
            System.out.println("RESULTADO DA ADIÇÃO DE CONSTANTE:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    mEscolha[i][j] = ((m1[i][j] + constante) + (m2[i][j] + constante));
                }
            }
            imprimirMatriz(mEscolha);
            
        } else if (letra.equals("d")) {
            System.out.println("MATRIZ 1 ORIGINAL:");
            imprimirMatriz(m1);
            System.out.println("MATRIZ 2 ORIGINAL:");
            imprimirMatriz(m2);
            
        } else {
            System.out.println("Opção inválida!");
        }
                
    }


        public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + ",");
            }
            System.out.println();
            }
        }
    }*/



        //questão 26

        /*Scanner scanner = new Scanner(System.in);
        int[][] m = new int[10][10];
  
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                m[i][j] = -1;
            }
        }

        System.out.println("Digite o número de tentativas de compras (N):");
        int numCompras = scanner.nextInt();

        for (int i = 0; i < numCompras; i++) {
            System.out.println("Compra " + (i + 1));
            System.out.print("Digite o número da fileira (0-9): ");
            int fileira = scanner.nextInt();
            System.out.print("Digite o número da poltrona (0-9): ");
            int poltrona = scanner.nextInt();

            if (fileira >= 0 && fileira < 10 && poltrona >= 0 && poltrona < 10) {        
                if (m[fileira][poltrona] == -1) {
                    m[fileira][poltrona] = 1;
                    System.out.println("Ingresso vendido com sucesso!");
                } else {
                    System.out.println("Poltrona já foi vendida.");
                }
            } else {
                System.out.println("Fileira ou poltrona inválida. Tente novamente.");
            }
        }
    
        System.out.println();
    
        System.out.println("--- Status Final das Poltronas ---");
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print(m[i][j] + " ");
            }
        }*/


        //questão 27


        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número de alunos na turma:");
        int numeroAlunos = ler.nextInt();
        ler.nextLine();
        for (int i = 0; i < numeroAlunos; i++) {
            
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nomeAluno = ler.nextLine();
            System.out.println("Digite a presença em 30 dias 'F' ou 'P':");
            String presenca = ler.nextLine();
            
            int contFaltas = 0;
            String diasFaltados = "";

            for (int j = 0; j < presenca.length(); j++) {
                if (presenca.charAt(j) == 'F') {
                    contFaltas++;
                    diasFaltados = diasFaltados + (j + 1) + ""; 
                }
            }
            
            if (contFaltas > 10) {
                System.out.println("REPROVADO POR FALTA");
                System.out.println("Nome: " + nomeAluno);
                System.out.println("Dias que faltou: " + diasFaltados);
            }
        }
        ler.close();
    }
}*/




    


