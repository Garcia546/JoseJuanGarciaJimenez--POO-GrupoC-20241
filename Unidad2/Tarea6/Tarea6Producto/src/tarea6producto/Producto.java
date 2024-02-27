
package tarea6producto;

public class Producto 
{
    private String nombre;
    private double precio;
    private int stock;
    
    //Constructor 3 parámetros
    public Producto(String nombre, double precio, int stock)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    //Constructor 2 parámetros
    public Producto(String nombre, double precio)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 0;
    }
    
    //Setters y getters
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        if(nombre == null)
        {
            System.out.println("El nombre no puede ser null");
        }
        else
        {
          this.nombre = nombre;  
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) 
    {
        if(precio >= 0)
        {
           this.precio = precio; 
        }
        else
        {
            System.out.println("El precio no puede ser negativo");
        }
        
    }

    public int getStock() 
    {
        return stock;
    }

    public void setStock(int stock) 
    {
        if(stock >= 0 || stock == this.stock)
        {
           this.stock = stock; 
        }
        else
        {
            System.out.println("El stock no puede ser negativo");
        }
        
    }
    
    public void aumentarStock(int cantidad)
    {
        if(cantidad > 0)
        {
            this.stock = this.stock + cantidad;
        }
        else
        {
            System.out.println("El aumento de stock no puede ser negativo");
        }
    }
    
    public void reducirStock(int cantidad)
    {
        if(cantidad > 0 && cantidad <= this.stock)
        {
            this.stock = this.stock - cantidad;
        }
        else
        {
            System.out.println("La cantidad debe ser mayor a 0 y menor o igual al stock actual");
        }
    }
    
    
    //Imprimir toda la información
    String getInfo()
    {
        return String.format("Nombre: %s \nPrecio: %.4f \nStock: %d", this.getNombre(), this.getPrecio(), this.getStock());
    }
    
    
    
    
}
