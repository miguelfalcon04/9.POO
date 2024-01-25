package POO.POO_En_Java.Eje09;

import java.text.DecimalFormat;

public class Movil extends Terminal {

    private String tarifa;
    private double euros;

    public Movil(String num, String tari){
        super(num);
        this.tarifa = tari;
        this.euros = 0;
    }

    @Override
    public String toString() {
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return super.toString()+ " - tarificados " + formatoEuros.format(this.getEuros()) + " euros";
    }

    @Override
    public void llama(Terminal t, int s) {
        super.llama(t, s);
        double minutos = (double) s / 60;
        switch (this.getTarifa()) {
            case "rata":
                this.euros += minutos * 0.06;
                break;

            case "mono":
                this.euros += minutos * 0.12;
                break;

            case "bisonte":
                this.euros += minutos * 0.30;
                break;

        }
    }

    public String getTarifa() {
        return tarifa;
    }

    public double getEuros() {
        return euros;
    }

    public void setEuros(float euros) {
        this.euros = euros;
    }

}
