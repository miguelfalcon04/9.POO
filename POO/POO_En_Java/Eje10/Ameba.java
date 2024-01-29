package POO.POO_En_Java.Eje10;

public class Ameba {

    private int peso;

    public Ameba(){
        this.peso = 3;
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso "+this.peso+" microgramos.";
    }

    public int getPeso() {
        return peso;
    }

    public void come(int cantidad){
        this.peso += cantidad-1;
    }

    public void come(Ameba a){
        this.peso += a.getPeso()-1;
        a.peso = 0;
    }

}
