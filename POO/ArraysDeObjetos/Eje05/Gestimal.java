package POO.ArraysDeObjetos.Eje05;

public class Gestimal {

    public static void menu(){
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificaión");
        System.out.println("5. Entrada de mercancia");
        System.out.println("6. Salida de mercancia");
        System.out.println("7. Salir");
        System.out.print("Opción: ");
    }

    public static void listado(Articulos[] art){
        boolean vacio = true;
        for (int i = 0; i < art.length; i++) {
            if(art[i]!=null){
                System.out.println(art[i]);
                vacio = false;
            }else{
                if(vacio==true){
                    System.out.println("No hay ningún articulo en la base de datos");
                    System.out.println();
                }
                break;
            }
        }
    }

    public static Articulos alta(Articulos[] art, int cont){
        System.out.println();
        System.out.print("Descripción del articulo: ");
        String desc = System.console().readLine();
        System.out.print("Precio del articulo: ");
        double precio = Double.parseDouble(System.console().readLine());
        System.out.print("Precio de venta del articulo: ");
        double precioVenta = Double.parseDouble(System.console().readLine());
        System.out.print("Stock del articulo: ");
        int stock = Integer.parseInt(System.console().readLine());
        System.out.println();
        return art[cont] = new Articulos(desc, precio, precioVenta, stock);
    }

    public static Articulos baja(Articulos[] art){
        System.out.print("Código del artículo: ");
        int cod = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < art.length; i++) {
        }

        return null;

    }

    public static Articulos modificaion(Articulos[] art){
        System.out.print("Código del artículo: ");
        int cod = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < art.length; i++) {
            if(art[i].getCodigo() == cod){
                System.out.print("Nueva descripción: ");
                String descp = System.console().readLine();
                if(!descp.equals("")){
                    art[i].setDescripcion(descp);
                }
                System.out.print("Nuevo precio de compra: ");
                double precioCompra = Double.parseDouble(System.console().readLine());
                if(precioCompra!=0){
                    art[i].setPrecioCompra(precioCompra);
                }
                System.out.print("Nuevo precio de venta: ");
                double precioVenta = Double.parseDouble(System.console().readLine());
                if(precioVenta!=0){
                    art[i].setPrecioVenta(precioVenta);
                }
                System.out.print("Nuevo stock: ");
                int stock = Integer.parseInt(System.console().readLine());
                art[i].setStock(stock);
                break;
            }
        }
        return null;
    }

    public static void entradaMercancia(Articulos[] art){
        System.out.print("Código del artículo: ");
        int cod = Integer.parseInt(System.console().readLine());
        System.out.print("¿Cuánto stock entra?: ");
        int cantidad = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < art.length; i++) {
            if(art[i].getCodigo() == cod){
                art[i].entradaMercancia(cantidad);
                break;
            }
        }
    }

    public static void salidaMercancia(Articulos[] art){
        System.out.print("Código del artículo: ");
        int cod = Integer.parseInt(System.console().readLine());
        System.out.print("¿Cuánto stock sale?: ");
        int cantidad = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < art.length; i++) {
            if(art[i].getCodigo() == cod){
                art[i].salidaMercancia(cantidad);
                break;
            }
        }
    }
    public static void main(String[] args) {

        int opc = 0;
        int cont = 0;
        int longitudArticulos = 100;
        Articulos[] articulos = new Articulos[longitudArticulos];

        System.out.println("Bienvenido a GESTIMAL");
        do {
            menu();
            opc = Integer.parseInt(System.console().readLine());
            switch (opc) {
                case 1:
                    listado(articulos);
                    break;

                case 2:
                    alta(articulos, cont);
                    cont++;
                    break;

                case 3:
                    baja(articulos);
                    break;

                case 4:
                    modificaion(articulos);
                    break;

                case 5:
                    entradaMercancia(articulos);
                    break;

                case 6:
                    salidaMercancia(articulos);
                    break;

                case 7:
                    System.out.println("Gracias por usar GESTIMAL");
                    break;
            }

        } while (opc!=7);

    }
}
