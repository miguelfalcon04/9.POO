package POO.POO_En_Java.Eje08;

public class Terminal {

    private String numero;
    private int segundos;

    public Terminal(String num){
        this.numero = num;
    }

    @Override
    public String toString() {
        return "Nº "+this.numero+" - "+this.segundos+"s de conversación";
    }

    public String getNumero() {
        return numero;
    }

    public int getSegundos() {
        return segundos;
    }

    public void llama(Terminal t, int s){
        this.segundos += s;
        t.segundos+=s;
    }

}
