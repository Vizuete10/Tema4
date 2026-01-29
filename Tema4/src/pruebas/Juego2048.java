package pruebas;
import java.util.Scanner;
import java.util.Arrays;

public class Juego2048 {
    static final int TAM = 4;

    public static void main(String[] args) {
        int[][] tablero = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };
        
        // Empezamos con dos números
        añadirNumero(tablero);
        añadirNumero(tablero);

        Scanner sc = new Scanner(System.in);
        
        while(true) {
            imprimir(tablero);
            
            if (estaLleno(tablero)) {
                System.out.println("¡Juego Terminado! Tablero lleno.");
                break;
            }

            System.out.println("Controles: W (Arriba) - A (Izquierda) - S (Abajo) - D (Derecha) - Q (Salir)");
            String op = sc.next().toLowerCase();

            if (op.equals("q")) break;
            
            boolean movido = false;
            
            if (op.equals("a")) movido = moverIzquierda(tablero);
            else if (op.equals("d")) movido = moverDerecha(tablero);
            else if (op.equals("w")) movido = moverArriba(tablero);
            else if (op.equals("s")) movido = moverAbajo(tablero);
            
            if (movido) {
                añadirNumero(tablero);
            }
        }
        sc.close();
    }

    // --- LÓGICA DE MOVIMIENTO ---

    // Mueve a la izquierda, fusiona y comprime
    static int[] procesarLinea(int[] linea) {
        int[] nueva = comprimir(linea); // 1. Quitar ceros
        
        // 2. Fusionar iguales
        for (int i = 0; i < TAM - 1; i++) {
            if (nueva[i] != 0 && nueva[i] == nueva[i+1]) {
                nueva[i] *= 2;
                nueva[i+1] = 0;
            }
        }
        
        return comprimir(nueva); // 3. Quitar ceros de nuevo
    }

    static int[] comprimir(int[] fila) {
        int[] resultado = new int[TAM];
        int pos = 0;
        for (int i = 0; i < TAM; i++) {
            if (fila[i] != 0) {
                resultado[pos] = fila[i];
                pos++;
            }
        }
        return resultado;
    }

    // --- DIRECCIONES ---

    static boolean moverIzquierda(int[][] t) {
        boolean cambio = false;
        for (int i = 0; i < TAM; i++) {
            int[] original = t[i].clone();
            t[i] = procesarLinea(t[i]);
            // AQUÍ ESTABA EL ERROR ANTES, AHORA ESTÁ CORREGIDO:
            if (!Arrays.equals(original, t[i])) cambio = true;
        }
        return cambio;
    }

    static boolean moverDerecha(int[][] t) {
        boolean cambio = false;
        for (int i = 0; i < TAM; i++) {
            int[] original = t[i].clone();
            int[] invertida = invertirArray(t[i]); // Invertimos
            int[] procesada = procesarLinea(invertida); // Procesamos
            t[i] = invertirArray(procesada); // Restauramos
            
            if (!Arrays.equals(original, t[i])) cambio = true;
        }
        return cambio;
    }

    static boolean moverArriba(int[][] t) {
        boolean cambio = false;
        for (int j = 0; j < TAM; j++) {
            int[] columna = obtenerColumna(t, j);
            int[] original = columna.clone();
            int[] procesada = procesarLinea(columna);
            colocarColumna(t, procesada, j);
            
            if (!Arrays.equals(original, procesada)) cambio = true;
        }
        return cambio;
    }

    static boolean moverAbajo(int[][] t) {
        boolean cambio = false;
        for (int j = 0; j < TAM; j++) {
            int[] columna = obtenerColumna(t, j);
            int[] original = columna.clone();
            int[] invertida = invertirArray(columna);
            int[] procesada = procesarLinea(invertida);
            colocarColumna(t, invertirArray(procesada), j);
            
            // Comprobamos cambios volviendo a leer la columna real
            if (!Arrays.equals(original, obtenerColumna(t, j))) cambio = true;
        }
        return cambio;
    }

    // --- UTILIDADES ---

    static int[] invertirArray(int[] a) {
        int[] invertido = new int[TAM];
        for (int i = 0; i < TAM; i++) {
            invertido[i] = a[TAM - 1 - i];
        }
        return invertido;
    }

    static int[] obtenerColumna(int[][] t, int col) {
        int[] columna = new int[TAM];
        for (int i = 0; i < TAM; i++) {
            columna[i] = t[i][col];
        }
        return columna;
    }

    static void colocarColumna(int[][] t, int[] col, int numCol) {
        for (int i = 0; i < TAM; i++) {
            t[i][numCol] = col[i];
        }
    }

    static boolean estaLleno(int[][] t) {
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (t[i][j] == 0) return false;
            }
        }
        return true;
    }

    static void añadirNumero(int[][] t) {
        if (estaLleno(t)) return;
        int f, c;
        do {
            f = (int)(Math.random() * TAM);
            c = (int)(Math.random() * TAM);
        } while (t[f][c] != 0);
        t[f][c] = (Math.random() < 0.9) ? 2 : 4;
    }

    static void imprimir(int[][] t) {
        System.out.println("-----------------");
        for (int i = 0; i < TAM; i++) {
            System.out.print("|");
            for (int j = 0; j < TAM; j++) {
                if (t[i][j] == 0) System.out.print(" .  ");
                else System.out.printf("%4d", t[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println("-----------------");
    }
}
