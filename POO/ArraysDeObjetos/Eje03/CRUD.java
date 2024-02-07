package POO.ArraysDeObjetos.Eje03;

public interface CRUD {
    public Disco anadirDisco(Disco disco);
    public Disco actulizaDisco(String codigo, String nombre, String autor, String genero, int duracion);
    public Disco eliminaDisco(String codigo);
    public Disco[] listaDiscos();
    
}
