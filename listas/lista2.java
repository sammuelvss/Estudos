package listas;

import java.util.Arrays;
import java.util.Scanner;

public class lista2 {



    //questão 1 ------------------------------------------------------------------------
    /*public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] precos = new double[10];
        for (int i = 0; i < precos.length; i++) {
            System.out.println("Digite o preço do produto " + i + ":");
            double valor = ler.nextDouble();
            precos[i] = valor;
        }

        System.out.println("Digite o percentual:");
        double percentual = ler.nextDouble();


        double[] novosPrecos = reajustarPrecos(precos, percentual);


        System.out.println("Preços reajustados: " + Arrays.toString(novosPrecos));
        ler.close();

    }

    public static double[] reajustarPrecos(double[] precos, double percentual) {
        
        double []v = new double[precos.length];
        for (int i = 0; i < v.length; i++) {
            double reajuste = ((percentual/100) * precos[i]) + precos[i];    
            v[i] = reajuste;      
        }
        return v;
    }*/


    //questão 2 ------------------------------------------------------------------------

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int [] votos = new int[20];
        for(int i = 0; i < votos.length; i++){
            System.out.println("Digite o índice do canditado para votar => (0) (1) (2) (3) (4):");
            int candidatos = ler.nextInt();
            if (candidatos >= 0 && candidatos <= 4){
                votos[i] = candidatos;
            }else{
                System.out.println("Canditado inválido, tente novamente!");
                i--;
            }
        }
        int [] contagem = contarVotos(votos);
        System.out.println("Votos de cada candidato de índice 0 a 4: " + Arrays.toString(contagem));

        System.out.println("O candidato de índice " + vencedor(contagem) + " foi o mais votado");
        ler.close();
    }



    public static int[] contarVotos(int[] votos){
        int [] quantidadeVotos = new int[5];
        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        int cand4 = 0;
        int cand5 = 0;

        for(int i = 0; i < votos.length; i++){

            if(votos[i] == 0){
                cand1++;
                quantidadeVotos[0] = cand1;
            } else if (votos[i] == 1){
                cand2++;
                quantidadeVotos[1] = cand2;
            } else if (votos[i] == 2){
                cand3++;
                quantidadeVotos[2] = cand3;
            } else if (votos[i] == 3){
                cand4++;
                quantidadeVotos[3] = cand4;
            } else if (votos[i] == 4){
                cand5++;
                quantidadeVotos[4] = cand5;
            }            
        }        
        return quantidadeVotos;
    }

    public static int vencedor(int [] contagem){
        //int empatados = 0;
        //String indices = "";
        int maisvotado = -1;
        int indice = -1;
        for(int i = 0; i < contagem.length; i++){
            if(contagem[i] > maisvotado ){
                maisvotado = contagem[i];
                indice = i;
            }       
            /*if(contagem[i] == maisvotado){
                empatados++;
                indices += i + " ";
            }*/
        }    
            return indice;      
        }
    }



    //questão 3 ------------------------------------------------------------------------
















