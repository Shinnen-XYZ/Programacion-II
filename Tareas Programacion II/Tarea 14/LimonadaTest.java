package service;

import excepcion.ExcepcionPreparacion;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LimonadaTest {
    private Limonada limonada;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        limonada = new Limonada("Media", 5);
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testConstructorPorDefecto() {
        Limonada l = new Limonada();
        assertEquals("Media", l.getNivelAzucar());
        assertEquals(0, l.getTemperatura());
        assertEquals(2, l.getTiempoPreparacion());
        assertEquals(5, l.getCantidadHielo());
    }

    @Test
    public void testConstructorParametrizado() {
        Limonada l = new Limonada("Alta", 8);
        assertEquals("Alta", l.getNivelAzucar());
        assertEquals(8, l.getCantidadHielo());
    }

    @Test
    public void testConstructorConHieloNegativo() {
        Limonada l = new Limonada("Baja", -3);
        assertEquals(5, l.getCantidadHielo());
    }

    @Test
    public void testHervirAgua() throws ExcepcionPreparacion {
        limonada.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("agua fría"));
    }

    @Test
    public void testPreparar() throws ExcepcionPreparacion {
        limonada.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("exprimiendo"));
    }

    @Test
    public void testAgregarCondimentos() throws ExcepcionPreparacion {
        limonada.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("azúcar"));
    }

    @Test
    public void testAgregarExtras() throws ExcepcionPreparacion {
        limonada.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("cubos de hielo"));
    }

    @Test
    public void testPrepararReceta() throws ExcepcionPreparacion {
        limonada.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("vertiendo"));
    }

    @Test
    public void testGetTemperatura() {
        assertEquals(0, limonada.getTemperatura());
    }

    @Test
    public void testGetTiempoPreparacion() {
        assertEquals(2, limonada.getTiempoPreparacion());
    }

    @Test
    public void testGetCantidadHielo() {
        assertEquals(5, limonada.getCantidadHielo());
    }

    @Test
    public void testGetNivelAzucar() {
        assertEquals("Media", limonada.getNivelAzucar());
    }

    @Test
    public void testToString() {
        String esperado = "limonada";
        String obtenido = limonada.toString().toLowerCase();
        assertTrue(obtenido.contains(esperado));
    }
}