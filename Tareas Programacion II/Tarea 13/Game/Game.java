package Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    public void play() {

        System.out.println("Juguemos Piedra, Papel o Tijera");
        System.out.println("Escribe \"piedra\", \"papel\" o \"tijera\" para indicar tu elección. De lo contrario escribe \"salir\" para terminar.");
        String choice = input.nextLine(); 
        choice = choice.toLowerCase(); 

        int empates = 0;
        int victorias = 0;
        int derrotas = 0;

        while (!choice.equals("salir")) {
            int choicenum = 0;
            if (choice.equals("piedra")) {
                choicenum = 1;
            }
            else if (choice.equals("papel")) {
                choicenum = 2;
            }
            else if (choice.equals("tijera")) {
                choicenum = 3;
            }
            else {
                while (choicenum == 0) {
                    System.out.println("Lo siento parece que no ingresaste una opción válida. Intenta de nuevo.");
                    choice = input.nextLine();
                    choice = choice.toLowerCase();
                    if (choice.equals("piedra")) {
                        choicenum = 1;
                    }
                    else if (choice.equals("papel")) {
                        choicenum = 2;
                    }
                    else if (choice.equals("tijera")) {
                        choicenum = 3;
                    }
                    else if (choice.equals("salir"))
                        System.exit(0);
                }
            }

            int compnum = (int) (random.nextInt(3)) + 1;
            if (compnum == 1) System.out.println("La computadora eligió piedra");
            if (compnum == 2) System.out.println("La computadora eligió papel");
            if (compnum == 3) System.out.println("La computadora eligió tijera");

            if (choicenum == compnum) {
                System.out.println("Es un empate");
                empates++;
            }
            else if (choicenum == 1 && compnum == 3) {
                System.out.println("¡Ganaste!");
                victorias++;
            }
            else if (choicenum == 3 && compnum == 2) {
                System.out.println("¡Ganaste!");
                victorias++;
            }
            else if (choicenum == 2 && compnum == 1) {
                System.out.println("¡Ganaste!");
                victorias++;
            }
            else {
                System.out.println("Perdiste.");
                derrotas++;
            }

            System.out.println("Victorias: " + victorias + "\nDerrotas: " + derrotas + "\nEmpates: " + empates);
            System.out.println("Juguemos de nuevo\n");
            System.out.println("Escribe \"piedra\", \"papel\" o \"tijera\" para indicar tu elección. De lo contrario escribe \"salir\" para terminar.");
            choice = input.nextLine();
            choice = choice.toLowerCase();
        }

        if (choice.equals("salir")) 
            return;
    }
}

