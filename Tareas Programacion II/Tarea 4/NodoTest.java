package service;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class NodoTest {
    private Nodo nodo;
    @Before
    public void SetUp(){
        nodo = new Nodo();
    }

    @Test
    public void testgetDato() {
        Object esperado = null;
        Object obtenido = nodo.getDato();
        assertEquals(esperado,obtenido);
    }

    @Test
    public void testsetDato() {
        Object dato = "Resultado";
        nodo.setDato(dato);
        Object esperado = "Resultado";
        Object obtenido = nodo.getDato();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testToString() {
        String dato = "Test del String";
        nodo.setDato(dato);
        assertEquals(dato,nodo.toString());
    }

    @Test
    public void testgetSiguiente() {
        Nodo esperado = null;
        Nodo obtenido = nodo.getSiguiente();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testsetSiguiente() {
        Nodo Nodonuevo = new Nodo("Siguiente");
        nodo.setSiguiente(Nodonuevo);
        Nodo esperado = Nodonuevo;
        Nodo obtenido = nodo.getSiguiente();
        assertEquals(esperado, obtenido);
    }

}
