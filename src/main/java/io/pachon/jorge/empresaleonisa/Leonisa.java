package io.pachon.jorge.empresaleonisa;

public class Leonisa extends Producto implements ProntoPagable {
    public Leonisa(String CIU, double precio, Categoria categoria) {
        super(CIU, precio, categoria);
    }
}
