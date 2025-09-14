package service;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LugarTest {
    private Lugar lugar;

    @Before
    public void setUp() {
        lugar = new Lugar("Estudio Central", "Calle Principal 456", "2222-3333");
    }

    @Test
    public void testGetNombre() {
        String esperado = "Estudio Central";
        String obtenido = lugar.getNombre();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testSetNombre() {
        lugar.setNombre("Estudio Norte");
        String esperado = "Estudio Norte";
        String obtenido = lugar.getNombre();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testGetDireccion() {
        String esperado = "Calle Principal 456";
        String obtenido = lugar.getDireccion();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testSetDireccion() {
        lugar.setDireccion("Av. Nueva 789");
        String esperado = "Av. Nueva 789";
        String obtenido = lugar.getDireccion();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testGetTelefono() {
        String esperado = "2222-3333";
        String obtenido = lugar.getTelefono();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testSetTelefono() {
        lugar.setTelefono("2222-4444");
        String esperado = "2222-4444";
        String obtenido = lugar.getTelefono();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testConstructorVacio() {
        Lugar lugarVacio = new Lugar();
        assertNotNull(lugarVacio);
    }

    @Test
    public void testToString() {
        String resultado = lugar.toString();
        assertNotNull(resultado);
        assertTrue(resultado.contains("Estudio Central"));
        assertTrue(resultado.contains("Calle Principal 456"));
        assertTrue(resultado.contains("2222-3333"));
    }

    @Test
    public void testEquals() {
        Lugar lugar2 = new Lugar("Estudio Central", "Calle Principal 456", "2222-3333");
        boolean esperado = true;
        boolean obtenido = lugar.equals(lugar2);
        assertEquals(esperado, obtenido);
    }
}
