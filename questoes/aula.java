package questoes;

import java.util.Scanner;

        public class aula {
    /*public static boolean verificaLinha(char[] linha, char c) {
        return (linha[0] == c && linha[1] == c && linha[2] == c);
    }

    public static boolean verificaColuna(char[][] m, char c) {
        char temp[] = new char[3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                temp[j] = m[j][i];
            }
            if (verificaLinha(temp, c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verificaDiagonal(char[][] m, char c) {
       for(int i = 0; i > 3; i++){
        for(int j = 0; j < 3; j++){
            if(i == j)
            if (m[0][0] == m[1][1] && m[1][1] == m[2][2]){
                return true;
            }
        }
       }
       return false;
    }

    public static void main(String[] args) {
        char[][] m = {
            {'X','O','O'},
            {'X','O','X'},
            {'X','X','O'},
        };

        int vencedor = -1;

        // Verificar linhas
        for(int i = 0; i < m.length; i++) {
            if (verificaLinha(m[i], 'X')) vencedor = 1;
            else if (verificaLinha(m[i], 'O')) vencedor = 0;
        }

        // Verificar colunas
        if (verificaColuna(m, 'X')) vencedor = 1;
        else if (verificaColuna(m, 'O')) vencedor = 0;

        // Verificar diagonais
        if (verificaDiagonal(m, 'X')) vencedor = 1;
        else if (verificaDiagonal(m, 'O')) vencedor = 0;

        // Mostrar resultado
        if (vencedor == 1) System.out.println("X venceu!");
        else if (vencedor == 0) System.out.println("O venceu!");
        else System.out.println("Empate!");
    }
}*/
public static int fatorial(int n){
    if(n == 1){
        return 1;
    }
    else {
       return n + fatorial(n - 1); 
    }
}

public static int impares(int n){
    if(n == 1){
        return 1;
    } else {
        return (2 * n)-1 + impares(n - 1);
    }
}

public static int potencia(int x, int n){
    if(n == 0){
        return 1;
    }else {
        return x * potencia(x, n - 1);
    }

}

public static int fib(int n){
    if(n == 1 || n == 2){
        return 1;
    }
    else{
        return fib(n - 2) + fib(n - 1);
    }
}


    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}



        




