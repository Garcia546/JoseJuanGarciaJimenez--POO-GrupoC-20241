
package ejerciciocalculadora;

public class Calculadora 
{
    double valor1;
    double valor2;
    
    //This apunta al atributo o método
    
    public Calculadora(double valor1, double valor2)
    {
       this.valor1 = valor1;
       this.valor2 = valor2;
    }
    
    double suma()
    {
        double resultado = this.valor1 + this.valor2;
        return resultado;
    }
    
    //Sobrecarga de métodos puedo definir métodos que se llamen pero igual pero que se comporte
    //de diferente forma, en este caso uno recibe parametros y el otro no
    
     double suma(double valor3)
    {
        double resultado = this.valor1 + this.valor2 + valor3;
        return resultado;
    }
     
     
    double resta()
    {
        double resultado1 = this.valor1 - this.valor2;  
        return resultado1;
    }
    
    double multiplicar()
    {
        double resultado2 =this.valor1 * this.valor2;  
        return resultado2;
    }
    
    double dividir()
    {
        double resultado3 = this.valor1 / this.valor2;  
        return resultado3;
    }
    
    //El método puede acceder a los demás métodos
    String informacion()
    {
        //Normal
         String datos = "\nSuma: "+this.suma() + "\nResta: " + this.resta() + "\nMultiplicación: " + this.multiplicar() + "\nDivisión: " +this.dividir();
         return datos;
         
        //Cadena con formato
         /*return String.format("Suma: %f, \nResta: %f, \nMultiplicación:%f, \nDividir: %f",
                 this.suma(),
                 this.resta(),
                 this.multiplicar(),
                 this.dividir()
                         );  */    
    }
}
