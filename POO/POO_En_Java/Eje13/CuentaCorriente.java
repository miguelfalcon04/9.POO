package POO.POO_En_Java.Eje13;

import java.text.DecimalFormat;

public class CuentaCorriente {

    private double saldo;
    private String numCuenta = "";

    public CuentaCorriente(){
        this(0);
    }

    public CuentaCorriente(double saldo){
        this.generaNumero();
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Número de cta: "+this.numCuenta+" Saldo: "+formatoEuros.format(this.getSaldo())+" $";
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingreso(double cantidad){
        double total = this.saldo+cantidad;
        this.saldo = total;
    }

    public void cargo(double cantidad){
        double total = this.saldo-cantidad;
        this.saldo = total;
    }

    public void transferencia(CuentaCorriente c, double cantidad){
        this.cargo(cantidad);
        c.ingreso(cantidad);
    }

    private void generaNumero() {
        for (int i = 0; i < 10; i++) {
            numCuenta += (int) (Math.random() * 10);
        }
    }

}
