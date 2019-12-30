package io.pachon.jorge.empresaleonisa;

import java.util.ArrayList;

public class Pedido {

    private int cantidadUnidad;
    private String medioPago;
    private double descuento;
    private int prontoPago;

    ArrayList<Producto> productos = new ArrayList<Producto>();

    public Pedido(int cantidadUnidad, String medioPago, double descuento, int prontoPago) {
        this.cantidadUnidad = cantidadUnidad;
        this.medioPago = medioPago;
        this.descuento = descuento;
        this.prontoPago = prontoPago;
    }

    public boolean asignarProducto(Leonisa leonisa){
    productos.add(leonisa);
    return true;
    }
    public boolean asignarProducto(Leo leo){
     productos.add(leo);
     return true;
    }
    public boolean asignarProducto(Teen teen){
     productos.add(teen);
     return true;
    }
    /*public double totalCompra(){

        return 0.0;
    }
    public double costoFactura(){

        return 0.0;
    }*/
}
