package service;

import excepcion.ExcepcionPreparacion;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TeTest {
    private Te te;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        te = new Te("Verde");
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testConstructorPorDefecto() {
        Te t = new Te();
        assertEquals("Verde", t.getTipoTe());
        assertEquals(80, t.getTemperatura());
        assertEquals(3, t.getTiempoPreparacion());
        assertEquals(3, t.getTiempoInfusion());
    }

    @Test
    public void testConstructorConTeNegro() {
        Te t = new Te("Negro");
        assertEquals("Negro", t.getTipoTe());
        assertEquals(5, t.getTiempoInfusion());
    }

    @Test
    public void testConstructorConTeVerde() {
        Te t = new Te("Verde");
        assertEquals(3, t.getTiempoInfusion());
    }

    @Test
    public void testPreparar() throws ExcepcionPreparacion {
        te.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("remojando"));
    }

    @Test
    public void testAgregarCondimentos() throws ExcepcionPreparacion {
        te.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("limón"));
    }

    @Test
    public void testAgregarExtras() throws ExcepcionPreparacion {
        te.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("miel"));
    }

    @Test
    public void testPrepararReceta() throws ExcepcionPreparacion {
        te.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("hirviendo agua"));
    }

    @Test
    public void testGetTiempoInfusion() {
        assertEquals(3, te.getTiempoInfusion());
    }

    @Test
    public void testGetTipoTe() {
        assertEquals("Verde", te.getTipoTe());
    }

    @Test
    public void testToString() {
        String esperado = "te";
        String obtenido = te.toString().toLowerCase();
        assertTrue(obtenido.contains(esperado));
    }
}