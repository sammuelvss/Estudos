//import java.util.Scanner;
package questoes;
public class q5 {
    public static void main
    (String[] args) {
      
            int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
            int [] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

            for (int i = 0; i < a.length-1; i++) {
                int [] c = new int[a.length]; 
                c[i] = a[i];
                System.out.println(c[i]);
                for (int j = 0; j < b.length-1; j++) {
                    c[i] = b[j];
                    System.out.println(c[i]);
                }
            }









    }
}
