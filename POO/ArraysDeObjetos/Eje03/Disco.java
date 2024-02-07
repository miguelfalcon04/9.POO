package POO.ArraysDeObjetos.Eje03;

public class Disco {
    private String codigo;
    private String autor;
    private int duracion;
    private String nombre;
    private String genero;

    public Disco(String nombre, String autor, String genero, int duracion){
        this.codigo = MyUuid.getUuid(6);
        this.autor = autor;
        this.genero = genero;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String titulo) {
        this.nombre = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.nombre;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena += "\n------------------------------------------";
        return cadena;
    }


}
