package poo;

public class Cachorro {
    
    private String nome;
    private String raca;

    Cachorro(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome(){
        return this.nome;
    }
    public String getRaca(){
        return this.raca;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }
}
