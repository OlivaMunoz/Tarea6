/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6;

/**
 *
 * @author HP
 */
public class Tarea6EDClase {
    
    private static final double DESCUENTO_20_PORCIENTO = 0.8;
    private static final double DESCUENTO_5_PORCIENTO = 0.95;

    public void showScreenOutPut(int numProductos, double precioProducto) {
        double Total;
        if(numProductos>3)
            precioProducto-=5;
        if (numProductos!=0){
            Total = precioProducto * DESCUENTO_20_PORCIENTO;
            System.out.println("El total a pagar es:"+Total);
            System.out.println("Enviado");
        }else {
            Total = precioProducto * DESCUENTO_5_PORCIENTO;
            System.out.println("El total a pagar es:"+Total);
            System.out.println("Enviado");
        }
    }
    
        public void Descuento(double precioProducto, int numProductos){     double Total;
        showScreenOutPut(numProductos, precioProducto);

    }
}
