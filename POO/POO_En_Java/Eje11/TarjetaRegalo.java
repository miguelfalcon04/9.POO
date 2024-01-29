package POO.POO_En_Java.Eje11;

import java.text.DecimalFormat;

public class TarjetaRegalo {

    private double saldo;
    private String numTarjeta;

    public TarjetaRegalo(double saldo){
        this.saldo = saldo;
        this.numTarjeta = "";
            for (int i = 0; i < 5; i++) {
            this.numTarjeta += (int)(Math.random() * 10);
            }
    }

    @Override
    public String toString() {
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Tarjeta nº "+this.numTarjeta+" - Saldo "+ formatoEuros.format(this.saldo)+"$";
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void gasta(double cantidad){
        if(this.saldo-cantidad < 0){
            System.out.printf("No tiene sufiente saldo para gastar %.2f$\n",cantidad);
        }else{
            this.saldo -= cantidad;
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t){
        double nuevoSaldo = this.saldo + t.saldo;
        this.setSaldo(0);
        t.setSaldo(0);
        return new TarjetaRegalo(nuevoSaldo);
    }

}
