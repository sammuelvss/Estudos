import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

 Scanner ler = new Scanner(System.in);
int [] v = new int [10];
for (int i = 0; i < 10; i++){
    v[i] = ler.nextInt();
}
for (int i = v.length-1; i >= 0; i--){
    System.out.print(v[i] + ",");
}

    }
}
