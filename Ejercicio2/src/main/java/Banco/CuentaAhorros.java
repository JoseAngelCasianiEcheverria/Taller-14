
package Banco;

public class CuentaAhorros extends CuentaBancaria{
    
    private double tasaInteres;

    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("No tienes suficientes fondos en la cuenta para retirar");
        }
    }

    public void aplicarInteres() {
        saldo += saldo * tasaInteres;
    }
}
