package b3;

public class PrincipalRectangulo {
	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(0,0,5,5);
		
		Rectangulo r2 = new Rectangulo(7,9,2,3);
		
		int  perimetro1 = 2 * ((r1.x2 - r1.x1) + (r1.y2 - r1.y1));
		int  perimetro2 = 2 * ((r2.x2 - r2.x1) + (r2.y2 - r2.y1));
		double area1 = (r1.x2 - r1.x1) * (r1.y2 - r1.y1);
		double area2 = (r2.x2 - r2.x1) * (r2.y2 - r2.y1);
		
		// Imprimir resultados
		
		System.out.println("Rectangulo 1: ");
		System.out.println("Perimetro: " + perimetro1);
		System.out.println("Area: " + area1);
		System.out.println("Coordenadas: (" + r1.x1 + ", " + r1.y1 + "), (" + r1.x2 + ", " + r1.y2 + ")");
		System.out.println();
		System.out.println("Rectangulo 2: ");
		System.out.println("Perimetro: " + perimetro2);
		System.out.println("Area: " + area2);
		System.out.println("Coordenadas: (" + r2.x1 + ", " + r2.y1 + "), (" + r2.x2 + ", " + r2.y2 + ")");
		
		// Cambiamos las coordenadas de ambos rectangulos
		
		r1.x1 = 2;
		r1.y1 = 2;
		r1.x2 = 6;
		r1.y2 = 6;
		
		r2.x1 = 1;
		r2.y1 = 1;
		r2.x2 = 4;
		r2.y2 = 4;
		
		perimetro1 = 2 * ((r1.x2 - r1.x1) + (r1.y2 - r1.y1));
		perimetro2 = 2 * ((r2.x2 - r2.x1) + (r2.y2 - r2.y1));
		area1 = (r1.x2 - r1.x1) * (r1.y2 - r1.y1);
		area2 = (r2.x2 - r2.x1) * (r2.y2 - r2.y1);
		
		// Imprimir resultados despues de cambiar las coordenadas
		System.out.println();
		System.out.println("Después de cambiar las coordenadas:");
		System.out.println("Rectangulo 1: ");
		System.out.println("Perimetro: " + perimetro1);
		System.out.println("Area: " + area1);
		System.out.println("Coordenadas: (" + r1.x1 + ", " + r1.y1 + "), (" + r1.x2 + ", " + r1.y2 + ")");
		System.out.println();
		System.out.println("Rectangulo 2: ");
		System.out.println("Perimetro: " + perimetro2);
		System.out.println("Area: " + area2);
		System.out.println("Coordenadas: (" + r2.x1 + ", " + r2.y1 + "), (" + r2.x2 + ", " + r2.y2 + ")");
		
		
		
	}

}
