package act1;

/**
 * <h2> Exercici 1
 * <p>
 * A aquest programa hem de definir dos nombre enters amb el valor que vulgueu
 * vosaltres. Per pantalla hem de mostrar la suma, la resta la multiplicació i la divisió
 * d'aquests dos nombres. (Una línia per cada resultat.)
 */

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Sum   -" + a + b);
        System.out.println("Minus -" + (a - b));
        System.out.println("Mult  -" + a * b);
        System.out.println("Div   -" + a / b);
    }
}
