package listas;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        

/*Scanner ler = new Scanner(System.in);
int[][] m = new int[2][4];
int cont = 0;
int cont2 = 0;
for (int i = 0; i < 2; i++){

for (int j = 0; j < 4; j++) {
    m[i][j] = ler.nextInt();
    if (m[i][j] % 2 == 0) {
        cont++;
    } else{
        cont2++;
    }
    
    

    
    }
}

for (int i = 0; i < 2; i++){

for (int j = 0; j < 4; j++){
    System.out.print(m[i][j]);
    }
    System.out.println();
}
System.out.println("numeros pares e impar:" + cont + "," + cont2);*/

    



Scanner ler = new Scanner(System.in);
int[][] m = new int[3][3];
int soma = 0;
for (int i = 0; i < 3; i++){
    
for (int j = 0; j < 3; j++) {
    m[i][j] = ler.nextInt();
    }
}

for (int i = 0; i < 3; i++){
soma = 0;
for (int j = 0; j < 3; j++){
    soma = soma + m[i][j];
    }
    System.out.println(soma);
}
System.out.println("");
    }
}