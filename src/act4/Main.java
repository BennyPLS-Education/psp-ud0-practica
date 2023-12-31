package act4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * <h2> Exercici 4
 * <p>
 * A aquesta activitat hem de dissenyar un programa que sigui capaç de llegir per
 * teclat mitjançant "InputStreamReader" i "BufferedReader" diferents tipus de dades
 * (String, Int., float i double) tenint en compte diferents excepcions utilitzant l'estructura
 * try i catch.
 */

public class Main {
    public static void main(String[] args) {
        var input = new BufferedReader(new InputStreamReader(System.in));
        String userInput;

        System.out.println("Exercici 4");
        System.out.println("----------");

        System.out.println("Introdueix 'exit' per sortir");
        System.out.println("Introdueix un 'integer', 'float', 'double' o 'string'");

        // The main loop.
        while (true) {

            // Read the user input.
            try {
                System.out.print("Introdueix un text: ");
                userInput = input.readLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                continue;
            }

            // Check if the user input is an integer.
            try {
                var userInt = Integer.parseInt(userInput);
                System.out.println("Has introduit un 'integer': " + userInt);
                continue;
            } catch (Exception ignored) {
            }

            // Check if the user input is a float.
            try {
                var userFloat = Float.parseFloat(userInput);
                if (userFloat == Float.POSITIVE_INFINITY || userFloat == Float.NEGATIVE_INFINITY) {
                    throw new Exception();
                }

                System.out.println("Has introduit un 'float': " + userFloat);
                continue;
            } catch (Exception ignored) {
            }

            // Check if the user input is a double.
            try {
                var userDouble = Double.parseDouble(userInput);
                if (userDouble == Float.POSITIVE_INFINITY || userDouble == Float.NEGATIVE_INFINITY) {
                    System.out.println("Error: El valor introduit és massa gran per ser representat amb un 'double'");
                    throw new Exception();
                }

                System.out.println("Has introduit un 'double': " + userDouble);
                continue;
            } catch (Exception ignored) {
            }

            if (userInput.equals("exit")) {
                break;
            }

            // Default option the user input is a String.
            System.out.println("Has introduit un 'string': " + userInput);
        }
    }
}
