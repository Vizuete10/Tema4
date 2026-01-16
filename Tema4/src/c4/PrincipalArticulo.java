package c4;

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
        a1.setPrecio(750);
        a2.setPrecio(450);
        
        // Volvemos a imprimir para ver cambios
        imprimirDetalles(a1);
        imprimirDetalles(a2);
    }
    
    // Método auxiliar para evitar repetir System.out.println tantas veces
    public static void imprimirDetalles(Articulo articulo) {
        if (articulo.getNombre() == null) {
            System.out.println(" Artículo inválido (Nombre es null)");
        } else {
            System.out.println("Nombre: " + articulo.getNombre());
        }
        System.out.println("PVP: " + articulo.getPrecio());
        // Calculamos el PVP con IVA al vuelo
        double precioConIVA = articulo.getPrecio() * (1 + articulo.getIVA());
        System.out.println("Precio con IVA: " + precioConIVA);
        System.out.println("Stock: " + articulo.getStock());
        System.out.println("IVA: " + articulo.getIVA());
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();
    }
}