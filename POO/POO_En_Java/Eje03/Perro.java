package POO.POO_En_Java.Eje03;

public class Perro extends Mamifero {

    public Perro(String s){
        super(s);
    }

    public void ladra(){
        System.out.println("gouf gouf");
    }

    public void rastrea(){
        System.out.println("Usare mi olfato para rastrear la pista");
    }

}
