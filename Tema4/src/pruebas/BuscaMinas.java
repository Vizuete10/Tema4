package pruebas;

import java.util.Scanner;

public class BuscaMinas {
    static final int FILAS = 5;
    static final int COLS = 5;
    static final int MINA = -1;
    static final int VACIO = 0;

    public static void main(String[] args) {
        int[][] tablero = new int[FILAS][COLS];
        boolean[][] visible = new boolean[FILAS][COLS];
        
        inicializarTablero(tablero);
        
        Scanner sc = new Scanner(System.in);
        boolean jugando = true;

        while (jugando) {
            imprimirTablero(tablero, visible);
            
            try {
                System.out.println("Ingresa Fila y Columna (0-4): ");
                int f = Integer.parseInt(sc.next());
                int c = Integer.parseInt(sc.next());

                if (f < 0 || f >= FILAS || c < 0 || c >= COLS) {
                    System.out.println("Coordenadas fuera de rango.");
                    continue;
                }

                if (tablero[f][c] == MINA) {
                    // Revelamos todo al perder para que se vea
                    revelarTodo(visible);
                    imprimirTablero(tablero, visible);
                    System.out.println("¡BOOM! Has pisado una mina.");
                    jugando = false;
                } else {
                    destapar(tablero, visible, f, c);
                    // Comprobar victoria (opcional)
                }

            } catch (Exception e) {
                System.out.println("Error: Introduce números válidos.");
                sc.nextLine(); 
            }
        }
        sc.close();
    }

    static void inicializarTablero(int[][] t) {
        // 1. Colocamos las minas
        t[1][1] = MINA;
        t[3][3] = MINA;
        t[0][4] = MINA;
        
        // 2. IMPORTANTE: Calculamos los números alrededor
        calcularNumeros(t);
    }

    static void calcularNumeros(int[][] t) {
        // Recorremos todo el tablero
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLS; j++) {
                // Si no es mina, contamos cuántas tiene alrededor
                if (t[i][j] != MINA) {
                    int contador = 0;
                    // Miramos alrededor (3x3)
                    for (int x = i - 1; x <= i + 1; x++) {
                        for (int y = j - 1; y <= j + 1; y++) {
                            // Verificamos que esté dentro del tablero y sea mina
                            if (x >= 0 && x < FILAS && y >= 0 && y < COLS) {
                                if (t[x][y] == MINA) {
                                    contador++;
                                }
                            }
                        }
                    }
                    t[i][j] = contador; // Guardamos el número (1, 2, etc.) o 0
                }
            }
        }
    }

    static void destapar(int[][] t, boolean[][] v, int f, int c) {
        // Caso base: fuera de rango o ya destapada
        if (f < 0 || f >= FILAS || c < 0 || c >= COLS || v[f][c]) {
            return;
        }

        v[f][c] = true; // Destapamos la casilla

        // La recursividad SOLO continúa si la casilla es un 0 (VACIO).
        // Si es un número (1, 2, 3...), se destapa pero NO llama a los vecinos.
        if (t[f][c] == VACIO) {
            destapar(t, v, f + 1, c);
            destapar(t, v, f - 1, c);
            destapar(t, v, f, c + 1);
            destapar(t, v, f, c - 1);
            // También diagonales si quieres expansión completa
            destapar(t, v, f + 1, c + 1);
            destapar(t, v, f - 1, c - 1);
            destapar(t, v, f + 1, c - 1);
            destapar(t, v, f - 1, c + 1);
        }
    }

    static void imprimirTablero(int[][] t, boolean[][] v) {
        System.out.println("  0 1 2 3 4");
        for (int i = 0; i < FILAS; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < COLS; j++) {
                if (v[i][j]) {
                    // Si es mina *, si es 0 ponemos hueco, si es número el número
                    if (t[i][j] == MINA) System.out.print("* ");
                    else if (t[i][j] == 0) System.out.print("- "); // Usamos guion para ver mejor el vacío
                    else System.out.print(t[i][j] + " ");
                } else {
                    System.out.print(". "); // Oculto
                }
            }
            System.out.println();
        }
    }

    static void revelarTodo(boolean[][] v) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLS; j++) {
                v[i][j] = true;
            }
        }
    }
}
