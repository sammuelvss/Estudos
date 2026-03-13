package poo;

public class cachorroAdestrado {
    private String deitar;
    private String rolar;
    private String fingirDeMorto;

    public cachorroAdestrado(String nome, String raca, String deitar, String rolar, String fingir){
        super(nome, raca);
        this.deitar = deitar;
        this.rolar = rolar;
        this.fingirDeMorto = fingirDeMorto;
    }

    public String getDeitar(){
        return deitar;
    }
    public void setDeitar(String Deitar){
        this.deitar = deitar;
    }
    
}
