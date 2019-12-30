package io.pachon.jorge.empresaleonisa;

public class Leo extends Producto implements ProntoPagable, Cashable{
    public Leo(String CIU, double precio, Categoria categoria) {
        super(CIU, precio, categoria);
    }
}
