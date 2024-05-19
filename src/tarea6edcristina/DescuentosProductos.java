/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6edcristina;

/**
 *
 * @author crist
 */
public class DescuentosProductos {

    public void aplicarDescuento(double precioProducto, int numProductos) {
        
        double total;
        if (numProductos > LIMITE_PRODUCTOS_DESCUENTO) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_MAXIMO;
            precioTotal(total);
        } else {
            total = precioProducto * DESCUENTO_MINIMO;
            precioTotal(total);
        }

    }
    private static final int LIMITE_PRODUCTOS_DESCUENTO = 3;
    private static final double DESCUENTO_MINIMO = 0.95;
    private static final double DESCUENTO_MAXIMO = 0.8;

    private void precioTotal(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}
