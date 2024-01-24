package POO.POO_En_Java.Eje05;

public class Pizza {

    //ATRIBUTOS
    private String tipo;
    private String tamano;
    private String estado;
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    // CONSTRUCTOR
    public Pizza(String tip, String tam) {
        this.tipo = tip;
        this.tamano = tam;
        estado = "pedida";
        totalPedidas+=1;
    }

    @Override
    public String toString() {
        return "Pizza "+this.tipo+" "+this.tamano+", "+this.estado;
    }

    //GETTER
    public String getEstado() {
        return estado;
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public String getTamano() {
        return tamano;
    }

    public String getTipo() {
        return tipo;
    }

    //METODOS
    public void sirve(){
        if(this.estado.equals("pedida")){
            totalServidas+=1;
            this.estado = "servida";
        }else{
            System.out.println("Esta pizza ya se ha servido");
        }
    }

}
