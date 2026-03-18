package poo;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(Double s, String n, String departamento) {
        super(s, n);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return super.getNome();
    }

    public Double getSalario() {
        return super.getSalario();
    }

    public double calcularBonusGerente() {
        return (this.getSalario() * 0.2) + this.getSalario();
    }

    public String toString() {
        return "Gerente: " + this.getNome() + " - " + this.getSalario() + " - " + this.getId() + " - "
                + calcularBonusGerente() + " - " + departamento;
    }

}
