package POO.POO_En_Java.Eje12;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro(String ISBN, String titulo, int ano){
        super(ISBN, titulo, ano);
        this.prestado = false;
    }

    @Override
    public String toString() {
        String txt = "";
        if(this.estaPrestado()==true){
            txt += " (prestado)";
        }else{
            txt += " (no prestado)";
        }

        return super.toString() + txt;
    }

    public boolean getPrestado(){
        return this.prestado;
    }

    public void presta(){
        if(this.estaPrestado()==true){
            System.out.println("Lo siento, ese libro ya esta prestado");
        }else{
            this.prestado = true;
        }
    }

    public void devuelve(){
        this.prestado = false;
    }

    public boolean estaPrestado(){
        if(this.getPrestado()==true){
            return true;
        }else{
            return false;
        }
    }

}
