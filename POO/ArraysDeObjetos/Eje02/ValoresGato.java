package POO.ArraysDeObjetos.Eje02;

public class ValoresGato {
    public static void main(String[] args) {

        Gatos[] gatos = new Gatos[4];

        for (int i = 0; i < gatos.length; i++) {
            System.out.print(i+"º Nombre de este gato: ");
            String nombre = System.console().readLine();
            System.out.print(i+"º Color de este gato: ");
            String color = System.console().readLine();
            System.out.print(i+"º Raza de este gato: ");
            String raza = System.console().readLine();
            gatos[i] = new Gatos(nombre, color, raza);
        }

        for (int i = 0; i < gatos.length; i++) {
            System.out.println(gatos[i]);
        }

    }
}
