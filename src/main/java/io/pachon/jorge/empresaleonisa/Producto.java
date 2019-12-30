package io.pachon.jorge.empresaleonisa;

public class Producto {
    private String CIU;
    private double precio;
    private Categoria categoria;

    public Producto(String CIU, double precio, Categoria categoria) {
        this.CIU = CIU;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getCIU() {
        return CIU;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
