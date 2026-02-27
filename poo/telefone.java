package poo;

public class telefone {
    int ddd;
    int numB;

    telefone(int ddd, int numB){
        this.ddd = ddd;
        this.numB = numB;
    }

    public String ToString(){
        return "Telefone:" + ddd + "|" + numB;


    }
}
