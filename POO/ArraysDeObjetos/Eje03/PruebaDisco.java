package POO.ArraysDeObjetos.Eje03;

public class PruebaDisco {
    public static void menu(){
        System.out.println("1. Listado");
        System.out.println("2. Listado");
    }
    public static void main(String[] args) {
        System.out.println(MyUuid.getUuid(6));

        Disco disco = new Disco("Maximodutti", "PEPE", "Instrumental", 12);
        System.out.println(disco);

    }
}
