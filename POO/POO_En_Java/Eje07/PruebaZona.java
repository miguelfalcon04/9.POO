package POO.POO_En_Java.Eje07;

public class PruebaZona {
    public static void main(String[] args) {

        Zona salaPrincpal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        int opc = 0;
        int opc2 = 0;
        int n = 0;

        do {
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Introduzca su opción: ");
            opc = Integer.parseInt(System.console().readLine());

            switch (opc) {
                case 1:
                System.out.println("\nEn la zona principal hay " + salaPrincpal.getEntradasPorVender());
                System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());
                System.out.println("En la zona vip hay " + vip.getEntradasPorVender());
                    break;

                case 2:
                System.out.println("\n1. Principal");
                System.out.println("2. Compra-venta");
                System.out.println("3. Vip");
                System.out.print("Elige la zona para la que quieres comprar las entradas: ");
                
                opc2 = Integer.parseInt(System.console().readLine());
                
                System.out.print("¿Cuántas entradas quieres? ");
                n = Integer.parseInt(System.console().readLine());
                
                switch (opc2) {
                case 1:
                    salaPrincpal.vender(n);
                    break;
                case 2:
                    compraVenta.vender(n);
                    break;
                case 3:
                    vip.vender(n);
                    break;
                }
            }
        } while (opc!=3);

    }
}
