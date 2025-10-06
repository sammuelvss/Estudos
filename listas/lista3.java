package listas;

import java.util.Scanner;

class lista3 {
    public static void main(String[] args) {
       
        // q1 - busca linear
        Scanner ler = new Scanner(System.in);
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
    }

    //q2