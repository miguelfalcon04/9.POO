package POO.POO_En_Java.Eje03;

public class Animal {

    private String sexo;

    public Animal(String s){
        this.sexo = s;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void duerme(){
        System.out.println("mimimimi");
    }

    public void come(){
        System.out.println("Ñam Ñam");
    }

}
