package io.pachon.jorge.empresaleonisa;

public class Teen extends Producto implements Cashable{
    public Teen(String CIU, double precio, Categoria categoria) {
        super(CIU, precio, categoria);
    }
}
