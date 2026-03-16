package poo;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * circulo c1 = new circulo(2);
         * circulo c2 = new circulo(5);
         * System.out.println(c1.area());
         * System.out.println(c2.area());
         * 
         * 
         * 
         * //===========================================================================
         * ==
         * //===========================================================================
         * ==
         * 
         * ret re1 = new ret(3,5);
         * ret re2 = new ret(6,2);
         * ret re3 = new ret();
         * System.out.println(re1.area());
         * System.out.println(re2.area());
         * System.out.println(re3.area());
         * 
         * System.out.println("-----------");
         * 
         * //===========================================================================
         * ==
         * //===========================================================================
         * ==
         * 
         * quadrado q1 = new quadrado(5);
         * System.out.println(q1.area());
         * quadrado q2 = new quadrado(5);
         * System.out.println(q2.comprimento());
         * quadrado q3 = new quadrado();
         * System.out.println(q3.area());
         * 
         * quad(q1.lado,q2.area(), q2.comprimento());
         * 
         * q1.desenha();
         * }
         * 
         * 
         * public static void quad(double lado, double area, double comprimento){
         * System.out.println("O quadrado de lado " + lado + " tem " + area +
         * " de área e " + comprimento + " de comprimento.");
         */

        // =============================================================================
        // =============================================================================

        /*
         * triangulo t = new triangulo(2,3);
         * t.exibe();
         */

        /*
         * Scanner ler = new Scanner(System.in);
         * 
         * int numero = -1;
         * ContaBancaria c = null;
         * 
         * do {
         * System.out.println();
         * System.out.println("|||-------------------BANCO------------------|||");
         * System.out.println("Crie uma conta bancaria (1)");
         * System.out.println("|||------------------------------------------|||");
         * System.out.println("Depositar (2)");
         * System.out.println("|||------------------------------------------|||");
         * System.out.println("Sacar (3)");
         * System.out.println("|||------------------------------------------|||");
         * System.out.println("Exibir saldo (4)");
         * System.out.println("|||------------------------------------------|||");
         * System.out.println("Sair (0)");
         * 
         * numero = ler.nextInt();
         * 
         * if (numero == 1) {
         * System.out.println("-------------CRIAR CONTA--------------");
         * System.out.println("Digite seu nome:");
         * ler.nextLine();
         * String nomeT = ler.nextLine();
         * System.out.println("|||------------------------------------------|||");
         * System.out.println("Digite o numero da conta:");
         * int nConta = ler.nextInt();
         * System.out.println("|||------------------------------------------|||");
         * System.out.println("Digite o saldo inicial da conta:");
         * double saldo = ler.nextDouble();
         * System.out.println("|||------------------------------------------|||");
         * c = new ContaBancaria(nomeT, nConta, saldo);
         * System.out.println();
         * System.out.println("CONTA CRIADA COM SUCESSO!!");
         * System.out.println();
         * 
         * } else if (numero == 2) {
         * System.out.println("|||----------------------DEPOSITO--------------------|||"
         * );
         * if (c != null) {
         * System.out.println("Qual o valor do deposito?");
         * double valor = ler.nextDouble();
         * c.deposito(valor);
         * } else {
         * System.out.println("-------------Crie uma conta primeiro!-------------");
         * }
         * } else if (numero == 3) {
         * System.out.println("|||---------------------SAQUE---------------------|||");
         * if (c != null) {
         * System.out.println("Qual o valor do saque?");
         * double valorS = ler.nextDouble();
         * c.saque(valorS);
         * c.exibir();
         * } else {
         * System.out.println("-------------Crie uma conta primeiro!-------------");
         * }
         * } else if (numero == 4) {
         * System.out.println("|||--------------------DADOS----------------------|||");
         * if (c != null) {
         * c.exibir();
         * } else {
         * System.out.println("-------------Crie uma conta primeiro!-------------");
         * }
         * }
         * } while (numero != 0);
         * ler.close();
         * }
         * }
         */

        // =============================================================================
        // =============================================================================

        /*
         * hora h1 = new hora(10, 20, 30);
         * data d1 = new data(1, 1 ,2005, h1);
         * 
         * System.out.println(d1.dia);
         * System.out.println(d1.mes);
         * System.out.println(d1.ano);
         * System.out.println(d1.hora.hora);
         * 
         * 
         * }
         * }
         */

        // =============================================================================
        // =============================================================================

        /*
         * Scanner ler = new Scanner(System.in);
         * endereco ende = null;
         * data d = null;
         * telefone tele = null;
         * cliente C = null;
         * int numero = -1;
         * 
         * do{
         * System.out.println("digite seu nome:");
         * String nome = ler.nextLine();
         * System.out.println("digite seu rg:");
         * int rg = ler.nextInt();
         * System.out.println("digite seu cpf:");
         * 
         * int cpf = ler.nextInt();
         * System.out.println("qual seu ddd?");
         * int ddd = ler.nextInt();
         * System.out.println("digite seu numero de telefone:");
         * int numB = ler.nextInt();
         * 
         * System.out.println("nome do logradouro:");
         * ler.nextLine();
         * String nomeL = ler.nextLine();
         * System.out.println("digite seu número:");
         * int num = ler.nextInt();
         * System.out.println("digite seu bairro:");
         * ler.nextLine();
         * String bairro = ler.nextLine();
         * System.out.println("digite sua cidade:");
         * String cidade = ler.nextLine();
         * System.out.println("digite seu estado:");
         * ler.nextLine();
         * String estado = ler.nextLine();
         * 
         * 
         * System.out.println("digite o dia:");
         * int dia = ler.nextInt();
         * System.out.println("digite o mês:");
         * int mes = ler.nextInt();
         * System.out.println("ano:");
         * int ano = ler.nextInt();
         * 
         * 
         * ende = new endereco(nomeL, bairro, cidade, estado, num);
         * d = new data(dia, mes, ano, null);
         * tele = new telefone(ddd, numB);
         * C = new cliente(nomeL, rg, cpf, ano, d, ende);
         * System.out.println(
         * "========================================\n====================================="
         * );
         * 
         * System.out.println(C.ToString());
         * System.out.println("Quer finalizar? digite [0]");
         * ler.nextLine();
         * }while(numero != 0);
         * 
         * 
         * 
         * }
         * }
         */

        // =============================================================================
        // =============================================================================

        /*
         * Pessoa pessoa = new Pessoa("João", 25);
         * 
         * System.out.println("Nome: " + pessoa.getNome());
         * System.out.println("Idade: " + pessoa.getIdade());
         * 
         * pessoa.setNome("Maria");
         * pessoa.setIdade(30);
         * 
         * System.out.println("Nome atualizado: " + pessoa.getNome());
         * System.out.println("Idade atualizada: " + pessoa.getIdade());
         * 
         * }
         * }
         */

        // =============================================================================
        // =============================================================================

        /*
         * Departamento dep1 = new Departamento(1, "Recursos Humanos");
         * Funcionario func1 = new Funcionario(123, "Alice", dep1);
         * 
         * System.out.println(dep1.toString());
         * System.out.println(func1.toString());
         * 
         * dep1.setCodigo(2);
         * dep1.setNome("Financeiro");
         * 
         * System.out.println(dep1.toString());
         * System.out.println(func1.toString());
         * 
         * 
         * }
         * }
         */

        // =============================================================================
        // =============================================================================

        /*
         * Scanner ler = new Scanner(System.in);
         * String nome, info;
         * int idade;
         * 
         * nome = ler.next();
         * idade = ler.nextInt();
         * info = ler.next();
         * pessoaFisica pf = new pessoaFisica(nome, idade, info);
         * imprime(pf);
         * 
         * nome = ler.next();
         * idade = ler.nextInt();
         * info = ler.next();
         * pessoaJuridica pj = new pessoaJuridica(nome, idade, info);
         * imprime(pj);
         * }
         * public static void imprime(Pessoa p){
         * System.out.println("Nome da pessoa: " + p.getNome() );
         * System.out.println("idade da pessoa: " + p.getIdade() );
         * if (p instanceof pessoaFisica){
         * System.out.println("cpf da pessoa: " + ((pessoaFisica)p).getCpf());
         * }else{
         * System.out.println("cnpj da pessoa" + ((pessoaJuridica)p).getCnpj());
         * }
         * 
         * }
         * }
         */

        // =============================================================================
        // =============================================================================

        Scanner ler = new Scanner(System.in);
        int num = -1;
        int cont = 0;

        ArrayList<Cachorro> dogs = new ArrayList<>();
        while (num != 0) {

            System.out.println("1- Cadastrar Cão | 2- Listar Todos | 3- Sair");
            int numero = ler.nextInt();
            ler.nextLine();
            String nome;
            if (numero == 1) {

                for (int i = 0; i <= 5; i++) {

                    if (i % 2 == 0) {
                        nome = ler.nextLine();
                        if (nome.length() >= 3) {
                            dogs.add(new Cachorro(nome, ler.next()));
                        } else {
                            System.out.println("Nome muito pequeno, use ao menos 3 caracteres! Digite novamente.");
                            i--;
                            continue;
                        }
                    } else {
                        dogs.add(new cachorroAdestrado(ler.next(), ler.next()));
                        cont++;
                    }
                }
            } else if (numero == 2) {
                for (Cachorro d : dogs) {
                    imprime(d);
                }
                System.out.println("tem " + cont + " cachorros adestrados!");
            } else if (numero == 3) {
                num = 0;
            } else {
                System.out.println("Número inválido!");
            }
        }
    }

    public static void imprime(Cachorro c) {
        System.out.println("Nome do cachorro:" + c.getNome());
        System.out.println("Raça:" + c.getRaca());
        c.latir();
        c.comer();
        c.dormir();
        if (c instanceof cachorroAdestrado) {
            cachorroAdestrado ad = (cachorroAdestrado) c;
            ad.deitar();
            ad.rolar();
            ad.fingirDeMorto();
            System.out.println("\n\n");
        } else {
            System.out.println("Cachorro sem adrestamento!\n\n");
        }
    }

}
