package poo;

public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(Double salario, String nome, String linguagem) {
        super(salario, nome);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public Double getSalario() {
        return super.getSalario();
    }

    public String getNome() {
        return super.getNome();
    }

    public Double calcularBonusDesenvolvedor() {
        return (this.getSalario() * 0.15) + this.getSalario();
    }

    public String toString() {
        return "Desenvolvedor: " + this.getNome() + " - " + this.getSalario() + " - " + this.getId() + " - "
                + calcularBonusDesenvolvedor() + " - " + linguagem;
    }
}
