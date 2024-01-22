package POO.POO_En_Java.Eje02;

public class Bicicleta extends Vehiculo{

    private int pinones;

    public Bicicleta(int p){
        super();
        this.pinones = p;
    }

    public int getPinones(){
        return this.pinones;
    }

    public void caballito(){
        System.out.println("Estoy haciendo el cabllito");
    }
    
}
