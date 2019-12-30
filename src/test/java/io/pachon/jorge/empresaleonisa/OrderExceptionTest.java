package io.pachon.jorge.empresaleonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.ORB;

import static org.junit.Assert.*;

public class OrderExceptionTest {

    OrderException orderException = new OrderException(0);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getMessage() {

        String esperado = "La cantidad no es permitida para realizar una orden 0";
        Assert.assertEquals("No es lo esperado", esperado, orderException.getMessage());
    }
}