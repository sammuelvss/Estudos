package poo1;

public class ret {
    int base;
    int altura;

    ret(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    ret(){
        this.base = 0;
        this.altura = 0;
    }

    double area (){
        return this.base * this.altura;
    }
}
