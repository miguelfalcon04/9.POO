package POO.POO_En_Java.Eje15;

public class FichasConcatena {
    public static void main(String[] args) {

        int izq = (int)(Math.random()*7);
        int der = (int)(Math.random()*7);
        FichaDomino f1 = new FichaDomino(izq,der);
        System.out.print(f1);

        for (int i = 0; i < 7; i++) {
            FichaDomino f2 = new FichaDomino();
            do {
                izq = (int)(Math.random()*7);
                der = (int)(Math.random()*7);
                f2 = new FichaDomino(izq,der);
            } while (f1.getDerecha()!=f2.getIzquierda());
            System.out.print(f2);
            f1.setIzquierda(f2.getIzquierda());
            f1.setDerecha(f2.getDerecha());
        }

    }
}
