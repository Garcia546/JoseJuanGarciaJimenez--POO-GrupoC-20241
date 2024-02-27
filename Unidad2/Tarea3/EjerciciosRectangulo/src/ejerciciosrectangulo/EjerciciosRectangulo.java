/*
Define una clase Rectángulo con atributos como ancho y altura, y métodos para calcular 
el área y el perímetro del rectángulo. Luego, crea instancias de esta clase y muestra 
los resultados de los cálculos.
 */
package ejerciciosrectangulo;

public class EjerciciosRectangulo 
{

    public static void main(String[] args)
    {
        //1
        System.out.println("Rectangle 1");
        Rectangulo rectangle1 = new Rectangulo(2,4);
        
        int r1,r2;
                
        r1 = rectangle1.area();
        r2 = rectangle1.perimeter();
        System.out.println("Area = " + r1);
        System.out.println("Perimeter = " + r2);
        
        //2
        System.out.println("\nRectangle 2");
        Rectangulo rectangle2 = new Rectangulo(5,6);
        r1 = rectangle2.area();
        r2 = rectangle2.perimeter();
        System.out.println("Area = " + r1);
        System.out.println("Perimeter = " + r2);
        
        //3
        System.out.println("\nRectangle 3");
        Rectangulo rectangle3 = new Rectangulo(7,2);
        r1 = rectangle3.area();
        r2 = rectangle3.perimeter();
        System.out.println("Area = "+r1);
        System.out.println("Perimeter = "+r2);
        
        //4
        System.out.println("\nRectangle 4");
        Rectangulo rectangle4 = new Rectangulo(45, 22);
        r1 = rectangle4.area();
        r2 = rectangle4.perimeter();
        System.out.println("Area = "+r1);
        System.out.println("Perimeter = "+r2);
    }   
}
