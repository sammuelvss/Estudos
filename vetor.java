
import java.util.Scanner;
public class vetor {
    public static void main(String[] args) {
        int v[] = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            v[i]= s.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(v[i] + ",");
        }
    }
}
