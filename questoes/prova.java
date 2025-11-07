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
        Scanner ler = new Scanner(System.in);
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
                for(int j = 1; j < n; j++){
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
    }



    



