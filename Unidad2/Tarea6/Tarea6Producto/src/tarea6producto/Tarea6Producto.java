package tarea6producto;

public class Tarea6Producto {

    public static void main(String[] args) 
    {
        
        //3 parámetros
        System.out.println("\n3 PARÁMETROS -- INFO INICIAL");
        Producto producto1 = new Producto("Galletas", 38.50, 150);
        System.out.println(producto1.getInfo());

        
        //Modificar parámetros
        System.out.println("\n\tParámetros modificados");
        
        producto1.setNombre("Chocolate");
        producto1.setPrecio(-45.5);
        producto1.setStock(5);
        producto1.aumentarStock(-8);
        producto1.reducirStock(1);
        
        System.out.println("\nINFO CAMBIADA");
        System.out.println(producto1.getInfo());
        
        
        //2 parámetros
        System.out.println("\n\n2 PARÁMETROS -- INFO INICIAL");
        Producto producto2 = new Producto("Paletas", 12.50);
        System.out.println(producto2.getInfo());
        
        producto2.setNombre(null);
        producto2.setPrecio(14.50);
        producto2.setStock(9);
        producto2.aumentarStock(15);
        producto2.reducirStock(1);
        
        System.out.println("\nINFO CAMBIADA");
        System.out.println(producto2.getInfo());
    }

}
