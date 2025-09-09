package questoes;

import java.util.Scanner;

        public class aula {
    public static boolean verificaLinha(char[] linha, char c) {
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
        if (m[0][0] == c && m[1][1] == c && m[2][2] == c) return true;
        if (m[0][2] == c && m[1][1] == c && m[2][0] == c) return true;
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
}




    




