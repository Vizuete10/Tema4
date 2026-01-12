package a4;

public class PrincipalArticulo {
	
	public static void main(String[] args) {

		Articulo a1 = new Articulo();
		a1.nombre = "Portátil";
		a1.precio = 800.00;
		a1.stock = 10;
		
		Articulo a2 = new Articulo();
		a2.nombre = "Smartphone";
		a2.precio = 500.00;
		a2.stock = 20;
		
		double precioConIVA1 = a1.precio * (1 + a1.IVA);
		double precioConIVA2 = a2.precio * (1 + a2.IVA);
		
		// Imprimir resultados
		
		System.out.println(a1.nombre);
		System.out.println("PVP: " + a1.precio);
		System.out.println("Precio: " + precioConIVA1);
		System.out.println("Stock: " + a1.stock);
		System.out.println("IVA: " + a1.IVA);
		System.out.println();
		
		System.out.println(a2.nombre);
		System.out.println("PVP: " + a2.precio);
		System.out.println("Precio: " + precioConIVA2);
		System.out.println("Stock: " + a2.stock);
		System.out.println("IVA: " + a2.IVA);
		
		// Cambiamos el precio
		
		a1.precio = 750.00;
		a2.precio = 450.00;
		
		precioConIVA1 = a1.precio * (1 + a1.IVA);
		precioConIVA2 = a2.precio * (1 + a2.IVA);
		
		// Imprimir resultados despues de cambiar el precio
		
		System.out.println();
		System.out.println("Después de cambiar el precio:");
		System.out.println(a1.nombre);
		System.out.println("PVP: " + a1.precio);
		System.out.println("Precio: " + precioConIVA1);
		System.out.println("Stock: " + a1.stock);
		System.out.println("IVA: " + a1.IVA);
		
		System.out.println();
		System.out.println(a2.nombre);
		System.out.println("PVP: " + a2.precio);
		System.out.println("Precio: " + precioConIVA2);
		System.out.println("Stock: " + a2.stock);
		System.out.println("IVA: " + a2.IVA);
		
	}
}
