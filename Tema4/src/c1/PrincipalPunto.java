package c1;

public class PrincipalPunto {

	public static void main(String[] args) {

		// Objeto 1
		Punto p1 = new Punto(5, 0);

		// Objeto 2
		Punto p2 = new Punto(10, 10);

		// Objeto 3
		Punto p3 = new Punto(-3, 7);

		// Imprimimos por pantalla

		System.out.println("--- Coordenadas Iniciales ---");
		System.out.println("Punto 1: (" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("Punto 2: (" + p2.getX() + ", " + p2.getY() + ")");
		System.out.println("Punto 3: (" + p3.getX() + ", " + p3.getY() + ")");

		// Modificamos las coordenadas

		// Modificamos p1
		p1.setX(p1.getX() + 5);
		p1.setY(10);

		// Modificamos p2
		p2.setX(p2.getX() * 2);
		p2.setY(p2.getY() -5);
		// Modificamos p3
		p3.setX(p3.getX() +13);
		p3.setY(p3.getY() - 1);

		// Imprimimos por pantalla

		System.out.println("--- Coordenadas Modificadas ---");
		System.out.println("Punto 1: (" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("Punto 2: (" + p2.getX() + ", " + p2.getY() + ")");
		System.out.println("Punto 3: (" + p3.getX() + ", " + p3.getY() + ")");

	}
}
