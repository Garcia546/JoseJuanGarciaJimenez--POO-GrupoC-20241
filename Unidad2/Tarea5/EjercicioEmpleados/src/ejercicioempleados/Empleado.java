/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioempleados;



public class Empleado 
{
    //SueldoBase
    String calcularSalario(double sueldoBase)
    {
        return String.format("Sueldo base = %.4f", sueldoBase);
    }
    
    //Sueldo + bonificacion
    String calcularSalario(double sueldoBase, double bonificacion)
    {
       return String.format("Sueldo base + bonificación = %.4f", (sueldoBase+bonificacion)); 
    }
   
    //Sueldo, bonificación y horas extra
    String calcularSalario(double sueldoBase, double bonificacion, double horasExtra)
    {
     double calculo = (sueldoBase + bonificacion) + (horasExtra*20);
     return String.format("Sueldo, bonificación y horas extra = %.4f", calculo);
    }
}
