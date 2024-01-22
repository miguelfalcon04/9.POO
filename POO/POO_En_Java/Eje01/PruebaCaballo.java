package POO.POO_En_Java.Eje01;

public class PruebaCaballo {
    public static void main(String[] args) {
        Caballo federico = new Caballo("federico", "marron", 10, 0);
        Caballo antonia = new Caballo("antonia", "verde", 3, 8);

        System.out.println("Hola soy "+federico.getNombre());
        federico.cabalga();
        federico.relincha();

        System.out.println("Hola yo soy "+antonia.getNombre());
        antonia.rumia();
        antonia.cabalga();

    }
}
