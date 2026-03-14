package poo;

public class cachorroAdestrado extends Cachorro {
    private String deitar;
    private String rolar;
    private String fingirDeMorto;

    public cachorroAdestrado(String nome, String raca, String deitar, String rolar, String fingirDeMorto) {
        super(nome, raca);
        this.deitar = deitar;
        this.rolar = rolar;
        this.fingirDeMorto = fingirDeMorto;
    }

    public void latir(String latir) {
        System.out.println("au au");
    }

    public void dormir(String dormir) {
        System.out.println("zzzZZz");
    }

    public void comer(String comer) {
        System.out.println("*comendo");
    }

    public String getDeitar() {
        return deitar;
    }

    public void setDeitar(String deitar) {
        this.deitar = deitar;
    }

    public String getRolar() {
        return rolar;
    }

    public void setRolar(String rolar) {
        this.rolar = rolar;
    }

    public String getFingirDeMorto() {
        return fingirDeMorto;
    }

    public void setFingirDeMorto(String fingirDeMorto) {
        this.fingirDeMorto = fingirDeMorto;
    }

    public String getNome() {
        return super.getNome();
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public String getRaca() {
        return super.getRaca();
    }

    public void setRaca(String raca) {
        super.setRaca(raca);
    }
}
