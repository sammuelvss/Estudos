//import java.util.Scanner;
package questoes;
public class q5 {
    public static void main
    (String[] args) {
      
            int [] a = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39};
            int [] b = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40};
            int n = 0;
            int k = 0;
            int [] c = new int[40]; 
            /*for (int i = 0; i < a.length-1; i++) {
                c[i] = a[i];
                System.out.println(c[i]);
                for (int j = 0; j < b.length-1; j++) {
                    c[j] = b[j];  
                    System.out.println(c[j]);
                    }
                }*/

        for (int i = 0; i < c.length; i++) {
            if (i % 2 == 0) {
                c[i] = a[n];
                n++;
            } else {
                c[i] = b[k];
                k++;

            }
        }
        System.out.println("valores de c:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ",");
        }
    }
}
