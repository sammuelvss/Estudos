package poo1;

public class quadrado {
    double lado;

    quadrado(double lado){
        this.lado = lado;
    }

    quadrado(){
        this.lado = 0;   
    }

    double area(){
        return this.lado * this.lado;
    }
    double comprimento(){
        return this.lado * 4;
    }

    void desenha(){
        for(int i = 0; i < this.lado; i++){
            for (int j = 0; j < this.lado; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
