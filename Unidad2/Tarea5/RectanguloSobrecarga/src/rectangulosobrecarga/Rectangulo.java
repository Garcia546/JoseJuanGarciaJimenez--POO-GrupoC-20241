
package rectangulosobrecarga;

public class Rectangulo 
{
    //Areas
    String area(int width, int heigth)
    {
        return String.format("El área con enteros es: %d",(width*heigth)); 
    }
    
    String area(double width, double heigth)
    {
        return String.format("El área con doubles es: %.4f",(width*heigth));
    }
    
    //Perimeter
    String perimeter(int width, int heigth)
    {
        return String.format("El perímetro con enteros es: %d" , (2*(width + heigth))); 
    }
    
    String perimeter(double width, double heigth)
    {
        return String.format("El perímetro con dobles es: %.4f" , (2*(width + heigth)));
    }
}
