package POO.POO_En_Java.Eje06;

public class Tiempo {

    private  int segundos = 0;

    public Tiempo(int h, int m, int s){
        this.segundos = h*3600+m*60+s;
    }

    public Tiempo(int s){
        this.segundos = s;
    }

    public String toString() {
        int segundos = this.segundos;
        int horas = segundos / 3600;
        segundos -= horas * 3600;
        int minutos = segundos / 60;
        segundos -= minutos * 60;
        
        if (this.segundos < 0) {
            return "-(" + (-horas) + "h " + (-minutos) + "m " + (-segundos) + "s)";
        }else {
            return horas + "h " + minutos + "m " + segundos + "s";
        }
    }

    private int getSegundos() {
        return this.segundos;
    }

    public Tiempo suma(Tiempo t2){
        return new Tiempo(this.segundos + t2.getSegundos());
    }

    public Tiempo resta(Tiempo t2){
        return new Tiempo(this.segundos - t2.getSegundos());
    }

}
