package act5;

import java.io.*;

/**
 * <h2> Exercici 5
 * <p>
 * A aquesta activitat hem de dissenyar un programa amb dos mètodes. Un
 * mètode "llegir" haurà d'imprimir per pantalla el contingut per pantalla
 * d'un fitxer local (totes les línies). L'altre mètode "escriure" haurà
 * d'escriure el text introduït per pantalla al final d'un fitxer donat.
 */

public class Main {

    private static final String PATH = "./src/act5/text.txt";

    public static void main(String[] args) throws IOException {
        System.out.println("Exercici 5");
        System.out.println("----------");
        escriure(PATH);
        llegir(PATH);
    }


    /**
     * Read a file in the file system and output
     * the contents in the console.
     *
     * @param path the path of the file to read.
     * @throws IOException if an I/O error occurs.
     */
    public static void llegir(String path) throws IOException {
        var reader = new BufferedReader(new FileReader(path));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }


    /**
     * Write a text in a file in the file system based on
     * the user input. (System.in)
     *
     * @param path the path of the file to write.
     * @throws IOException if an I/O error occurs.
     */
    public static void escriure(String path) throws IOException {
        var input = new BufferedReader(new InputStreamReader(System.in));
        String text;

        System.out.print("Introdueix un text: ");
        text = input.readLine();

        var writer = new BufferedWriter(new FileWriter(path, true));
        writer.newLine();
        writer.write(text);
        writer.close();
    }
}
