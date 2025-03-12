/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Figuras;

/**
 *
 * @author Gercray
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Figuras circulo = new Circulo(2);
        Figuras rectangulo = new Rectangulo(8, 6);
        
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}
