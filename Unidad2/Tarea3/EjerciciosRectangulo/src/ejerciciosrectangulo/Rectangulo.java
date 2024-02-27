
package ejerciciosrectangulo;

public class Rectangulo 
{
    int width;
    int heigth;
    
    //Constructor
    public Rectangulo(int width, int heigth)
    {
        this.width = width;
        this.heigth = heigth;
    }

    
    //Método para calcular area
    int area()
    {
        int r1 = width * heigth;
        return r1;
    }
    
    //Método para calcular perímetro
    int perimeter() 
    {
        int r2 = 2*(width+heigth);
        return r2;
    }
}
