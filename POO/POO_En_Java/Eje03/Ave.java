package POO.POO_En_Java.Eje03;

public class Ave extends Animal{

    public Ave(String s){
        super(s);
    }

    public void vuela(){
        System.out.println("Soy una avionate miro como vuelo fiuuuuuum");
    }

    public void poneHuevo(){
        if(this.getSexo() == "macho"){
            System.out.println("Soy macho, no pongo huevos");
        }else{
            System.out.println("Ahi va un huevo");
        }
    }

}
