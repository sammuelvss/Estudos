package questoes;

import java.util.Scanner;





public class prova {
    public static void main(String[] args) {
        

        /*Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int [] v = new int[n];
         for(int i = 0; i < v.length; i++){
            v[i] = ler.nextInt();
        }
        bubbleSort(v);
        System.out.println();
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i]);
        }
    }

        public static void bubbleSort(int [] v){

            int aux = 0;
            int n = v.length;

            for(int i = 0; i < n - 1; i++){

                for(int j = 1; j < n; j++){
                if(v[j - 1] < v[j]){
                    aux = v[j - 1];
                    v[j - 1] = v[j];
                    v[j] = aux;
                    }
                }
            }
        

        }
    }*/


       /* Scanner ler = new Scanner(System.in);
        
        int [] v = {9, 4, 2, 7, 5};
        inserctionSort(v);
        
    }
    public static void inserctionSort(int [] v) {
        
      
        int n = v.length;

        for(int i = 1; i < n; i++){
            System.out.println(" ");   
            int chave = v[i];
            int j = i - 1;
                while(j >= 0 && v[j] > chave){
                    v[j + 1] = v[j];
                    j--;
                }         
             v[j + 1] = chave;   
              System.out.println(" ");
            for(int k = 0; k < n; k++){
                System.out.print(v[k] + " ");
            }
           
        }
        
        //-------------------OUTRA FORMA DE FAZER-------------------------
        /*for (int i = 1; i < n; i++) {

        for (int j = i; j > 0; j--) {
            
            if (v[j] < v[j - 1]) {

                int aux = v[j];
                v[j] = v[j - 1];
                v[j - 1] = aux;
            } else {

                break; 
            }
        }
    }
}*/


        /*Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        double [] v = new double[n];
         for(int i = 0; i < v.length; i++){
            v[i] = ler.nextDouble();
        }
        selectionSort(v);
    }
    public static void selectionSort(double [] v){

        int menor;
        int n  = v.length;
        
            for(int i = 0; i < n - 1; i++){

                menor = i;
                for(int j = i + 1; j < n; j++ ){

                    if(v[j] < v[menor]){
                        menor = j;
                    }
                }
                if(menor != i){
                    double temp = v[i];
                    v[i] = v[menor];
                    v[menor] = temp;

                }
                System.out.print(v[i] + " ");
            }
        }
    }*/

        /*Scanner ler = new Scanner(System.in);

        System.out.println("digite as linhas");
        int l = ler.nextInt();
        System.out.println("digite as colunas");
        int c = ler.nextInt();
        ler.nextLine();
        String [][] m = new String[l][c];

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                m[i][j] = ler.nextLine();
            }
        }
        System.out.println("escreva o nome do filme ");
        String x = ler.nextLine();
        System.out.println(buscaBinaria(m, x));
    
    }
        public static String buscaBinaria (String [][] m, String x){
            int n = m.length;
           
            
            for(int i = 0; i < n; i++){
            int inicio = 0;
            int fim = m[0].length - 1;
            while (inicio <= fim){
                        int meio = inicio + (fim - inicio)/2;
                        String elementoMeio = m[i][meio];                       
                        if (elementoMeio.equals(x)){
                            return "encontrado!";
                        }
                        if (x.compareTo(elementoMeio) < 0) {
                            fim = meio - 1;
                        } else {
                            inicio = meio + 1;
                        }
                    }
                }
                return "não encontrado!";
            }
        }*/
        /*Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int [] v = new int[n];
         for(int i = 0; i < v.length; i++){
            v[i] = ler.nextInt();
        }
        bubbleSortOtimizado(v);


    }
        public static int bubbleSortOtimizado(int [] v){

            int n = v.length;
            for(int i = 0; i < n - 1; i++){
                boolean parada = false; 
                for(int j = 1; j < n - i; j++){
                    if(v[j-1] > v[j]){
                        int temp = v[j-1];
                        v[j-1] = v[j];
                        v[j] =  temp;
                        parada = true;        
                    }
                }
                if(parada == false){
                    return i+1;
                }
            }
            return n-1;
        }
    }*/

        /*int [] v  = {8,3,9,1,5};
        selectionSortFocado(v);
    }
        public static void selectionSortFocado(int[] v){

            int n = v.length;
            int menor = 0;
            int temp;
            for(int i = 0; i < n; i++){
                menor = i;
                boolean troca = false;
                for(int j = i+1; j < n; j++){
                    if(v[j] < v[menor]){
                        menor =  j;
                        troca = true;
                    }
                }
                if(troca == true){
                    temp = v[menor];
                    v[menor] = v[i];
                    v[i] = temp;
                    System.out.println("Passagem i = " + i + " v[" + i + "] era " + v[menor] + ", depois da troca agora é: " + v[i]);
                } else {
                    System.out.println("Passagem i = " + i + ": Nenhuma troca, v[" + i + "] ja era o menor");
                }
            }
        }
    }*/    
    
    
    /*int [] v = {2,5,7,9,0};
    int n = 4;
    int x = 6;
    insereOrdenado(v, n, x);
    }
    public static void insereOrdenado(int [] v, int n, int x){
        
    
            int chave = x;
            int j = n - 1;
            while(j >= 0 && v[j] > chave){
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = chave;
        }
    }*/
    
        /*public static int buscaBinaria(int[] v, int x){

            int ini = 0;
            int fim = v.length - 1;
            
            while(ini <= fim){
                int meio = ((ini + fim)/2);
                if(v[meio] == x){
                    return meio;
                } else if (v[meio] > x){
                    fim = meio - 1;
                } else {
                    ini = meio + 1;
                }

            }
            return -(ini)-1;
        }
    }*/

    /*public static void bubbleSortReverso(int []v){

        int temp;
        int n = v.length;

        for(int i = 0; i < n-1; i++){
            for(int j = n-1; j > i; j--){
                if(v[j] < v[j-1]){
                    temp = v[j];
                    v[j] = v[j-1];
                    v[j-1] = temp;
                }
            }
        }
    }*/

    /*int [] v = {5,4,3,2};
    inserctionSort(v);
    }
    public static void inserctionSort(int [] v){

        int cont = 0;
        int total = 0;
        int n = v.length;
        for(int i = 1; i < n; i++){
            int chave = v[i];
            int j = i - 1;
            cont = 0;
            while(j >= 0  && v[j] > chave){
                v[j + 1] = v[j];      
                cont++;
                j--; 
            }
            System.out.println("Passagem " + i + "(chave = " + v[i] + "): " + cont + "shifts.");
            v[j+1] = chave;
            total += cont;
        }
        System.out.println("Total de shifts:" + total);

        }
    }*/

        /*public static void selectionSortDoFim(int [] v){
            int n = v.length;
            int temp;
            for(int i = 0; i < n-1; i++){
                int maior = 0;
                for(int j = 1; j <= n - 1 - i; j++){
                    if(v[j] > v[maior]){
                        maior = j;
                    }
                }
                temp = v[maior];
                v[maior] = v[n-1-i];
                v[n-1-i] = temp;
            }
        }*/

        /*public static int buscaBinariaPrimeiraOcorrencia(int [] v, int x){
            int cont = 0;
            int ini = 0;
            int fim = v.length-1;
            int indice = 0;
            while(ini <= fim){
                int meio = ((ini + fim)/2);
                if(v[meio] == x){
                    indice += meio;
                    cont++;
                    if(cont >= 2){
                        indice -= meio;
                        return indice;
                    }
                } else if (v[meio] > x){
                    fim = meio - 1;
                } else {
                    ini = meio + 1;
                }
            }
            return -1;
        }*/

        /*public static void selectionSortDuplo(int [] v){

            int n = v.length;
            for(int i = 0; i < n/2; i++){
                int menor = i;
                int maior = i;
                for(int j = i + 1; j < n - i; j++){
                    if(v[j] > v[maior]){
                        maior = j;
                    } if(v[j] < v[menor]) {
                        menor = j;
                    }
                }
                int temp = v[maior];
                v[maior] = v[n-1-i];
                v[n-1-i] = temp;

                if(menor == n-1-i){
                    menor = maior;
                }
                temp = v[menor];
                v[menor] = v[i];
                v[i] = temp;
            }
            }
        }*/

        /*public static void cocktailSort(int [ ] v){

            int n = v.length;
            int ini = 0;
            int fim = n-1;
            while(ini < fim){
                for(int j = 0; j < fim; j++){
                    if(v[j] > v[j+1]){
                        int temp1 = v[j];
                        v[j] = v[j+1];
                        v[j+1] = temp1;
                    }
                }fim--;

                    for(int p = fim ; p > ini; p--){
                        if(v[p] < v[p-1]){
                            int temp2 = v[p-1];
                            v[p-1] = v[p];
                            v[p] = temp2;
                        }
                    }ini++;
                
                }
         }*/

         /*public static int buscaBinariaRotacionada(int[] v, int x){

            int n = v.length;
            int ini = 0;
            int fim = n-1;
            boolean ordenada = true;
            boolean ordenadaDire = true;
            while(ini <= fim){
                int meio = ((ini+fim)/2);
                if(v[meio] == x){
                    return meio;
                }
                if(v[ini] <= v[meio]){
                    ordenada = true;
                } else {
                    ordenada = false;
                }
                 if (ordenada == true) { 
                       
                if (x >= v[ini] && x < v[meio]) {
                    fim = meio - 1; 
                } else {
                    ini = meio + 1;
                }           
                } else { 
                
                if (x > v[meio] && x <= v[fim]) {
                    ini = meio + 1; 
                } else {
                    fim = meio - 1;
                }
            }
            return -1
         }
        }*/
