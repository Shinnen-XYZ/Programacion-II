package Consecionario;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LlantaTest {

    private Llanta llanta;
    @Before
    public void Before(){
        llanta = new Llanta();
    }

    @Test
    public void testSetRin(){
        llanta.setRin(-5);
        int esperado = 10;
        int obtenido = llanta.getRin();
        assertEquals( esperado, obtenido);
    }
    @Test
    public void testGetRin(){
        int obtenido = llanta.getRin();
        int esperado = 10;
        assertEquals(esperado, obtenido);
    }
    @Test
    public void testToString(){
        String esperado = "llanta(rin=10)";
        String obtenido = llanta.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}