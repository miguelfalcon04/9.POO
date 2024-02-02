package POO.POO_En_Java.Eje17;

public class Rectangulo {

    private int base;
    private int altura;
    private static int rectangulosCreados = 0;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }

    @Override
    public String toString() {
        String rectangulo = "";
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                rectangulo+="*";
            }
            rectangulo+="\n";
        }
        return rectangulo;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

}
