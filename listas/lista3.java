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
 
    Scanner ler = new Scanner(System.in);
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
            System.out.println(indice);
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
    }

