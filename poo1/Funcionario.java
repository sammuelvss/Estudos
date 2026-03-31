package poo1;

import java.util.UUID;

public class Funcionario {

    private Double salario;
    private String nome;
    public static int contador = 0;
    private final String id;
    private final int registro;

    public Funcionario(Double salario, String nome) {
        this.salario = salario;
        this.nome = nome;
        contador++;
        this.registro = contador;
        this.id = UUID.randomUUID().toString();
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRegistro() {
        return this.registro;
    }

    public String getId() {
        return this.id;
    }

    public Double calcularBonus() {
        return (this.salario * 0.1) + this.getSalario();
    }

    public String toString() {
        return "Funcionário: " + nome + " - " + salario + " - " + id + " - " + calcularBonus();
    }

}