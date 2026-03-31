package poo1;

public class data {
    int dia;
    int mes;
    int ano;

    hora hora;

    data(int dia, int mes, int ano, hora hora){
        this.hora = hora;
    }

    public String ToString(){
        return "Data:" + dia + "|" + mes + "|" + ano;


    }
}
