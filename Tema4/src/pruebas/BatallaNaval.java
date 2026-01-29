package pruebas;

import java.util.Scanner;

public class BatallaNaval {
    // Definición de constantes para mejorar la lectura
    static final int AGUA = 0;
    static final int BARCO = 1;
    static final int TOCADO = 2;
    static final int FALLO = 3;
    static final int TAM = 5;

    public static void main(String[] args) {
        int[][] mapaJugador = new int[TAM][TAM];
        int[][] mapaIA = new int[TAM][TAM];
        
        colocarBarcosAleatorios(mapaJugador, 3);
        colocarBarcosAleatorios(mapaIA, 3);
        
        Scanner sc = new Scanner(System.in);
        int barcosIARestantes = 3;

        System.out.println("--- BATALLA NAVAL ---");

        while (barcosIARestantes > 0) {
            mostrarTablero(mapaIA, true); // true para ocultar barcos
            
            int f = -1, c = -1;
            boolean entradaValida = false;

            // Bucle do-while para validar entrada [cite: 1667]
            do {
                try {
                    System.out.print("Dispara (Fila Columna): ");
                    f = Integer.parseInt(sc.next());
                    c = Integer.parseInt(sc.next());
                    
                    if (f >= 0 && f < TAM && c >= 0 && c < TAM) {
                        entradaValida = true;
                    } else {
                        System.out.println("Coordenadas incorrectas.");
                    }
                } catch (Exception e) {
                    System.out.println("Error: introduce números.");
                    sc.nextLine();
                }
            } while (!entradaValida);

            // Lógica de disparo
            if (mapaIA[f][c] == BARCO) {
                System.out.println("¡TOCADO!");
                mapaIA[f][c] = TOCADO;
                barcosIARestantes--;
            } else if (mapaIA[f][c] == AGUA) {
                System.out.println("Agua...");
                mapaIA[f][c] = FALLO;
            } else {
                System.out.println("Ya habías disparado ahí.");
            }
        }
        System.out.println("¡GANASTE!");
        sc.close();
    }

    static void colocarBarcosAleatorios(int[][] mapa, int cantidad) {
        int puestos = 0;
        while (puestos < cantidad) {
            int f = (int)(Math.random() * TAM); // 
            int c = (int)(Math.random() * TAM);
            if (mapa[f][c] == AGUA) {
                mapa[f][c] = BARCO;
                puestos++;
            }
        }
    }

    static void mostrarTablero(int[][] mapa, boolean oculto) {
        System.out.println("  0 1 2 3 4");
        for (int i = 0; i < TAM; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < TAM; j++) {
                if (mapa[i][j] == BARCO && oculto) {
                    System.out.print("~ "); // Ocultamos barco enemigo
                } else if (mapa[i][j] == AGUA) {
                    System.out.print("~ ");
                } else if (mapa[i][j] == TOCADO) {
                    System.out.print("X ");
                } else if (mapa[i][j] == FALLO) {
                    System.out.print("O ");
                } else {
                    System.out.print("B "); // Barco visible
                }
            }
            System.out.println();
        }
    }
}
