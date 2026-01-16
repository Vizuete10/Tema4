package c3;

public class PrincipalRectangulo {
	
	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(0,0,5,5);
		
		Rectangulo r2 = new Rectangulo(7,9,2,3);
		
		int perimetro1 = 2 * ( (r1.getX2() - r1.getX1()) + (r1.getY2() - r1.getY1()) );
		int perimetro2 = 2 * ( (r2.getX2() - r2.getX1()) + (r2.getY2() - r2.getY1()) );
		double area1 = (r1.getX2() - r1.getX1()) * (r1.getY2() - r1.getY1());
		double area2 = (r2.getX2() - r2.getX1()) * (r2.getY2() - r2.getY1());
		
		// Imprimir resultados
		
		System.out.println("Rectangulo 1: ");
		System.out.println("Perimetro: " + perimetro1);
		System.out.println("Area: " + area1);
		System.out.println("Coordenadas: (" + r1.getX1() + ", " + r1.getY1() + "), (" + r1.getX2() + ", " + r1.getY2() + ")");
		System.out.println();
		System.out.println("Rectangulo 2: ");
		System.out.println("Perimetro: " + perimetro2);
		System.out.println("Area: " + area2);
		System.out.println("Coordenadas: (" + r2.getX1() + ", " + r2.getY1() + "), (" + r2.getX2() + ", " + r2.getY2() + ")");
		
		// Cambiamos las coordenadas de ambos rectangulos
		
		r1.setX1(2);
		r1.setY1(2);
		r1.setX2(6);
		r1.setY2(6);
		
		r2.setX1(1);
		r2.setY1(1);
		r2.setX2(4);
		r2.setY2(4);
		
		perimetro1 = 2 * ((r1.getX1() - r1.getX1()) + (r1.getY1() - r1.getY1()));
		perimetro2 = 2 * ((r2.getX2() - r2.getX1()) + (r2.getY2() - r2.getY1()));
		area1 = (r1.getX2() - r1.getX1()) * (r1.getY2() - r1.getY1());
		area2 = (r2.getX2() - r2.getX1()) * (r2.getY2() - r2.getY1());
		
		// Imprimir resultados despues de cambiar las coordenadas
		System.out.println();
		System.out.println("Después de cambiar las coordenadas:");
		System.out.println("Rectangulo 1: ");
		System.out.println("Perimetro: " + perimetro1);
		System.out.println("Area: " + area1);
		System.out.println("Coordenadas: (" + r1.getX1() + ", " + r1.getY1() + "), (" + r1.getX2() + ", " + r1.getY2() + ")");
		System.out.println();
		System.out.println("Rectangulo 2: ");
		System.out.println("Perimetro: " + perimetro2);
		System.out.println("Area: " + area2);
		System.out.println("Coordenadas: (" + r2.getX1() + ", " + r2.getY1() + "), (" + r2.getX2() + ", " + r2.getY2() + ")");
		
	}

}
