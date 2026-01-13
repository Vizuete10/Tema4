package b4;

public class Articulo {
    
    String nombre;
    double precio;
    int stock;
    double IVA;
    
    
    public Articulo(String nombre, double precio, double iva, int stock) {
        
        
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } 
       
        if (precio > 0) {
            this.precio = precio;
        }
      
        if (iva >= 0) {
            this.IVA = iva;
        }
        
        if (stock >= 0) {
            this.stock = stock;
        }
       
    }
}