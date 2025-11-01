package Cocumber;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private Scanner entrada = new Scanner(System.in);
    private Random aleatorio = new Random();

    public void jugar() {
        imprimirReglasJuego();

        Marcador marcador = new Marcador();
        String eleccion = entrada.nextLine().toUpperCase();

        while (!eleccion.equals("SALIR"))
        {
            OpcionJuego numEleccion = obtenerNumEleccion(eleccion);
            while(numEleccion == null)
            {
                System.out.println("Lo siento, parece que no ingresaste una entrada correcta. Intenta de nuevo.");
                eleccion = entrada.nextLine().toUpperCase();
                numEleccion = obtenerNumEleccion(eleccion);
            }

            OpcionJuego numComp = obtenerEleccionComputadora();
            completarJuego(marcador, numEleccion, numComp);
            imprimirResultados(marcador);

            eleccion = entrada.nextLine().toUpperCase();
        }
    }

    private void imprimirResultados(Marcador marcador) {
        System.out.println("ganadas:" + marcador.getGanadas() + "\nperdidas:" + marcador.getPerdidas() + "\nempates:" + marcador.getEmpate()); //imprimir el número de ganadas, empates y perdidas
        System.out.println("¡Juguemos de nuevo! \n \n"); //iniciar el juego de nuevo
        System.out.println("Di \"PIEDRA\", \"PAPEL\" o \"TIJERAS\" para indicar tu elección. De lo contrario, di \"SALIR\" para salir.");
    }

    private void completarJuego(Marcador marcador, OpcionJuego numEleccion, OpcionJuego numComp) {
        if(numEleccion == numComp) {
            empate(marcador);
        }
        else if (numEleccion == OpcionJuego.PIEDRA && numComp == OpcionJuego.TIJERAS
                || numEleccion == OpcionJuego.TIJERAS && numComp == OpcionJuego.PAPEL
                || (numEleccion == OpcionJuego.PAPEL && numComp == OpcionJuego.PIEDRA)) {
            ganar(marcador);
        } else {
            perder(marcador);
        }
    }

    private void perder(Marcador marcador) {
        System.out.println("pierdes.");
        marcador.incrementarPerdidas();
    }

    private void empate(Marcador marcador) {
        System.out.println("Es un empate");
        marcador.incrementarEmpate();
    }

    private void ganar(Marcador marcador) {
        System.out.println("¡ganaste!");
        marcador.incrementarGanadas();
    }

    private OpcionJuego obtenerNumEleccion(String eleccion) {
        OpcionJuego opcionSeleccionada = null;

        if (eleccion.equals("SALIR"))
            System.exit(0);

        try {
            // Se asume que los valores del enum OpcionJuego son PIEDRA, PAPEL, TIJERAS
            opcionSeleccionada = OpcionJuego.valueOf(eleccion);
        } catch (Exception e) {
            return null;
        }
        return opcionSeleccionada;
    }

    private OpcionJuego obtenerEleccionComputadora() {
        OpcionJuego[] opciones = OpcionJuego.values();
        OpcionJuego opcion = opciones[aleatorio.nextInt(opciones.length)];
        System.out.println("La computadora eligió " + opcion.toString().toLowerCase());
        return opcion;
    }

    private void imprimirReglasJuego() {
        System.out.println("¡Juguemos Piedra, Papel o Tijeras!");
        System.out.println("Di \"PIEDRA\", \"PAPEL\" o \"TIJERAS\" para indicar tu elección. De lo contrario, di \"SALIR\" para salir.");
    }
}
