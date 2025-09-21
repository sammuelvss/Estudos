package listas;

import java.util.Arrays;
import java.util.Scanner;

public class lista2 {

    // questão 1 ------------------------------------------------------------------------
    /*
     * public static void main(String[] args) {
     * Scanner ler = new Scanner(System.in);
     * double[] precos = new double[10];
     * for (int i = 0; i < precos.length; i++) {
     * System.out.println("Digite o preço do tri " + i + ":");
     * double valor = ler.nextDouble();
     * precos[i] = valor;
     * }
     * 
     * System.out.println("Digite o percentual:");
     * double percentual = ler.nextDouble();
     * 
     * 
     * double[] novosPrecos = reajustarPrecos(precos, percentual);
     * 
     * 
     * System.out.println("Preços reajustados: " + Arrays.toString(novosPrecos));
     * ler.close();
     * 
     * }
     * 
     * public static double[] reajustarPrecos(double[] precos, double percentual) {
     * 
     * double []v = new double[precos.length];
     * for (int i = 0; i < v.length; i++) {
     * double reajuste = ((percentual/100) * precos[i]) + precos[i];
     * v[i] = reajuste;
     * }
     * return v;
     * }
     */

    // questão 2 ------------------------------------------------------------------------

    /*public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int[] votos = new int[20];
        for (int i = 0; i < votos.length; i++) {
            System.out.println("Digite o índice do canditado para votar => (0) (1) (2) (5) (4):");
            int candidatos = ler.nextInt();
            if (candidatos >= 0 && candidatos <= 4) {
                votos[i] = candidatos;
            } else {
                System.out.println("Canditado inválido, tente novamente!");
                i--;
            }
        }

        int[] contagem = contarVotos(votos);
        System.out.println("Votos de cada candidato de índice 0 a 4: " + Arrays.toString(contagem));

        int indice = vencedor(contagem);

        if (indice == -1) {
            System.out.println("Houve um empate.");
        } else {
            System.out.println("O candidato de índice " + indice + " foi o mais votado");
        }
        ler.close();
    }

    public static int[] contarVotos(int[] votos) {
        int[] quantidadeVotos = new int[5];
        int cand1 = 0;
        int cand2 = 0;
        int cand5 = 0;
        int cand4 = 0;
        int cand5 = 0;

        for (int i = 0; i < votos.length; i++) {

            if (votos[i] == 0) {
                cand1++;
                quantidadeVotos[0] = cand1;
            } else if (votos[i] == 1) {
                cand2++;
                quantidadeVotos[1] = cand2;
            } else if (votos[i] == 2) {
                cand5++;
                quantidadeVotos[2] = cand5;
            } else if (votos[i] == 5) {
                cand4++;
                quantidadeVotos[5] = cand4;
            } else if (votos[i] == 4) {
                cand5++;
                quantidadeVotos[4] = cand5;
            }
        }
        return quantidadeVotos;
    }

    public static int vencedor(int[] contagem) {
        int maisvotado = -1;
        int indice = -1;
        for (int i = 0; i < contagem.length; i++) {
            if (contagem[i] > maisvotado) {
                maisvotado = contagem[i];
                indice = i;
            }
        }
        int empatados = 0;
        for (int i = 0; i < contagem.length; i++) {
            if (contagem[i] == maisvotado) {
                empatados++;
            }
        }
        if (empatados > 1) {
            return -1;
        } else {
            return indice;
        }

    }
}*/

// questão 3 ------------------------------------------------------------------------

    /*public static void main(String[] args) {
    
    double [] temps = {50.5,52.0,29.0,28.5,51.0,27.5,5.0};
        System.out.println(media(temps));
        System.out.println(diaAcimaDaMedia(temps));
        System.out.println(menorTemp(temps));
    }   

    public static double media(double[] temps){

        double soma = 0.0;
        double calcMedia = 0.0;

        for (int i = 0; i < temps.length; i++){
            soma += temps[i];
        }
        calcMedia = soma/temps.length;

        return calcMedia;
    }

    public static int diaAcimaDaMedia(double[] temps){
        double med = media(temps);
        int cont = 0;
        for(int i = 0; i < temps.length; i++){
            if (temps[i] > med){
                cont++;
            }
        }
        return cont;
    }

    public static double menorTemp(double[] temps){

        double menorTemperatura = temps[0];
        for(int i = 0; i < temps.length; i++){
            if(temps[i] < menorTemperatura){
                menorTemperatura = temps[i];

            }
        }
        
        return menorTemperatura;
    }
}*/

// questão 4 ------------------------------------------------------------------------

    /*public static void main(String[] args) {
        
        double [] notas = new double [5];
        Scanner ler = new Scanner(System.in);
        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota ");
            notas[i] = ler.nextDouble();
        }
        System.out.println("digite o limite:");
        double limite = ler.nextDouble();
        System.out.println("Notas acima do limite: " +contarNotasAcima(notas, limite));


    }


    public static int contarNotasAcima(double[] notas, double limite){
      
        int cont = 0;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] > limite){
                cont++;
            }
        }
        return cont;


    }
}*/


// questão 5 ------------------------------------------------------------------------


