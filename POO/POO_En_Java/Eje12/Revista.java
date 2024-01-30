package POO.POO_En_Java.Eje12;

public class Revista extends Publicacion {

    private int numero;

    public Revista(String ISBN, String titulo, int ano, int num){
        super(ISBN, titulo, ano);
        this.numero= num;
    }

    public int getNumero() {
        return numero;
    }

}
