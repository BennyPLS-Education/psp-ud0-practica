package act3;


import java.util.Scanner;

/**
 * <h2> Exercici 3
 * <p>
 * A aquesta activitat hem de dissenyar un programa que calculi el sou d'un
 * treballador. Ha de demanar quantes hores fa feina al dia, quants de dies al mes fa
 * feina i a quant cobra les hores. Finalment ha de mostrar el resultat per pantalla.
 */

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int hoursPerDay;
        int daysPerMonth;
        double hourlyRate;

        System.out.println("Exercici 3");
        System.out.println("----------");

        System.out.print("Quantes hores fa feina al dia? ");
        hoursPerDay = input.nextInt();

        System.out.print("Quants dies al mes fa feina? ");
        daysPerMonth = input.nextInt();

        System.out.print("A quant cobra les hores? ");
        hourlyRate = input.nextDouble();

        double salary = hoursPerDay * daysPerMonth * hourlyRate;

        System.out.println("El sou del treballador és " + salary + "€ / mensuals.");
    }
}
