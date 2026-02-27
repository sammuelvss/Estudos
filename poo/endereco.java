package poo;

public class endereco {
    

    String nomeL;
    int num;
    String bairro;
    String cidade;
    String estado;

    endereco(String nomeL, String bairro, String cidade, String estado, int num){
        this.nomeL = nomeL;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.num = num;
    }

    public String ToString(){
        return "Endereço:" + nomeL + "|" +  bairro + "|" + cidade +"|"+ estado + "|" + num;

    }
}
