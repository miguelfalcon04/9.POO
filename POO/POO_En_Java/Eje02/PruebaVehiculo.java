package POO.POO_En_Java.Eje02;

public class PruebaVehiculo {
    public static void main(String[] args) {

        int km;
        int opc=0;
        
        Bicicleta bici = new Bicicleta(10);
        Coche coche = new Coche(2000);

        while (opc!=8) {
            
            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver Kilometraje de la bicicleta");
            System.out.println("6. Ver Kilometraje del coche");
            System.out.println("7. Ver Kilometraje Total");
            System.out.println("8. Salir");
            System.out.print("Elige una opción (1-8): ");
            opc = Integer.parseInt(System.console().readLine());
            System.out.println();


            switch (opc) {
                case 1:
                    System.out.print("¿Cuántos kilometros quiere recorrer?: ");
                    km = Integer.parseInt(System.console().readLine());
                    bici.recorre(km);
                    break;

                case 2:
                    bici.caballito();
                    break;

                case 3:
                    System.out.print("¿Cuántos kilometros quiere recorrer?: ");
                    km = Integer.parseInt(System.console().readLine());
                    coche.recorre(km);
                    break;

                case 4:
                    coche.quemaRueda();
                    break;

                case 5:
                    System.out.println("La bicicleta ha recorrido "+bici.getKilometrosRecorridos());
                    break;

                case 6:
                    System.out.println("El coche ha recorrido "+coche.getKilometrosRecorridos());
                    break;

                case 7:
                    System.out.println("En total han recorrido "+Vehiculo.getKilometrosTotales());
                    break;
            }
            System.out.println();

        }
    }
}
