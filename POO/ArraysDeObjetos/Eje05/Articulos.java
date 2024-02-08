package POO.ArraysDeObjetos.Eje05;

public class Articulos {

    private static int codigoArticulo;
    private int codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    public Articulos(String descripcion, double precioCompra, double precioVenta, int stock){
        codigoArticulo++;
        this.codigo = codigoArticulo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    @Override
    public String toString() {
        String txt = "";
        txt += "\nCódigo de artículo: "+this.codigo;
        txt += "\nDescripción: "+this.descripcion;
        txt += "\nPrecio compra: "+this.precioCompra;
        txt += "\nPrecio venta: "+this.precioVenta;
        txt += "\nStock: "+this.stock;
        txt += "\n";
        return txt;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static int getCodigoArticulo() {
        return codigoArticulo;
    }
    public static void setCodigoArticulo(int codigoArticulo) {
        Articulos.codigoArticulo = codigoArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public Articulos alta(){
        return new Articulos(descripcion, precioCompra, precioVenta, stock);
    }

    public void entradaMercancia(int cantidad){
        this.stock += cantidad;
    }

    public void salidaMercancia(int cantidad){
        if(this.stock-cantidad>=0){
            this.stock -= cantidad;
        }else{
            System.out.println("Lo siento no disponemos de suficiente stock");
        }
    }


    
}
