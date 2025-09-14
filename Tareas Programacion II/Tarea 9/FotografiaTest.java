package service;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FotografiaTest {
    private Fotografia foto;

    @Before
    public void setUp() {
        foto = new Fotografia("PNG", "/imagenes/foto001.png", 1024.75);
    }

    @Test
    public void testGetTipoArchivo() {
        String esperado = "PNG";
        String obtenido = foto.getTipoArchivo();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testSetTipoArchivo() {
        foto.setTipoArchivo("JPEG");
        String esperado = "JPEG";
        String obtenido = foto.getTipoArchivo();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testGetPathArchivo() {
        String esperado = "/imagenes/foto001.png";
        String obtenido = foto.getPathArchivo();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testSetPathArchivo() {
        foto.setPathArchivo("/nuevas/foto002.jpg");
        String esperado = "/nuevas/foto002.jpg";
        String obtenido = foto.getPathArchivo();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testGetTamanoKb() {
        double esperado = 1024.75;
        double obtenido = foto.getTamanoKb();
        assertEquals(esperado, obtenido, 0.01);
    }

    @Test
    public void testSetTamanoKb() {
        foto.setTamanoKb(2048.25);
        double esperado = 2048.25;
        double obtenido = foto.getTamanoKb();
        assertEquals(esperado, obtenido, 0.01);
    }

    @Test
    public void testConstructorVacio() {
        Fotografia fotoVacia = new Fotografia();
        assertNotNull(fotoVacia);
    }

    @Test
    public void testToString() {
        String resultado = foto.toString();
        assertNotNull(resultado);
        assertTrue(resultado.contains("PNG"));
        assertTrue(resultado.contains("/imagenes/foto001.png"));
        assertTrue(resultado.contains("1024.75"));
    }

    @Test
    public void testEquals() {
        Fotografia foto2 = new Fotografia("PNG", "/imagenes/foto001.png", 1024.75);
        boolean esperado = true;
        boolean obtenido = foto.equals(foto2);
        assertEquals(esperado, obtenido);
    }
}
