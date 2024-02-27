
package ejerciciocalculadora;
import java.util.Scanner;
public class EjercicioCalculadora 
{

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        
        double valor1, valor2;
        
        //Pedimos valores al usuario
        System.out.print("Ingresa el primer valor: ");
        valor1 = leer.nextDouble();
        
        System.out.print("Ingresa el segundo valor: ");
        valor2 = leer.nextDouble();
        
        //Objeto
        Calculadora calculadora = new Calculadora(valor1,valor2);
        
       //Mandamos llamar al método para imprimir todo
        System.out.println(calculadora.informacion());
        
        //Sobrecarga
        /*System.out.println("\nSobrecarga de métodos");
        System.out.println(calculadora.suma());
        System.out.println(calculadora.suma(100));*/
        
        
        /*
        Podemos ahorrarnos todo es código con el método para imprimir todo
        double resultado;
        System.out.println("SUMA");
        resultado = calculadora.suma();
        System.out.println("Suma = " +resultado);
        
        System.out.println("\nRESTA");
        resultado = calculadora.resta();
        System.out.println("Resta = " +resultado);
        
        System.out.println("\nMULTIPLICACIÓN");
        resultado = calculadora.mutiplicar();
        System.out.println("Resta = " +resultado);
        
        System.out.println("\nDIVISION");
        resultado = calculadora.dividir();
        System.out.println("Resta = " +resultado);
        */
    }
    
}
