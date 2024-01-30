package POO.POO_En_Java.Eje12;

public class Publicacion {

    private String isbn;
    private String titulo;
    private int ano;

    public Publicacion(String ISBN, String titulo, int ano){
        this.isbn = ISBN;
        this.titulo = titulo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "ISBN: "+this.getIsbn()+", titulo: "+this.getTitulo()+", año de publicación: "+this.getAno();
    }

    public int getAno() {
        return this.ano;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }

}
