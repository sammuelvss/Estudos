package questoes;


import java.util.Scanner;

public class q4 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros:");
int[] v = new int[10];
      
for (int i = 0; i < 10; i++) {
v[i]= ler.nextInt();
}
for (int i = 0; i <= v.length-1; i++) {
    int par = v[i] % 2;
    if (par == 0) {
        System.out.println("Número par: " + v[i]);
} else {
        System.out.println("Número ímpar: " + v[i]);


                }
            }
        }
    }