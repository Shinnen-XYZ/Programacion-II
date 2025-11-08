package service;

import excepcion.ExcepcionPreparacion;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CafeTest {
    private Cafe cafe;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        cafe = new Cafe("Arábica");
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testConstructorPorDefecto() {
        Cafe c = new Cafe();
        assertEquals("Arábica", c.getTipoCafe());
        assertEquals(93, c.getTemperatura());
        assertEquals(4, c.getTiempoPreparacion());
    }

    @Test
    public void testConstructorParametrizado() {
        Cafe c = new Cafe("Colombiano");
        assertEquals("Colombiano", c.getTipoCafe());
    }

    @Test
    public void testConstructorConNulo() {
        Cafe c = new Cafe(null);
        assertEquals("Arábica", c.getTipoCafe());
    }

    @Test
    public void testPreparar() throws ExcepcionPreparacion {
        cafe.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("filtrando"));
        assertTrue(out.toString().toLowerCase().contains("café"));
    }

    @Test
    public void testAgregarCondimentos() throws ExcepcionPreparacion {
        cafe.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("azúcar"));
        assertTrue(out.toString().toLowerCase().contains("leche"));
    }

    @Test
    public void testAgregarExtras() throws ExcepcionPreparacion {
        cafe.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("canela"));
    }

    @Test
    public void testPrepararReceta() throws ExcepcionPreparacion {
        cafe.prepararReceta();
        String salida = out.toString().toLowerCase();
        assertTrue(salida.contains("hirviendo agua"));
        assertTrue(salida.contains("vertiendo"));
        assertTrue(salida.contains("bebida lista"));
    }

    @Test
    public void testGetTemperatura() {
        assertEquals(93, cafe.getTemperatura());
    }

    @Test
    public void testGetTiempoPreparacion() {
        assertEquals(4, cafe.getTiempoPreparacion());
    }

    @Test
    public void testToString() {
        String esperado = "cafe";
        String obtenido = cafe.toString().toLowerCase();
        assertTrue(obtenido.contains(esperado));
    }
}