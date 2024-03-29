package POO.POO_En_Java.Eje16;

public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+this.x+", "+this.y+")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
