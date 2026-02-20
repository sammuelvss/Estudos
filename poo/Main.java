package poo;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*circulo c1 = new circulo(2);
        circulo c2 = new circulo(5);
        System.out.println(c1.area());
        System.out.println(c2.area());

        ret re1 = new ret(3,5);
        ret re2 = new ret(6,2);
        ret re3 = new ret();
        System.out.println(re1.area());
        System.out.println(re2.area());
        System.out.println(re3.area());

        System.out.println("-----------");

        quadrado q1 = new quadrado(5);
        System.out.println(q1.area());
        quadrado q2 = new quadrado(5);
        System.out.println(q2.comprimento());
        quadrado q3 = new quadrado();
        System.out.println(q3.area());

        quad(q1.lado,q2.area(), q2.comprimento());

        q1.desenha();
    }


    public static void quad(double lado, double area, double comprimento){
        System.out.println("O quadrado de lado " + lado + " tem " + area + " de área e " + comprimento + " de comprimento.");
*/

        /*triangulo t  = new triangulo(2,3);
        t.exibe();*/

        ContaBancaria c = new ContaBancaria(, 0, 0)
        Scanner ler = new Scanner(System.in);
        System.out.println("crie uma conta bancaria (1)");
        System.out.println("depositar (2)");
        System.out.println("sacar (3)");
        System.out.println("exibir saldo (4)");
        System.out.println("sair (0)");
        
        int numero = ler.nextInt();
        if(numero == 1){
            System.out.println("Digite seu nome");
            String nome = ler.nextLine();
            System.out.println("digite o numero da conta");
            int nConta = ler.nextInt();
            System.out.println("digite o saldo da conta");
            int valor = ler.nextInt();
        }else if (numero == 2){
        System.out.println(c);
        ContaBancaria c = new ContaBancaria(valor, saldo);
        }
        

    }
}





