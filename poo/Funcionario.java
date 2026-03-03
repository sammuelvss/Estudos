package poo;


public class Funcionario{

    private int matricula;
    private String nome;
    private Departamento departamento;

    public Funcionario(int matricula, String nome, Departamento departamento){
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
    }


    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Departamento getDepartamento(){
        return this.departamento;

    }

    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }

    public String toString(){
        return "Funcionário: " + matricula + " - " + nome + " - " + departamento.getNome();
    }

    

}