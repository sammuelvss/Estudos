package poo;

public class pessoaJuridica extends Pessoa {

    private String cnpj;
    public pessoaJuridica(String nome, int idade, String cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
    }
    public String getCnpj() {    
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return super.getNome();
    } 

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public int getIdade() {
        return super.getIdade();
    }

    public void setIdade(int idade) {
        super.setIdade(idade);
    }
    
}
