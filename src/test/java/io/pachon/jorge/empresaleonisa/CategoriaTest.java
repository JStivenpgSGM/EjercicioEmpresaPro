package io.pachon.jorge.empresaleonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoriaTest {

    private Categoria category;

    @Before
    public void setUp() throws Exception {
        category = new Categoria("Brasier", "XL", "Blanco", "Algodon");
    }

    @Test
    public void getTipoPrenda() {
        String esperado = "Brasier";
        Assert.assertEquals("No es lo esperado",esperado, category.getTipoPrenda());
    }

    @Test
    public void getTalla() {
        String esperado = "XL";
        Assert.assertEquals("No es lo esperado",esperado, category.getTalla());
    }

    @Test
    public void getColor() {
        String esperado = "Blanco";
        Assert.assertEquals("No es lo esperado",esperado, category.getColor());
    }

    @Test
    public void getMaterial() {
        String esperado = "Algodon";
        Assert.assertEquals("No es lo esperado",esperado, category.getMaterial());
    }
}