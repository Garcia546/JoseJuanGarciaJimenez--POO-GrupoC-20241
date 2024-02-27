/*
Realizar una clase llamada CalculadoraImpuestos que cuente con un método llamado calcularImpuestos.
Este método puede recibir hasta 4 parámetros, ingresos (int), porcentajeImpuestos (double), dividendos (double) y exención (double).
Si el usuario manda solo los ingresos, retornar ingresos + 0.15
Si el usuario manda ventas y porcentajeImpuesto retornar ventas * (porcentajeImpuesto / 100)
Si el usuario manda dividendos, porcentajeImpuesto y exención.
Calcular los impuestos = dividendos * (porcentajeImpuesto / 100)
Si los impuestos son mayores que la exención retornar los impuestos menos la exención, sino retornar 0.
 */

package ejerciciocalculadoradeimpuestos;

public class EjercicioCalculadoraDeImpuestos
{
    public static void main(String[] args) 
    {
        
        CalculadoraImpuestos calculo1 = new CalculadoraImpuestos();
        
        System.out.println("INGRESOS");
        System.out.println(calculo1.calcularImpuestos(1555));
        
        System.out.println("\nINGRESOS Y PORCENTAJEIMPUESTOS");
        System.out.println(calculo1.calcularImpuestos(1555, 15.6));
        
        System.out.println("\nDIVIDENDOS, PORCENTAJEIMPUESTOS Y EXENCIÓN");
        System.out.println(calculo1.calcularImpuestos(15.60, 18.45, 250.5));
    }
    
}
