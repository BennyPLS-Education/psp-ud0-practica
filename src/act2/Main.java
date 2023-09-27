package act2;

import java.util.Scanner;

/**
 * <h2> Exercici 2
 * <p>
 * A aquesta activitat hem de dissenyar un programa que et faci la mitjana de les notes
 * d'un alumne, per a això el programa t'ha de sol·licitar el nom de l'alumne i les notes
 * de les 3 avaluacions per pantalla i mostrar el resultat final.
 */
public class Main {
    public static void main(String[] args) {
        double[] valuations = new double[3];

        var input = new Scanner(System.in);

        System.out.println("Exercici 2");
        System.out.println("----------");

        System.out.print("Nom de l'alumne: ");
        String name = input.nextLine();

        for (int i = 0; i < valuations.length; i++) {
            System.out.print("Nota de l'avaluació " + (i + 1) + ": ");
            valuations[i] = input.nextDouble();
        }

        double average = 0;
        for (double valuation : valuations) {
            average += valuation;
        }
        average /= valuations.length;

        System.out.println("La nota mitjana de " + name + " és " + average);
    }
}
