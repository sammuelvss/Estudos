package questoes;

import java.util.Scanner;
public class aula {
    public static boolean verificaLinha(char[] linha, char c) {

        if(linha[0] == linha[1] && linha[1] == linha[2]){
            if(linha[0] == c){
            return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        char[][] m = {

            {'X','O','O'},
            {'X','O','X'},
            {'X','X','O'},

        }
        public static boolean verificaColuna(char[][] m, char c){
        char temp[] = new char[3];
        for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                temp[j] = m[j][i];
                }
            }
            verificaLinha(temp, c);
            
        
    

        //verificar linhas
        int vencedor = -1;
        for(int i = 0; i < m.length; i++){
        if (verificaLinha(m[i], 'X')){
            vencedor = 1;
        } else if(verificaLinha(m[i], 'O')){
            vencedor = 0;
        }
    }
        //verificar coluna
        verificaLinha(temp, 'O');
        verificaColuna(temp, 'X');
    


        }
    }





    




