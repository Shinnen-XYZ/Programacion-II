package service;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonaTest {
    private Persona persona;
    private Perfil perfil;
    private Lugar lugar;
    private Fotografia foto;

    @Before
    public void setUp() {
        perfil = new Perfil("Fotografo", "Especialista en retratos");
        persona = new Persona("Juan", "Perez", perfil);
        lugar = new Lugar("Estudio 1", "Av. Central 123", "2222-1111");
        foto = new Fotografia("JPG", "/fotos/retrato1.jpg", 2048.5);
    }

    @Test
    public void testGetNombre() {
        String esperado = "Juan";
        String obtenido = persona.getNombre();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testSetNombre() {
        persona.setNombre("Carlos");
        String esperado = "Carlos";
        String obtenido = persona.getNombre();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testGetApellidos() {
        String esperado = "Perez";
        String obtenido = persona.getApellidos();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testSetApellidos() {
        persona.setApellidos("Rodriguez");
        String esperado = "Rodriguez";
        String obtenido = persona.getApellidos();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testGetPerfil() {
        Perfil esperado = perfil;
        Perfil obtenido = persona.getPerfil();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testSetPerfil() {
        Perfil nuevoPerfil = new Perfil("Cliente", "Cliente regular");
        persona.setPerfil(nuevoPerfil);
        Perfil esperado = nuevoPerfil;
        Perfil obtenido = persona.getPerfil();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testAgregarLugar() {
        persona.agregarLugar(lugar);
        int esperado = 1;
        int obtenido = persona.getLugares().size();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testAgregarFotografia() {
        persona.agregarFotografia(foto);
        int esperado = 1;
        int obtenido = persona.getFotografias().size();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testAgregarLugarNull() {
        persona.agregarLugar(null);
        int esperado = 0;
        int obtenido = persona.getLugares().size();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testAgregarFotografiaNull() {
        persona.agregarFotografia(null);
        int esperado = 0;
        int obtenido = persona.getFotografias().size();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testToString() {
        String resultado = persona.toString();
        assertNotNull(resultado);
        assertTrue(resultado.contains("Juan"));
        assertTrue(resultado.contains("Perez"));
    }

    @Test
    public void testEquals() {
        Persona persona2 = new Persona("Juan", "Perez", perfil);
        boolean esperado = true;
        boolean obtenido = persona.equals(persona2);
        assertEquals(esperado, obtenido);
    }
}
