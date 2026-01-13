package b1;

public class PrincipalPunto {

	public static void main(String[] args) {

		// Objeto 1 (Inicializado con constructor)
				Punto p1 = new Punto(5, 0);

				// Objeto 2 (Inicializado con constructor)
				Punto p2 = new Punto(10, 10);

				// Objeto 3 (Inicializado con constructor)
				Punto p3 = new Punto(-3, 7);

		// Imprimimos por pantalla

		System.out.println("--- Coordenadas Iniciales ---");
		System.out.println("Punto 1: (" + p1.x + ", " + p1.y + ")");
		System.out.println("Punto 2: (" + p2.x + ", " + p2.y + ")");
		System.out.println("Punto 3: (" + p3.x + ", " + p3.y + ")");

		// Modificamos las coordenadas

		// Modificamos p1
		p1.x = p1.x + 5;
		p1.y = 10;

		// Modificamos p2
		p2.x *= 2;
		p2.y -= 5;
		// Modificamos p3
		p3.x += 13;
		p3.y--;

		// Imprimimos por pantalla

		System.out.println("--- Coordenadas Modificadas ---");
		System.out.println("Punto 1: (" + p1.x + ", " + p1.y + ")");
		System.out.println("Punto 2: (" + p2.x + ", " + p2.y + ")");
		System.out.println("Punto 3: (" + p3.x + ", " + p3.y + ")");

	}
}
