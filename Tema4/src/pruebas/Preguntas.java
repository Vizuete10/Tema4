package pruebas;

import java.util.Scanner;
import java.util.Random;

public class Preguntas {

    public static void main(String[] args) {
        String[] preguntas = {
            "¿Cuál es la capital de Italia?",
            "¿Cuántos minutos tiene una hora?",
            "¿En qué continente está Egipto?",
            "¿De qué color es la esmeralda?"
        };
        String[] respuestas = {"Roma", "60", "África", "Verde"};
        
        int[] orden = {0, 1, 2, 3};
        barajar(orden);

        Scanner sc = new Scanner(System.in);
        int aciertos = 0;

        for (int i = 0; i < orden.length; i++) {
            int idx = orden[i];
            
            System.out.println("Pregunta: " + preguntas[idx]);
            System.out.print("Respuesta: ");
            String usuario = sc.nextLine();

            if (usuario.equalsIgnoreCase(respuestas[idx])) {
                System.out.println("¡Correcto!");
                aciertos++;
            } else {
                System.out.println("Fallaste. Era: " + respuestas[idx]);
            }
            System.out.println("------------------");
        }

        System.out.println("Juego terminado. Aciertos totales: " + aciertos);
    }

    // Función para desordenar el array de índices
    public static void barajar(int[] array) {
        Random r = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

