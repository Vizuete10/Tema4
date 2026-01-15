package b4;

public class PrincipalArticulo {
    
    public static void main(String[] args) {

        System.out.println("Artículos con datos CORRECTOS");
        // Parametros: nombre, precio, iva, cuantosQuedan
        Articulo a1 = new Articulo("Portátil", 800.00, 0.21, 10);
        Articulo a2 = new Articulo("Movil", 500.00, 0.21, 20);
        
        imprimirDetalles(a1);
        imprimirDetalles(a2);

        System.out.println("Artículos con datos INCORRECTOS");
        
        // Caso A: Precio negativo (incorrecto)
        // El precio debería quedarse en 0.0
        Articulo a3 = new Articulo("Teclado", -50.00, 0.21, 5); 
        
        // Caso B: Stock negativo y Nombre vacío (incorrectos)
        // El stock debería ser 0 y el nombre null
        Articulo a4 = new Articulo("", 15.00, 0.21, -10);
        
        imprimirDetalles(a3);
        imprimirDetalles(a4);

        // Modificación de precios (como en el ejercicio original)
        System.out.println("CAMBIO DE PRECIO EN a1 y a2");
        System.out.println();
        a1.precio = 750.00;
        a2.precio = 450.00;
        
        // Volvemos a imprimir para ver cambios
        imprimirDetalles(a1);
        imprimirDetalles(a2);
    }
    
    // Método auxiliar para evitar repetir System.out.println tantas veces
    public static void imprimirDetalles(Articulo articulo) {
        if (articulo.nombre == null) {
            System.out.println(" Artículo inválido (Nombre es null)");
        } else {
            System.out.println("Nombre: " + articulo.nombre);
        }
        System.out.println("PVP: " + articulo.precio);
        // Calculamos el PVP con IVA al vuelo
        double precioConIVA = articulo.precio * (1 + articulo.IVA);
        System.out.println("Precio con IVA: " + precioConIVA);
        System.out.println("Stock: " + articulo.stock);
        System.out.println("IVA: " + articulo.IVA);
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();
    }
}