package io.pachon.jorge.empresaleonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PedidoTest {

    private Pedido order;
    private Leonisa leonisa;
    private Leo leo;
    private Teen teen;

    @Before
    public void setUp() throws Exception {

        order = new Pedido(3,"Efectivo",0.3, 15);
        leonisa = new Leonisa("123",23.000, new Categoria("Sport","XXL","Rojo","Lino"));
        leo = new Leo("456", 43.000, new Categoria("Formal","M","Azul", "Seda"));
        teen = new Teen("789",54.000, new Categoria("Informal", "S","Amarillo","Cuero"));

    }

    @Test
    public void asignarProducto() {
        Assert.assertTrue("No es lo que se espera", order.asignarProducto(leonisa));
    }

    @Test
    public void testAsignarProducto() {
        Assert.assertTrue("No es lo que se espera", order.asignarProducto(leo));
    }

    @Test
    public void testAsignarProducto1() {
        Assert.assertTrue("No es lo que se espera", order.asignarProducto(teen));
    }

    /*@Test
    public void totalCompra() {
        double esperado = 23.000;


    }

    @Test
    public void costoFactura() {
    }*/
}