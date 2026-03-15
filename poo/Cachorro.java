package poo;

public class Cachorro {

    private String nome;
    private String raca;

    Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void latir() {
        System.out.println("au au");
    }

    public void dormir() {
        System.out.println("zzzZZz");
    }

    public void comer() {
        System.out.println("comendo...");
    }

    public String getNome() {
        return this.nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
