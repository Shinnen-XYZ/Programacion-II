package service;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ListaTest {
    private Lista lista;

    @Before
    public void before() throws Exception{
        lista = new Lista();
    }

    @Test
    public void testgetNombre() {
        String esperado = "";
        String obtenido = lista.getNombre();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testsetNombre() {
        String nombre = "Lista";
        lista.setNombre(nombre);
        String esperado = "Lista";
        String obtenido = lista.getNombre();
        assertEquals(esperado,obtenido);
    }

    @Test
    public void testgetInicio() {
        Nodo esperado = null;
        Nodo obtenido = lista.getInicio();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testsetInicio() {
        Nodo nodo = new Nodo("Inicio");
        lista.setInicio(nodo);
        Nodo esperado = nodo;
        Nodo obtenido = lista.getInicio();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testgetFin() {
        Nodo esperado = null;
        Nodo obtenido = lista.getFin();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testsetFin() {
        Nodo nodo = new Nodo("Final");
        lista.setFin(nodo);
        Nodo esperado = nodo;
        Nodo obtenido = lista.getFin();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void insertarAdelante() {
        lista.InsertarAdelante("Primero");
        boolean esperado = false;
        boolean obtenido = lista.EVacio();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testNulo(){
        boolean esperado = true;
        boolean obtenido = lista.EVacio();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testToString() {
        String esperado = "lista{nombre=\n" +
                ", inicio=null, fin=null}";
        String obtenido =  lista.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }

}