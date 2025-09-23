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

    



/*Scanner ler = new Scanner(System.in);
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
}*/

/*Scanner ler = new Scanner(System.in);
int[][] m = new int[3][3];

for (int i = 0; i < 3; i++){
    
for (int j = 0; j < 3; j++) {
    m[i][j] = ler.nextInt();
    }
}
System.out.println();
for (int i = 0; i < 3; i++){   
for (int j = 0; j < 3; j++) {
    if(i == j){
        System.out.println(m[i][j]);
        }
    }
}*/


/*Scanner ler = new Scanner(System.in);
String[][] m = new String[3][3];
int cont = 0;
for (int i = 0; i < 3; i++){
    System.out.println();
for (int j = 0; j < 3; j++) {
    m[i][j] = ler.nextLine();
    }
}
System.out.println();
for (int i = 0; i < 3; i++){   
for (int j = 0; j < 3; j++) {
    if(i == j && m[i][j].equals("x")){
        cont++;
        System.out.println(m[i][j]);
        } 
        
        if (cont == 3){
            System.out.println("você venceu! você tem " + cont + " X pontuados");
        }
    }
}*/

/*Scanner ler = new Scanner(System.in);
String[][] m = new String[3][3];
int cont = 0;
for (int i = 0; i < 3; i++){
    System.out.println();
for (int j = 0; j < 3; j++) {
    m[i][j] = ler.nextLine();
    }
}
System.out.println();
for (int i = 0; i < 3; i++){   
for (int j = 0; j < 3; j++) {
    if(i < j){
        m[i][j] = 0;
        }  
    }
    System.out.println();
}*/

Scanner ler = new Scanner(System.in);

int [] v  = new int[5];
for (int i = 0; i < 5; i++){
    v[i] = ler.nextInt();
}




    }
}