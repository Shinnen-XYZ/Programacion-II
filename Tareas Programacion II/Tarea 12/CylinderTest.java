package service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CylinderTest {
    private Cylinder cyl;

    @Before
    public void before() throws Exception {
        cyl = new Cylinder(5, 2, 1, 3);
    }

    @Test
    public void testSetHeight() {
        cyl.setHeight(10);
        double esperado = 10.0;
        double obtenido = cyl.getHeight();
        assertEquals(esperado, obtenido, 0.001);
    }

    @Test
    public void testGetHeight() {
        double esperado = 5.0;
        double obtenido = cyl.getHeight();
        assertEquals(esperado, obtenido, 0.001);
    }

    @Test
    public void testArea() {
        double esperado = 0.0;
        double obtenido = cyl.area();
        assertEquals(esperado, obtenido, 0.001);
    }

    @Test
    public void testVolume() {
        double esperado = 0.0;
        double obtenido = cyl.volume();
        assertEquals(esperado, obtenido, 0.001);
    }

    @Test
    public void testGetName() {
        String esperado = "cilindro";
        String obtenido = cyl.getName().toLowerCase();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testToString() {
        String esperado = "círculo = {centro = [0.0, 0.0]; radio = 0.0}; altura = 5.0";
        String obtenido = cyl.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}