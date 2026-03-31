package poo1;

public class cliente {
    
    String nome;
    int rg;
    int cpf;
    int telefone;

    data data;
    endereco endereco;

    cliente(String nome, int rg, int cpf, int telefone, data data, endereco endereco){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data = data;
        this.endereco = endereco;
    }

    public String ToString(){
        return "Nome:" + nome +
                "\nRg:" + rg +
                "\nCpf:" + cpf +
                "\nTelefone:" + telefone +
                "\nData:" + data +
                "\nEndereço:" + endereco;

    }

}
