package excepcion;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExcepcionBebidaTest {

    @Test
    public void testExcepcionConMensaje() {
        ExcepcionBebida e = new ExcepcionBebida("Error de prueba");
        assertEquals("Error de prueba", e.getMessage());
    }

    @Test
    public void testExcepcionConCausa() {
        Throwable causa = new RuntimeException("Causa raíz");
        ExcepcionBebida e = new ExcepcionBebida("Error con causa", causa);
        assertEquals("Error con causa", e.getMessage());
        assertEquals(causa, e.getCause());
    }

    @Test
    public void testTemperaturaInvalida() {
        ExcepcionTemperaturaInvalida e = new ExcepcionTemperaturaInvalida("Temperatura inválida");
        assertTrue(e instanceof ExcepcionBebida);
        assertEquals("Temperatura inválida", e.getMessage());
    }

    @Test
    public void testPreparacionConMensaje() {
        ExcepcionPreparacion e = new ExcepcionPreparacion("Error en preparación");
        assertTrue(e instanceof ExcepcionBebida);
        assertEquals("Error en preparación", e.getMessage());
    }

    @Test
    public void testPreparacionConCausa() {
        Throwable causa = new NullPointerException("Valor nulo");
        ExcepcionPreparacion e = new ExcepcionPreparacion("Error con causa", causa);
        assertEquals("Error con causa", e.getMessage());
        assertEquals(causa, e.getCause());
    }

    @Test
    public void testJerarquia() {
        ExcepcionTemperaturaInvalida temp = new ExcepcionTemperaturaInvalida("Test");
        ExcepcionPreparacion prep = new ExcepcionPreparacion("Test");

        assertTrue(temp instanceof ExcepcionBebida);
        assertTrue(prep instanceof ExcepcionBebida);
        assertTrue(temp instanceof Exception);
        assertTrue(prep instanceof Exception);
    }
}