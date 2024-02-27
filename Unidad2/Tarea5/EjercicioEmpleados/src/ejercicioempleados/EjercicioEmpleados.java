/*
Crear una clase Empleado y crear métodos llamados calcularSalario para poder calcular el salario de la persona.
El / Los métodos pueden recibir hasta 3 parámetros: sueldoBase, bonificación y horas extras.
Si el usuario manda por parámetro solo el sueldo, retornar solo eso.
Si el usuario manda por parámetro sueldo y bonificación, retornar sueldo + bonificación.
Si el usuario manda por parámetro sueldo, bonificación y horas extras, retornar sueldo + bonificación + (horas * 20)
Todos los métodos deben de llamarse igual por lo que tienes que usar la sobrecarga de métodos.
 */
package ejercicioempleados;


public class EjercicioEmpleados
{
 
    public static void main(String[] args) 
    {
        Empleado empleado1 = new Empleado();
        
        System.out.println("SUELDO");
        System.out.println(empleado1.calcularSalario(1550.55));
        
        System.out.println("\nSUELDO y BONIFICACIÓN");
        System.out.println(empleado1.calcularSalario(1550.55, 152.96));
        
        System.out.println("\nSUELDO, BONIFICACIÓN Y HORAS EXTRA");
        System.out.println(empleado1.calcularSalario(1550.55, 152.96, 2.5));
    }
    
}
