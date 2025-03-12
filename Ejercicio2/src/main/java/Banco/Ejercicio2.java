/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Banco;

/**
 *
 * @author Gercray
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaAhorros(1000, 0.05);
        cuenta.depositar(500);
        cuenta.retirar(300);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}
