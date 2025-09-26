package listas;

public class recursao {
    

    
public static int soma(int n){
    if(n == 1){
        return 1;
    }
    else{
        return n + soma(n - 1);
    }
}

public static double somaFracao(double n){
    if(n == 1){
        return 1;
    }
    else{
        return (1/n) + somaFracao(n - 1);
    }
}
/*public static int fatorial(int num){
    if(num  == 0){
        return 1;
    }
    return num * fatorial(num - 1);
}

    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
} */   

public static int mdc(int a, int b){
    if(b  == 0){
        return a;
    }
    return mdc(b, a % b);
}

    public static void main(String[] args) {
        System.out.println(mdc(48, 18));
    }
}    




    

