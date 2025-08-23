package service;


import org.junit.*;
import static org.junit.Assert.*;

public class B_InventarioTest {
    private B_Inventario inventario;
    private B_Producto producto1;
    private B_Producto producto2;

    @Before
    public void setUp(){
        inventario = new B_Inventario();
        producto1 = new B_Producto("000K12");
        producto2 = new B_Producto("000k11");
    }

    @Test
    public void testAgregarProducto() {
        inventario.agrgarProducto(producto1);
        String resultado = inventario.toString();
        assertNotNull(resultado);
    }

    @Test
    public void testAgregarDosProductos(){
        inventario.agrgarProducto(producto1);
        inventario.agrgarProducto(producto2);
        String resultado = inventario.toString();
        assertNotNull(resultado);
    }

    @Test
    public void testB_InventarioVacio(){
        String resultado = inventario.toString();
        assertEquals("Inventario:\n", resultado);
    }

    @Test
    public void testToString() {
        inventario.agrgarProducto(producto1);
        String resultado = inventario.toString();
        assertNotNull(resultado);

    }

}