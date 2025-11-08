package service;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IngredienteTest {
    private Ingrediente<Integer> ingEntero;
    private Ingrediente<Double> ingDecimal;
    private Ingrediente<String> ingTexto;

    @Before
    public void before() throws Exception {
        ingEntero = new Ingrediente<>("Azúcar", 2, "cucharadas");
        ingDecimal = new Ingrediente<>("Leche", 250.5, "ml");
        ingTexto = new Ingrediente<>("Canela", "Una pizca", "");
    }

    @Test
    public void testIngredienteEntero() {
        assertEquals("Azúcar", ingEntero.getNombre());
        assertEquals(Integer.valueOf(2), ingEntero.getCantidad());
        assertEquals("cucharadas", ingEntero.getUnidad());
    }

    @Test
    public void testIngredienteDecimal() {
        assertEquals("Leche", ingDecimal.getNombre());
        assertEquals(Double.valueOf(250.5), ingDecimal.getCantidad());
        assertEquals("ml", ingDecimal.getUnidad());
    }

    @Test
    public void testIngredienteTexto() {
        assertEquals("Canela", ingTexto.getNombre());
        assertEquals("Una pizca", ingTexto.getCantidad());
        assertEquals("", ingTexto.getUnidad());
    }

    @Test
    public void testToString() {
        String resultado = ingEntero.toString();
        assertTrue(resultado.contains("Azúcar"));
        assertTrue(resultado.contains("2"));
        assertTrue(resultado.contains("cucharadas"));
    }

    @Test
    public void testGenericidadBoolean() {
        Ingrediente<Boolean> ingBool = new Ingrediente<>("Con hielo", true, "");
        assertEquals(Boolean.TRUE, ingBool.getCantidad());
    }
}