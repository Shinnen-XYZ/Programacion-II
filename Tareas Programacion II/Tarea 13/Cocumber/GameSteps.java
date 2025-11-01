package Cocumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GameSteps{

    public static final int OPCION_PIEDRA = 0;
    public static final int OPCION_PAPEL = 1;
    public static final int OPCION_TIJERAS = 2;

    @InjectMocks
    private Game juego;

    @Mock
    Scanner scanner;

    @Mock
    Random random;

    private ByteArrayOutputStream salida;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));
    }

    @Given("que el usuario elegirá {string}")
    public void queElUsuarioElegira(String seleccionUsuario) {
        MockitoAnnotations.initMocks(this);
        when(scanner.nextLine()).thenReturn(seleccionUsuario.toUpperCase()).thenReturn("SALIR");
    }

    @And("la computadora elegirá {string}")
    public void laComputadoraElegira(String seleccionComputadora) {
        int seleccion = 0;
        if ("TIJERAS".equals(seleccionComputadora.toUpperCase())) {
            seleccion = OPCION_TIJERAS;
        }
        if ("PIEDRA".equals(seleccionComputadora.toUpperCase())) {
            seleccion = OPCION_PIEDRA;
        }
        if ("PAPEL".equals(seleccionComputadora.toUpperCase())) {
            seleccion = OPCION_PAPEL;
        }
        when(random.nextInt(3)).thenReturn(seleccion);
    }


    @When("juegan")
    public void juegan() {
        juego.jugar();
    }

    @Then("verificar que la computadora eligió {string}")
    public void verificarQueLaComputadoraEligio(String seleccionComputadora) {
        Assert.assertTrue(salida.toString().contains("La computadora eligió " + seleccionComputadora.toLowerCase()));
    }

    @And("el usuario gana")
    public void elUsuarioGana() {
        Assert.assertTrue(salida.toString().contains("ganadas:1"));
    }

    @And("el usuario pierde")
    public void elUsuarioPierde() {
        Assert.assertTrue(salida.toString().contains("perdidas:1"));
    }

    @And("el usuario empata")
    public void elUsuarioEmpata() {
        Assert.assertTrue(salida.toString().contains("empates:1"));
    }
}