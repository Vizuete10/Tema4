package pruebas;

import java.util.Scanner;

public class SimonSay {
    public static void main(String[] args) {
   
        int[] secuencia = new int[100]; 
        int longitudSecuencia = 0; // Controlamos cuántos números válidos hay
        
        Scanner sc = new Scanner(System.in);
        boolean correcto = true;
        
        System.out.println("SIMÓN DICE (Memoriza los números)");

        while (correcto && longitudSecuencia < 100) {
            // 1. Añadimos un número nuevo a la secuencia
            secuencia[longitudSecuencia] = (int)(Math.random() * 4) + 1; // Números 1-4
            longitudSecuencia++;

            // 2. Mostramos la secuencia
            System.out.println("\nSecuencia: ");
            for (int i = 0; i < longitudSecuencia; i++) {
                System.out.print(secuencia[i] + " ");
            }
            System.out.println();
            
            // Simular "limpiar pantalla" con saltos de línea
            // En un caso real usaríamos Thread.sleep, pero si no lo has dado,
            // confiamos en que el usuario sea honesto y no mire arriba.
            System.out.println("\n\n\n\n\n\n\n\n\n\n"); 
            System.out.println("Tu turno (introduce los números uno a uno):");

            // 3. El usuario repite la secuencia
            for (int i = 0; i < longitudSecuencia; i++) {
                try {
                    System.out.print("Posición " + (i+1) + ": ");
                    int numeroUsuario = Integer.parseInt(sc.next());

                    if (numeroUsuario != secuencia[i]) {
                        System.out.println("¡Incorrecto! Era el " + secuencia[i]);
                        correcto = false;
                        break; // Salida anticipada [cite: 1748]
                    }
                } catch (Exception e) {
                    System.out.println("Dato inválido. Has perdido.");
                    correcto = false;
                    break;
                }
            }
            
            if (correcto) {
                System.out.println("¡Bien! Siguiente ronda.");
            }
        }
        sc.close();
    }
}

