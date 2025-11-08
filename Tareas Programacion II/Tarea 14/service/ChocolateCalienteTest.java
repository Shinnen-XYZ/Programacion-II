package service;

import excepcion.ExcepcionPreparacion;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ChocolateCalienteTest {
    private ChocolateCaliente chocolate;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        chocolate = new ChocolateCaliente("Semiamargo", true);
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testConstructorPorDefecto() {
        ChocolateCaliente ch = new ChocolateCaliente();
        assertEquals("Semiamargo", ch.getTipoChocolate());
        assertEquals(85, ch.getTemperatura());
        assertEquals(5, ch.getTiempoPreparacion());
        assertTrue(ch.isConMalvaviscos());
    }

    @Test
    public void testConstructorConMalvaviscos() {
        ChocolateCaliente ch = new ChocolateCaliente("Dulce", true);
        assertTrue(ch.isConMalvaviscos());
    }

    @Test
    public void testConstructorSinMalvaviscos() {
        ChocolateCaliente ch = new ChocolateCaliente("Amargo", false);
        assertFalse(ch.isConMalvaviscos());
    }

    @Test
    public void testPreparar() throws ExcepcionPreparacion {
        chocolate.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("mezclando"));
    }

    @Test
    public void testAgregarCondimentos() throws ExcepcionPreparacion {
        chocolate.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("crema"));
    }

    @Test
    public void testAgregarExtrasConMalvaviscos() throws ExcepcionPreparacion {
        chocolate.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("malvaviscos"));
    }

    @Test
    public void testAgregarExtrasSinMalvaviscos() throws ExcepcionPreparacion {
        ChocolateCaliente ch = new ChocolateCaliente("Dulce", false);
        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));
        ch.prepararReceta();
        assertFalse(salida.toString().toLowerCase().contains("malvaviscos"));
    }

    @Test
    public void testPrepararReceta() throws ExcepcionPreparacion {
        chocolate.prepararReceta();
        assertTrue(out.toString().toLowerCase().contains("hirviendo agua"));
    }

    @Test
    public void testGetTemperatura() {
        assertEquals(85, chocolate.getTemperatura());
    }

    @Test
    public void testGetTiempoPreparacion() {
        assertEquals(5, chocolate.getTiempoPreparacion());
    }

    @Test
    public void testIsConMalvaviscos() {
        assertTrue(chocolate.isConMalvaviscos());
    }

    @Test
    public void testGetTipoChocolate() {
        assertEquals("Semiamargo", chocolate.getTipoChocolate());
    }

    @Test
    public void testToString() {
        String esperado = "chocolatecaliente";
        String obtenido = chocolate.toString().toLowerCase();
        assertTrue(obtenido.contains(esperado));
    }
}