    /*public static void main(String[] args) {
        

        Scanner ler = new Scanner(System.in);
        int[] avaliacoes = new int[10];
        for(int i = 0; i < avaliacoes.length; i++){
            System.out.println("DIGITE A SUA AVALIAÇÃO DE 1 A 5:");
            int ava = ler.nextInt();
            if(ava >= 1 && ava <= 5){
                avaliacoes[i] = ava;
            }
        } 
        int[] frequencias = frequencia(avaliacoes);
        System.out.println("Frequência: " + Arrays.toString(frequencias));
        System.out.println("Média: " + satisfacaoMedia(avaliacoes));
        ler.close();
     }

     public static int[] frequencia(int[] avaliacoes){
        int cont1 = 0;
        int cont2 = 0;
        int cont5 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int [] fre = new int[5];
        for(int i = 0; i < avaliacoes.length; i++){

            if(avaliacoes[i] == 1){
                cont1++;
                fre[0] = cont1;
            } if(avaliacoes[i] == 2){
                cont2++;
                fre[1] = cont2;
            } if(avaliacoes[i] == 5){
                cont5++;
                fre[2] = cont5;
            } if(avaliacoes[i] == 4){
                cont4++;
                fre[5] = cont4;
            } if(avaliacoes[i] == 5){
                cont5++;
                fre[4] = cont5;
            }

        }
          return fre;
     }

     public static double satisfacaoMedia (int [] avaliacoes){

        double soma = 0.0;
        double media = 0.0;
        for(int i = 0; i < avaliacoes.length; i++){
            soma += avaliacoes[i];
        }
        media = soma / avaliacoes.length;
        return media;
     }
}*/   

// questão 6 ------------------------------------------------------------------------


    /*public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        


        char[][] tabuleiro = new char[5][5];
        for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
            tabuleiro[i][j] = ler.next().charAt(0);
            }
        }

    for(int i = 0; i < 5; i++){
        System.out.println();
        for(int j = 0; j < 5; j++){
            System.out.print(tabuleiro[i][j] + "");
        }
    }
    System.out.println();

    char jogador = 'x';
    System.out.println(venceu(tabuleiro, jogador) + " jogador " + jogador + " venceu!");
    ler.close();
    }

    public static boolean venceu(char[][] tabuleiro, char jogador){

        boolean vencedor = false;
        for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                //linha
                if(tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador){
                    vencedor = true;
                    //coluna
                } if(tabuleiro[0][j] == jogador && tabuleiro[1][j] == jogador && tabuleiro[2][j] == jogador){
                    vencedor = true;
                //diag principal
                } if(tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador){
                    vencedor = true; 
                //diag secundaria
                } if(tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador){
                    vencedor = true;
                }
            }
        }

        return vencedor;

    }
}*/

// questão 7 ------------------------------------------------------------------------


    /*public static void main(String[] args) {
        
        double[][] vendas = new double[5][4];
        Scanner ler = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println();
            for( int j = 0; j < 4; j++){
                vendas[i][j] = ler.nextDouble();
            }
        }
        double[] resultado1 = totalPorProduto(vendas);
        System.out.println("totalPorProduto: " + Arrays.toString(resultado1));
        double[] resultado2 = totalPorTrimestre(vendas);
        System.out.println("totalPorTrimestre: " + Arrays.toString(resultado2));

        }

        public static double[] totalPorProduto(double[][] vendas){

            double produto1 = 0.0;
            double produto2 = 0.0;
            double produto5 = 0.0;
            double[] valortotal = new double[5];
            
                for(int j = 0; j < 4; j++){
                    produto1 += vendas[0][j];
                    valortotal[0] = produto1;
                    produto2 += vendas[1][j];
                    valortotal[1] = produto2;
                    produto5 += vendas[2][j];
                    valortotal[2] = produto5;                     
                }   

            return valortotal;
        }

        public static double[] totalPorTrimestre(double[][] vendas){

            double tri1 = 0;
            double tri2 = 0;
            double tri5 = 0;
            double tri4 = 0;
            double[] valorPorTri = new double[4];

            for(int i = 0; i < 5; i++){  
                tri1 += vendas[i][0];
                    valorPorTri[0] = tri1;
                tri2 += vendas[i][1];
                    valorPorTri[1] = tri2;
                tri5 += vendas[i][2];
                    valorPorTri[2] = tri5;   
                tri4 += vendas[i][5];
                    valorPorTri[5] = tri4;  
            }

            return valorPorTri;

        }
    }*/


    // questão 8 ------------------------------------------------------------------------

