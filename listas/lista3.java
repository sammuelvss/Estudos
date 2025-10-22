package listas;

import java.util.Scanner;

class lista3 {
    public static void main(String[] args) {
       
        // q1 - busca linear
        /*Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = ler.nextInt();
        System.out.println("tamanho do vetor:");
        int n = ler.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = ler.nextInt();
        }
        int resultado = buscaLinear(vetor, numero, n);
        if (resultado == -1) {
            System.out.println(resultado + " = Número não encontrado no vetor.");
        } else {
            System.out.println("Número encontrado na posição: " + resultado);
        }
    }
    public static int buscaLinear(int[] vetor,int numero, int n) {

        for (int i = 0; i < n; i++) {
            if(vetor[i] == numero) {
                return i;
            }            
          }
          return -1;
        }
    }*/

    //q2
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de livros na biblioteca:");
        int n = ler.nextInt();
        ler.nextLine(); 
        String[] livros = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do livro " + (i + 1) + ":");
            livros[i] = ler.nextLine();
        }
        System.out.println("Digite a palavra-chave de busca:");
        String palavraChave = ler.nextLine();
        buscarLivros(livros, palavraChave, n);
        ler.close();

       }   
       public static void buscarLivros(String[] livros, String palavraChave, int n){
        String nomeLivro = "";
        boolean encontrado = false;
        System.out.println("Livros encontrados:");
        for (int i = 0; i < n; i++) {
            nomeLivro = livros[i];
            if (nomeLivro.toLowerCase().contains(palavraChave.toLowerCase())) {
                System.out.println(livros[i]);
                encontrado = true;
            } else if (!encontrado && i == n - 1) {
                System.out.println("Nenhum livro encontrado");
            }
       }
    }
}*/

    //q3
 
    /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
        int n = ler.nextInt();
        System.out.println("qual numero você quer buscar no vetor?");
        int numero = ler.nextInt();

        int [] v = new int[n];
        for(int i = 0; i < n; i++){
            v[i] = ler.nextInt();
        }
        ordenarVetor(v, n);
        System.out.println("Vetor ordenado:");
        for(int i = 0; i < n; i++){
           System.out.println(v[i]);
        }
        System.out.println();
        System.out.println("resultado:");
        int [] busca = buscaBinaria(v, numero, n);
        int indice = busca[0];
        int passos = busca[1];
        if(indice != -1){
            System.out.println(indice + "," + passos);
        } else {
            System.out.println(indice + "," + passos);
        }
        
    }
        public static void ordenarVetor(int [] v, int n){

            int temp = 0;
            for(int i = 0; i < n; i++){
                for(int j = 1; j < (n - i); j++){
                    if(v[j - 1] > v[j]){
                        temp = v[j -1];
                        v[j - 1] = v[j];
                        v[j] = temp;
                    }
                }
            }
        }

        public static int[] buscaBinaria(int []v, int numero, int n){

            int cont = 0;
            int inicio = 0;
            int fim = n - 1;
            
            while(inicio <=  fim){
                int meio = (inicio + (fim -  inicio))/2;
                
                if(v[meio] == numero){
                       return new int[] {meio, cont};
                }
                if (v[meio] < numero){
                    inicio = meio + 1;
                } else {
                    fim =  meio -  1;
                }
                cont ++;
            }
            return new int[] {-1, cont};
        }
    }*/

    // q4 

     /*Scanner ler = new Scanner(System.in);
        int cont = 0;
        System.out.println("Digite o tamanho da matriz:");
        int l = ler.nextInt();
        int c = ler.nextInt();
        ler.nextLine();
        System.out.println("Você tem uma matriz " + l + " 3por " + c + "!");
        String [][] m =  new String[l][c];
        String [] v = new String[l];
        for(int i = 0; i < v.length; i++){
            System.out.println("Digite o gênero (" + (i+1) + ") :");
            v[i] = ler.nextLine();
        }
        System.out.println("digite " + c + " filmes em ordem alfabética:");
        for(int i = 0; i < m.length; i++){
            System.out.println("Digite os filmes do gênero: " + v[i]);
            for(int j = 0; j < m[0].length; j++){
                System.out.println("filme ("+ (j+1) + ")");
                m[i][j] = ler.nextLine();
            }
        }

        System.out.println("digite o nome do filme:");
        String busca = ler.nextLine();
        if(buscarTitulo(m, busca, v) < 0){
            System.out.println("Título não encontrado!");
        } else {
        for(int i = 0; i < v.length; i++){
            if (buscarTitulo(m, busca, v) == i){
                System.out.println(v[i]);
            }
        }
        }
    }
    public static int buscarTitulo(String [][] m, String busca, String [] V){
         
            int colunas = m[0].length;
          
            int inicio;
            int fim;
            for (int i = 0; i < m.length; i ++){
                for(int j = 0; j < m[0].length; j++){
            inicio = 0;
            fim = colunas - 1;
                    while (inicio <= fim){
                        int meio = inicio + (fim - inicio)/2;
                        String primeiroElemento = m[i][0];                       
                        if (m[i][meio].equals(busca)){
                            return i;
                        }
                        if (busca.compareTo(primeiroElemento) < 0) {
                            fim = meio - 1;
                        } else {
                            inicio = meio + 1;
                        }
                    }
                }
            }
            return -1;

        }
    }*/

    // q5

    Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos:");
        int p = ler.nextInt();
        int [][] m = new int[p][];
        for (int i = 0; i < p; i++) {    
        System.out.println("Digite o número de anos que vendas foram registradas:");
        int n = ler.nextInt();
        m[i] = new int[n];
        System.out.println("Digite as vendas do produto " + (i + 1) + ":");
        for (int k = 0; k < n; k++) {        
             m[i][k] = ler.nextInt();
        }
    }  
        inserctionSort(m, p);
        for (int i = 0; i < p; i++) {
            System.out.println("Vendas ordenadas do produto " + (i + 1) + ":");
            
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
            if(m[i].length % 2 == 0){
                int meio1 = m[i].length / 2;
                int meio2 = meio1 - 1;
                double mediana = (m[i][meio1] + m[i][meio2]) / 2.0;
                System.out.println("Mediana: " + mediana);
            } else {
                int meio = m[i].length / 2;
                double mediana = m[i][meio];
                System.out.println("Mediana: " + mediana);
             }
             System.out.println();
        }
    }
        
        
    public static void inserctionSort(int [][] m, int p){
        for(int i = 0; i < p; i++){
            int n = m[i].length;
            for(int j = 1; j < n; j++){
                int aux = m[i][j];
                int k = j - 1;
                while(k >= 0 && m[i][k] > aux){
                    m[i][k + 1] = m[i][k];
                    k--;
                }
                m[i][k + 1] = aux;
            }
        }
    }
}
