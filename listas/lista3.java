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
        Scanner ler = new Scanner(System.in);
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
}

