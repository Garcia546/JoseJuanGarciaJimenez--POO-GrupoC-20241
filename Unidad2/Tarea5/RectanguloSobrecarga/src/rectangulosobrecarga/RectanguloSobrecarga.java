/*
Crear una clase llamada Rectangulo la cual pueda calcular el área y el perimetro. 
Debes de considerar que el usuario puede ingresarte enteros o doubles, por lo que
debes utilizar la sobrecarga de métodos para que existan funciones con el mismo nombre
pero realicen una función diferente.
 */

package rectangulosobrecarga;


public class RectanguloSobrecarga 
{
    public static void main(String[] args) 
    {
      
        Rectangulo rectangle = new Rectangulo();
        
        System.out.println("AREA");
        System.out.println(rectangle.area(4,5));
        System.out.println(rectangle.area(4.50,1.25));
        
        System.out.println("\nPERIMETER");
        System.out.println(rectangle.perimeter(2,4));
        System.out.println(rectangle.perimeter(4.50,1.25));
    }
}
