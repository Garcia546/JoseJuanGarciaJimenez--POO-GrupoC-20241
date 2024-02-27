
package ejerciciocalculadoradeimpuestos;


public class CalculadoraImpuestos 
{
   
    //Ingresos
    String calcularImpuestos(int ingresos)
    {
        return String.format("Ingresos = %.4f", (ingresos+0.15));
    }
    
    //ingresos y porcentaje impuestos
    String calcularImpuestos(int ingresos, double porcentajeImpuestos)
    {
        double calculo = ingresos * (porcentajeImpuestos/100);
        return String.format("Ingresos y porcentajeImpuestos = %.4f",calculo);
    }
    
    //Dividendos, porcentaje de impuestos, exencion
    String calcularImpuestos( double dividendos, double porcentajeImpuestos, double exencion)
    {
        double calculoImpuestos = dividendos * (porcentajeImpuestos/100);
        
        if(calculoImpuestos > exencion)
        {
            return String.format("Impuestos mayores a exención = %.4f", (calculoImpuestos-exencion));
        }
        else
        {
            return String.format("Impuestos menores a exención = 0.0");
        }
    }
  
}
