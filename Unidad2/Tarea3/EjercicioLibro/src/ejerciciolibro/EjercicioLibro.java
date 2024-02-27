/*
Define una clase Libro con atributos como titulo, autor y año de publicación y dales 
valores iniciales a los atributos desde la clase. Luego, crea 1 instancia de esta clase y 
muestra sus atributos, después, crea 3 más y modifica sus atributos para después mostrarlos.
(sin constructores).
 */
package ejerciciolibro;


public class EjercicioLibro 
{

    public static void main(String[] args) 
    {
        //1
        Libro libro1 = new Libro();
        System.out.println("Object 1");
        System.out.println(libro1.getinfo());
        
        //2
        System.out.println("\nObjet 2");
        Libro libro2 = new Libro();
        libro2.tittle = "Viaje al centro de la tierra";
        libro2.author = "Julio Verne";
        libro2.year = 1864;
        System.out.println(libro2.getinfo());
        
        //3
        System.out.println("\nObject 3");
        Libro libro3 = new Libro();
        libro3.tittle = "La divina comedia";
        libro3.author = "Dante Alighieri";
        libro3.year = 1314;
        System.out.println(libro3.getinfo());
        
        //4
        System.out.println("\nObject 4");
        Libro libro4 = new Libro();
        libro4.tittle = "Inquebrantables";
        libro4.author = "Daniel Habif";
        libro4.year = 2019;
        System.out.println(libro4.getinfo());
        
    }
    
}
