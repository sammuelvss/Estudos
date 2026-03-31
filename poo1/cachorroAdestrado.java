package poo1;

public class cachorroAdestrado extends Cachorro {

    cachorroAdestrado(String nome, String raca) {
        super(nome, raca);
    }

    public void deitar() {
        System.out.println("deitando...");
    }

    public void rolar() {
        System.out.println("rolando...");
    }

    public void fingirDeMorto() {
        System.out.println("fingindo de morto...");
    }
}