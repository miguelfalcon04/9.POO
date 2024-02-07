package POO.ArraysDeObjetos.Eje03;

public class Coleccion implements CRUD{

    private Disco[] discos;

    public Coleccion(){
        discos = new Disco[100];
    }

    @Override
    public Disco anadirDisco(Disco disco) {
        for (int i = 0; i < discos.length; i++) {
            if(discos[i]!=null){
                discos[i] = disco;
                return disco;
            }
        }
        return null;
    }

    @Override
    public Disco actulizaDisco(String codigo, String nombre, String autor, String genero, int duracion) {
        Disco disco = null;
        for (int i = 0; i < discos.length; i++) {
            if(codigo==discos[i].getCodigo()){
                if(!nombre.equals("")){
                    discos[i].setNombre(nombre);
                }
                if(!autor.equals("")){
                    discos[i].setNombre(autor);
                }
                if(!genero.equals("")){
                    discos[i].setNombre(genero);
                }
                if(duracion!=0){
                    discos[i].setDuracion(duracion);
                }
                disco = discos[i];
            }
        }
        return disco;
    }

    @Override
    public Disco eliminaDisco(String codigo) {
        Disco disco = null;
        for (int i = 0; i < discos.length; i++) {
            if(codigo==discos[i].getCodigo()){
                disco = discos[i];
                discos[i] = null;
            }
        }
        return disco;
    }

    @Override
    public Disco[] listaDiscos() {
        Disco[] _discos = new Disco[discos.length];
        for (int i = 0; i < discos.length; i++) {
            _discos[0] = new Disco(discos[i].getNombre(), discos[i].getAutor(), discos[i].getGenero(), discos[i].getDuracion());
        }
        return _discos;
    }
    
}
