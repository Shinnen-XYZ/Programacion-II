package service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    private Circle C;

    @Before
    public void before() throws Exception {
        C = new Circle(1,3,4);
    }

    @Test
    public void testSetRadius() {
        C.setRadius(5);
        double esperado = 5.0;
        double obtenido = C.getRadius();
        assertEquals(esperado, obtenido, 0.001);
    }

    @Test
    public void testGetRadius() {
        double esperado = 1.0;
        double obtenido = C.getRadius();
        assertEquals(esperado, obtenido, 0.001);
    }

    @Test
    public void testArea() {
        double esperado = 3.14159;
        double obtenido = C.area();
        assertEquals(esperado, obtenido, 0.001);
    }

    @Test
    public void testGetName() {
        String esperado = "círculo";
        String obtenido = C.getName().toLowerCase();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testToString() {
        String esperado = "centro = [3.0, 4.0]; radio = 1.0";
        String obtenido = C.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}