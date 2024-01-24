package POO.POO_En_Java.Eje03;

public class PruebaAnimales {
    public static void main(String[] args) {

        Canario canario1 = new Canario("hembra");
        canario1.poneHuevo();
        System.out.println();

        Pinguino pinguino1 = new Pinguino("macho");
        pinguino1.vuela();
        pinguino1.deslizarse();
        pinguino1.poneHuevo();
        System.out.println();

        Lagarto lagarto1 = new Lagarto("macho");
        lagarto1.come();
        lagarto1.duerme();
        lagarto1.repta();
        System.out.println();

        Perro perro1 = new Perro("macho");
        Perro perro2 = new Perro("hembra");
        perro1.amamanta();
        perro2.amamanta();

    }
}
