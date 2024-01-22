package POO.POO_En_Java.Eje02;

public class Coche extends Vehiculo {

    private int caballos;

    public Coche(int c){
        super();
        this.caballos = c;
    }

    public int getCaballos(){
        return this.caballos;
    }

    public void quemaRueda(){
        System.out.println("FFFFFFSHHHHHHHH");
    }

}
