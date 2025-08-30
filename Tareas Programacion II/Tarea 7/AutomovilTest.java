package Consecionario;



import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AutomovilTest {

    private Automovil auto;


    @Before
    public void before() {
        auto = new Automovil();
    }


    @Test
    public void testToString() {
        String esperado = "Automovil{TAM=4, llantas=[Llanta(rin=10), Llanta(rin=10), Llanta(rin=10), Llanta(rin=10)]}";
        String obtenido = auto.toString();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testSetterYGetter() {
        Llanta esperado = new Llanta(20);
        Llanta[] llantas = new Llanta[4];
        llantas[0] = esperado;
        auto.setLlantas(llantas);
        Llanta obtenido = auto.getLlantas()[0];
        assertEquals(esperado, obtenido);
    }
}
