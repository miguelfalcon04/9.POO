package POO.ArraysDeObjetos.Eje01;

public class ValoresGato {
    public static void main(String[] args) {

        Gato[] gatos = new Gato[4];

        int i;

        for (i = 0; i < gatos.length; i++) {
            gatos[i] = new Gato();
            System.out.print(i+"º Nombre de este gato: ");
            String nombre = System.console().readLine();
            System.out.print(i+"º Color de este gato: ");
            String color = System.console().readLine();
            System.out.print(i+"º Raza de este gato: ");
            String raza = System.console().readLine();
            gatos[i].setNombre(nombre);
            gatos[i].setColor(color);
            gatos[i].setRaza(raza);
        }

        for (i = 0; i < gatos.length; i++) {
            System.out.println(gatos[i]);
        }

    }
}
