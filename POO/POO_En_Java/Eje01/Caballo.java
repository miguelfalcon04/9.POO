package POO.POO_En_Java.Eje01;

public class Caballo {

    private String nombre;
    private String color;
    private int carrerasGanadas;
    private int edad;

    public Caballo (String nom, String col,int e, int cg){
        this.nombre = nom;
        this.color = col;
        this.edad = e;
        this.carrerasGanadas = cg;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void cabalga(){
        System.out.println("Tocoto Tocoto Tocoto");
    }

    public void relincha(){
        System.out.println("hiiiiieeee");
    }

    public void rumia(){
        System.out.println("ñam ñam");
    }
    
}
