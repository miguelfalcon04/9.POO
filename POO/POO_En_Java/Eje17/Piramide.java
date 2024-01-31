package POO.POO_En_Java.Eje17;

public class Piramide {

    private int altura;
    private static int piramidesCreadas = 0;

    public Piramide(int alt){
        this.altura = alt;
        piramidesCreadas++;
    }

    @Override
    public String toString() {
        String piramide = "";
        for (int i = 0; i <= altura; i++) {
            for (int j = i; j < altura; j++) {
                piramide+=" ";
            }
            for (int j = 0; j < i*2-1; j++) {
                piramide +="*";
            }
            piramide+="\n";
        }
        return piramide;
    }

    public int getAltura() {
        return altura;
    }

    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

}
