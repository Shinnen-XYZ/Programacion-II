package service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class B_ProductoTest {

    private B_Producto producto;

    @Before
    public void setUp(){
        producto = new B_Producto("Producto001");
    }

    @Test
    public void testGetSku() {
        String esperado = "Producto001";
        String obtenido = producto.getSku();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testSetSku() {
        producto.setSku("Producto000");
        String esperado = "Producto000";
        String obtenido = producto.getSku();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testToString() {
        String esperado = "B_Producto: Producto001";
        String obtenido = producto.toString();
        assertEquals(esperado, obtenido);
    }
}