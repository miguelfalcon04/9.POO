package POO.POO_En_Java.Eje03;

public class Mamifero extends Animal {

    public Mamifero(String s){
        super(s);
    }

    public void amamanta(){
        if(this.getSexo() == "macho"){
            System.out.println("No puedo amamantar soy macho");
        }else{
            System.out.println("Toma, alimentate");
        }
    }

    public void anda(){
        System.out.println("Estoy andando");
    }

}