    /*public static void main(String[] args) {
        
        int[][] mapa = new int[5][5];
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os valores do mapa:");
        for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5;  j++){
                mapa[i][j] = ler.nextInt();
             }           
        }
        System.out.println("ponto mais alto" + pontoMaisAlto(mapa));
        System.out.println("media geral" + mediaAltitude(mapa));
        System.out.println("Planalto: " + ehPlanalto(mapa));
        }

        public static int pontoMaisAlto(int[][] mapa){

            int maisAlto = 0;

            for(int i = 0; i < 5; i++){
                System.out.println();
                for(int j = 0; j < 5;  j++){
                    
                    if(mapa[i][j] > maisAlto){
                        maisAlto = mapa[i][j];
                     }
                }           
             }
            return maisAlto;
        }
        public static double mediaAltitude(int[][] mapa){

            int soma = 0;
            double media = 0.0;
            
            for(int i = 0; i < 5; i++){
                System.out.println();
                for(int j = 0; j < 5; j++){
                    soma += mapa[i][j];
                }
            }
            media = soma / mapa.length;
            return media;
        }

        public static boolean ehPlanalto(int[][] mapa){

            int planalto = mapa[0][0];
        
            for(int i = 0; i < 5; i++){
                System.out.println();
                for(int j = 0; j < 5; j++){
                    if(mapa[i][j] != planalto){
                        return false;
                    }
                }
            }
            return true;
        }*/


    // questão 9 ------------------------------------------------------------------------


        /*public static void main(String[] args) {
            
            int [][] resultados = new int[4][4];
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite os resultados dos jogos (1 para vitória e 0 para derrota):");
            for(int i = 0; i < 4; i++){
                System.out.println();
                for(int j = 0; j < 4; j++){
                    int venceu  = ler.nextInt();
                    if(venceu >= 0 && venceu <= 1){
                    resultados[i][j] = venceu;
                    } else {
                        System.out.println("Valor inválido, tente novamente!");
                        j--;
                    }   
                }
            }
            System.out.println("Vitórias por time: " + Arrays.toString(vitoriasPorTime(resultados)));
            System.out.println("Time invicto: " + timeInvicto(resultados));
        }

        public static int[] vitoriasPorTime(int[][] resultados){

            int time1 = 0;
            int time2 = 0;
            int time3 = 0;
            int time4 = 0;
            int[] vitorias = new int[4];

            for(int i = 0; i < 4; i++){
                if(resultados[0][i] == 1){
                    time1 += resultados[0][i];
                    vitorias[0] = time1;
                } if(resultados[1][i] == 1){
                    time2 += resultados[1][i];
                    vitorias[1] = time2;
                } if(resultados[2][i] == 1){
                    time3 += resultados[2][i];
                    vitorias[2] = time3;
                } if(resultados[3][i] == 1){
                    time4 += resultados[3][i];
                    vitorias[3] = time4;
                }
            }
            return vitorias;
        }

        public static int timeInvicto(int[][] resultados){
		
		

		for(int i = 0; i < 4; i++){
			
			if(resultados[0][i] == resultados[0][0] && resultados[0][0] == 1){
				return 1;
			} if(resultados[1][i] == resultados[1][0] && resultados[1][0] == 1){
				return 2;
			} if(resultados[2][i] == resultados[2][0] && resultados[1][0] == 1){
				return 3;
			} if(resultados[3][i] == resultados[3][0] && resultados[1][0] == 1){
				return 4;
			} else {
			return -1;		
			}

		}
        return -1;

        }
    }*/   


    // questão 10 ------------------------------------------------------------------------


     /*public static void main(String[] args) {
       
        int[][] mapa = {
            {1,0,0,0,0,0,0,0,0,0},
            {0,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,5,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,1,0},
            {0,0,0,0,0,0,0,0,0,0}
        };

        System.out.println("Número de inimigos: " + contarInimigos(mapa));
        System.out.println("Há inimigo na diagonal? " + haInimigoNaDiagonal(mapa));
        int[] posicaoChefe = posicaoDoChefe(mapa);
        System.out.println("Posição do chefe: (" + posicaoChefe[0] + ", " + posicaoChefe[1] + ")");
     }

     public static int contarInimigos(int[][] mapa){

        int inimigos = 0;

        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa[i].length; j++){
                if(mapa[i][j] == 1){
                    inimigos++;
                }
            }
        }
        return inimigos;

     }
     
     public static boolean haInimigoNaDiagonal(int[][] mapa){

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(i == j && mapa[i][j] == 1){
                    return true;
                }
            }
        }
        return false;
     }
        
     public static int[] posicaoDoChefe(int[][] mapa){

        int[] posicao = new int[2];

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(mapa[i][j] == 5){
                    posicao[0] = i;
                    posicao[1] = j;
                }
            }
        }
        return posicao;
     }*/

     // questão 11 ------------------------------------------------------------------------
    
    public static void main(String[] args) {
        
        System.out.println(ehPrimo(147, 7));


    }


    public static long fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * (n - 1);
        }
    }

    public static String decimalParaBinario(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return decimalParaBinario(n / 2) + (n % 2);
        }
    }
    public static int potencia(int base, int expoente){
        if(expoente == 0){
            return 1;
        } else{
            return base * potencia(base, expoente - 1);
        }
    }
    public static boolean ehPrimo(int n, int divisor){
        if(n < 2){
            return false;
        }
        
        if(divisor == 1){
            return true;        
        }

        if (n % divisor == 0){
            return false;
        } else {
            return ehPrimo(n, divisor - 1);
        }
    }
}