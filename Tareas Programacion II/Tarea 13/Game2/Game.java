package Game2;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    public void play() {
        imprimirReglasDelJuego();

        ScoreBoard marcador = new ScoreBoard();
        String eleccion = input.nextLine().toUpperCase();

        while (!eleccion.equals("SALIR"))
        {
            GameOption opcionJugador = obtenerOpcion(eleccion);
            while(opcionJugador == null)
            {
                System.out.println("Lo sentimos, parece que no ingresaste una opción correcta. Intenta de nuevo.");
                eleccion = input.nextLine().toUpperCase();
                opcionJugador = obtenerOpcion(eleccion);
            }

            GameOption opcionComputadora = obtenerOpcionComputadora();
            ejecutarJuego(marcador, opcionJugador, opcionComputadora);
            imprimirResultados(marcador);

            eleccion = input.nextLine().toUpperCase();
        }
    }

    private void imprimirResultados(ScoreBoard marcador) {
        System.out.println("Victorias: " + marcador.getWins()
                + "\nDerrotas: " + marcador.getLosses()
                + "\nEmpates: " + marcador.getTie());
        System.out.println("¡Vamos a jugar de nuevo! \n");
        System.out.println("Di \"Piedra\", \"Papel\" o \"Tijera\" para indicar tu elección. De lo contrario, di \"Salir\" para terminar.");
    }

    private void ejecutarJuego(ScoreBoard marcador, GameOption opcionJugador, GameOption opcionComputadora) {
        if(opcionJugador == opcionComputadora) {
            empate(marcador);
        }
        else if (opcionJugador == GameOption.ROCK && opcionComputadora == GameOption.SCISSORS
                || opcionJugador == GameOption.SCISSORS && opcionComputadora == GameOption.PAPER
                || opcionJugador == GameOption.PAPER && opcionComputadora == GameOption.ROCK) {
            victoria(marcador);
        } else {
            derrota(marcador);
        }
    }

    private void derrota(ScoreBoard marcador) {
        System.out.println("Has perdido.");
        marcador.incrementLosses();
    }

    private void empate(ScoreBoard marcador) {
        System.out.println("¡Es un empate!");
        marcador.incrementTie();
    }

    private void victoria(ScoreBoard marcador) {
        System.out.println("¡Has ganado!");
        marcador.incrementWins();
    }

    private GameOption obtenerOpcion(String eleccion) {
        GameOption opcionSeleccionada = null;

        if (eleccion.equals("SALIR"))
            System.exit(0);

        try {
            opcionSeleccionada = GameOption.valueOf(eleccion);
        } catch (Exception e) {
            return null;
        }
        return opcionSeleccionada;
    }

    private GameOption obtenerOpcionComputadora() {
        GameOption opcion = GameOption.values()[random.nextInt(3)];
        System.out.println("La computadora eligió " + opcion.toString().toLowerCase());
        return opcion;
    }

    private void imprimirReglasDelJuego() {
        System.out.println("¡Vamos a jugar Piedra, Papel o Tijera!");
        System.out.println("Di \"Piedra\", \"Papel\" o \"Tijera\" para indicar tu elección. De lo contrario, di \"Salir\" para terminar.");
    }
}

