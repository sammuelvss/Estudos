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

        Scanner ler = new Scanner(System.in);

        int numero = -1;
        ContaBancaria c = null;

        do {
            System.out.println();
            System.out.println("|||-------------------BANCO------------------|||");
            System.out.println("Crie uma conta bancaria (1)");
            System.out.println("|||------------------------------------------|||");
            System.out.println("Depositar (2)");
            System.out.println("|||------------------------------------------|||");
            System.out.println("Sacar (3)");
            System.out.println("|||------------------------------------------|||");
            System.out.println("Exibir saldo (4)");
            System.out.println("|||------------------------------------------|||");
            System.out.println("Sair (0)");

            numero = ler.nextInt();

            if (numero == 1) {
                System.out.println("-------------CRIAR CONTA--------------");
                System.out.println("Digite seu nome:");
                ler.nextLine();
                String nomeT = ler.nextLine();
                System.out.println("|||------------------------------------------|||");
                System.out.println("Digite o numero da conta:");
                int nConta = ler.nextInt();
                System.out.println("|||------------------------------------------|||");
                System.out.println("Digite o saldo inicial da conta:");
                double saldo = ler.nextDouble();
                System.out.println("|||------------------------------------------|||");
                c = new ContaBancaria(nomeT, nConta, saldo);
                System.out.println();
                System.out.println("CONTA CRIADA COM SUCESSO!!");
                System.out.println();

            } else if (numero == 2) {
                System.out.println("|||----------------------DEPOSITO--------------------|||");
                if (c != null) {
                    System.out.println("Qual o valor do deposito?");
                    double valor = ler.nextDouble();
                    c.deposito(valor);
                } else {
                    System.out.println("-------------Crie uma conta primeiro!-------------");
                }
            } else if (numero == 3) {
                System.out.println("|||---------------------SAQUE---------------------|||");
                if (c != null) {
                    System.out.println("Qual o valor do saque?");
                    double valorS = ler.nextDouble();
                    c.saque(valorS);
                    c.exibir();
                } else {
                    System.out.println("-------------Crie uma conta primeiro!-------------");
                }
            } else if (numero == 4) {
                System.out.println("|||--------------------DADOS----------------------|||");
                if (c != null) {
                    c.exibir();
                } else {
                    System.out.println("-------------Crie uma conta primeiro!-------------");
                }
            }
        } while (numero != 0);
        ler.close();
    }
}





