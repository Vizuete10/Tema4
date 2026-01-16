package c4;

public class Articulo {
    
    private String nombre;
    private double precio;
    private int stock;
    private double IVA;
    
    
    public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public double getIVA() {
		return IVA;
	}


	public void setIVA(double iVA) {
		IVA = iVA;
	}


	public Articulo(String nombre, double precio, double iva, int stock) {
        
        
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } 
       
        if (precio > 0) {
            this.precio = precio;
        }
      
        if (iva >= 0 && iva <= 1) {
            this.IVA = iva;
        }
        
        if (stock >= 0) {
            this.stock = stock;
        }
       
    }
}