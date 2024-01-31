package POO.POO_En_Java.Eje16;

public class Linea{

    private Punto origen;
    private Punto fin;

    public Linea(Punto p1, Punto p2){
        this.origen = p1;
        this.fin = p2;
    }

    @Override
    public String toString() {
        return "Linea formada por los puntos "+this.origen+" y "+this.fin;
    }

}
