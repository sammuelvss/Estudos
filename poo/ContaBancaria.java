package poo;

public class ContaBancaria {
    
/*int lado1, lado2, lado3;


    public triangulo(int equilatero){
        this.lado1 = equilatero;
        this.lado2 = equilatero;
        this.lado3 = equilatero;
    }

    public triangulo(int ladoIgual, int base){
        this.lado1 = ladoIgual;
        this.lado2 = ladoIgual;
        this.lado3 = base;


    }
    
    public triangulo(int lado1, int lado2, int lado3){

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

    public int perimetro(){
        return lado1+lado2+lado3;
    }

    public void idtriangulo(){
        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("equilatero");
        } else if (lado1 == lado2 && lado2 != lado3 ){
        System.out.println("isósceles");
        } else {
            System.err.println("Escaleno");
        }
    }

    public void exibe(){
        System.out.println("lados:" + lado1 + "," + lado2 + ", "+ lado3);
        System.out.println("perimetro:" + perimetro());
        idtriangulo();
    }*/



    String nome;
    int nConta;
    double saldo;
    

    ContaBancaria(String nome, int nConta, double saldo){
        this.nome = nome;
        this.nConta = nConta;
        this.saldo = saldo;
    }
    public void deposito(double saldoI){
        
        if(saldoI >= 0){
        saldo = saldoI + saldo;
        } else {
            System.out.println("erro.");
        }
    
    }

    public void saque(double sacar){
        
        if(saldo >= sacar){  
        saldo = saldo - sacar;
        }
        else{
            System.out.println("saldo insuficiente.");
        }
    }

    public void exibir (){
        System.out.println("Nome:" + this.nome);
        System.out.println("Número da conta:" + this.nConta);
        System.out.println("Saldo:" + this.saldo);
    }

    




}



