package POO.POO_En_Java.Eje14;

public class FichaDomino {

    private int izquierda;
    private int derecha;

    public FichaDomino(){
        this.izquierda = 0;
        this. derecha = 0;
    }

    public FichaDomino(int izquierda, int derecha){
        this.izquierda = izquierda;
        this. derecha = derecha;
    }

    @Override
    public String toString() {
        return "["+this.izquierda+"|"+this.derecha+"]";
    }

    public int getDerecha() {
        return derecha;
    }

    public int getIzquierda() {
        return izquierda;
    }

    public String voltea(){
        int aux = this.derecha;
        this.derecha = this.izquierda;
        this.izquierda = aux;

        return toString();
    }

    public boolean encaja(FichaDomino f){
        if(this.derecha==f.derecha || this.derecha == f.izquierda || this.izquierda == f.derecha || this.izquierda == f.izquierda){
            return true;
        }else{
            return false;
        }
    }

}
