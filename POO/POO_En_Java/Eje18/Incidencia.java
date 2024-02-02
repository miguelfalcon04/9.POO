package POO.POO_En_Java.Eje18;

public class Incidencia {

    private static int codigoIncidencias;
    private int codigo; 
    private static int pendientes;
    private String estado;
    private String problema;
    private String solucion;
    private int numeroPuesto;

    public Incidencia(int numeroPuesto, String problema){
        this.numeroPuesto = numeroPuesto;
        this.problema = problema;
        this.estado = "Pendiente";
        this.codigo = codigoIncidencias++;
        pendientes++;
    }

    @Override
    public String toString() {
        String txt = "" + String.format("Inciendecia %d - Puesto: %d - %s - ",this.codigo, this.numeroPuesto, this.problema);
        if(this.estado == "Pendiente"){
            txt += this.estado;
        }else{
            txt += this.estado + " - " + this.solucion;
        }
        
        return txt;
    }

    public static int getCodigoIncidencias() {
        return codigoIncidencias;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEstado() {
        return estado;
    }

    public int getNumeroPuesto() {
        return numeroPuesto;
    }

    public static int getPendientes() {
        return pendientes;
    }

    public String getProblema() {
        return problema;
    }

    public String getSolucion() {
        return solucion;
    }

    public void resuelve(String s){
        this.solucion = s;
        this.estado = "Resuelta";
        pendientes--;
    }

    
}
