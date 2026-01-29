package pruebas;
import java.util.Scanner;
public class Ahorcados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra = "adios";
        char[] letrasPalabra = palabra.toCharArray();   // Array de la palabra
        char[] palabraOculta = new char[letrasPalabra.length]; // Array de guiones

        int intentos = 6;
        boolean ganaste = false;

        // Inicializar palabra oculta con _
        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '_';
        }

        System.out.println("JUEGO DEL AHORCADO");

        while (intentos > 0 && !ganaste) {

            mostrarPalabra(palabraOculta);

            System.out.print("Introduce una letra: ");
            char letra = sc.nextLine().toLowerCase().charAt(0);

            boolean acierto = false;

            // Buscar letra en la palabra
            for (int i = 0; i < letrasPalabra.length; i++) {
                if (letrasPalabra[i] == letra) {
                    palabraOculta[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                intentos--;
                System.out.println("Fallo. Te quedan " + intentos + " intentos.");
            } else {
                System.out.println("¡Bien!");
            }

            // Comprobar si ganó
            ganaste = true;
            for (int i = 0; i < palabraOculta.length; i++) {
                if (palabraOculta[i] == '_') {
                    ganaste = false;
                    break;
                }
            }

            System.out.println();
        }

        if (ganaste) {
            System.out.println("GANASTE! La palabra era: " + palabra);
        } else {
            System.out.println("PERDISTE. La palabra era: " + palabra);
        }

        sc.close();
    }

    // Muestra la palabra con espacios
    static void mostrarPalabra(char[] palabra) {
        for (char c : palabra) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
