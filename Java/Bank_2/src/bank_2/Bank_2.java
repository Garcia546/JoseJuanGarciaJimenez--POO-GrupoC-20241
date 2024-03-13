/*Realizar dos métodos para poder agregar o retirar dinero de la cuenta bancaria, considerar:
La cuenta bancaria debe ser de alguno de estos tipos: A, B o C y debe incluirse al momento
de dar de alta, al momento de registrar un usuario con una cuenta. Si se ingresa un valor 
diferente a esos 3 advertile al usuario y no permitir darlo de alta

- Si el número de cuenta comienza con A, la cuenta puede tener hasta $50,000
- Si el número de cuenta comienza con B, la cuenta puede tener hasta $100,000
- Si el número de cuenta es de tipo C, la cuenta puede tener saldo ilimitado

Al momento de retirar dinero de la cuenta el saldo mínimo para la cuenta de tipo A es $1,000
Al momento de retirar dinero de la cuenta el saldo mínimo para la cuenta de tipo B es $5,000
Al momento de retirar dinero de la cuenta el saldo mínimo para la cuenta de tipo C es $10,000

Crear un método para poder ver la cuenta de algún empleado (SI ES QUE CUENTA CON ELLA) con el
siguiente formato: "El número de cuenta del empleado es 1234, su saldo es 1000, y la cuenta es tipo A", los datos son variables

Realizar todas las validaciones correspondientes y advertilre al usuario antes de hacer cualquier
modificación

En base al ejercicio del empleado y la cuenta bancaria, modificarlo para que ahora un
empleado pueda tener múltiples cuentas bancarias, no solamente 1, además, incluir las 
siguientes opciones.

Opción para mostrar a todos los usuarios con su información
Opción mostrar la información de algún usuario en específico

Además, crear una clase llamad Banco, y que pueda almacenar todas las cuentas bancarias 
existentes en el sistema, y añadirle la opción para poder listar todas las cuentas existentes y alguna en específico.

Realizar el ejercicio utilizando un menú (en consola) para que el usuario pueda 
seguir usando el programa hasta que desee salir de el.


 */
package bank_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank_2 {

    public static void main(String[] args)
    {
         Scanner leer = new Scanner(System.in);
        Banco banco = new Banco(); 

        ArrayList<Empleado> empleados = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\n*** MENÚ DE OPCIONES ***");
            System.out.println("1) Agregar empleado");
            System.out.println("2) Mostrar todos los empleados");
            System.out.println("3) Mostrar información de un empleado específico");
            System.out.println("4) Depositar dinero en una cuenta");
            System.out.println("5) Retirar dinero de una cuenta");
            System.out.println("6) Salir");
            System.out.print("\nSeleccione una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) 
            {
                case 1:
                    Empleado empleado = new Empleado(null, 0, 0, new ArrayList<>());

                    System.out.print("\nNombre: ");
                    String name = leer.nextLine();
                    empleado.setName(name);

                    System.out.print("Edad: ");
                    int age = leer.nextInt();
                    empleado.setAge(age);

                    System.out.print("Salario: ");
                    double salary = leer.nextDouble();
                    empleado.setSalary(salary);

                    System.out.print("¿Cuántas cuentas desea agregar?: ");
                    int numCuentas = leer.nextInt();

                    leer.nextLine();
                    for (int i = 0; i < numCuentas; i++) 
                    {
                        System.out.print("\nTipo de cuenta " + (i+1)+" : ");
                        char type = Character.toUpperCase(leer.next().charAt(0));
                        
                        System.out.print("Número de cuenta: ");
                        long cuenta = leer.nextLong();

                        Cuentas cuentass = new Cuentas(cuenta, type);
                        empleado.getCuentas().add(cuentass); 

                        empleados.add(empleado); 
                        banco.agregarEmpleado(empleado); 
                    }

                    break;
                case 2:
                    banco.mostrarEmpleados();
                    break;

                case 3:
                    System.out.print("\nIngrese el nombre del empleado: ");
                    String nombreEmpleado = leer.nextLine();
                    banco.mostrarEmpleado(nombreEmpleado);

                    break;

                case 4:
                    System.out.print("\nIngrese el nombre del empleado: ");
                    String nombreEmpleadoDeposito = leer.nextLine();
                    Empleado empleadoDeposito = banco.buscarEmpleado(nombreEmpleadoDeposito);
                    if (empleadoDeposito != null) 
                    {
                        System.out.print("Ingrese el número de cuenta: ");
                        long numeroCuentaDeposito = leer.nextLong();
                        Cuentas cuentaDeposito = empleadoDeposito.buscarCuenta(numeroCuentaDeposito);
                        if (cuentaDeposito != null) 
                        {
                            cuentaDeposito.depositar();
                        } else 
                        {
                            System.out.println("Número de cuenta no encontrado.");
                        }
                    } 
                    else 
                    {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("\nIngrese el nombre del empleado: ");
                    String nombreEmpleadoRetiro = leer.nextLine();
                    Empleado empleadoRetiro = banco.buscarEmpleado(nombreEmpleadoRetiro);
                    if (empleadoRetiro != null) 
                    {
                        System.out.print("\nIngrese el número de cuenta: ");
                        long numeroCuentaRetiro = leer.nextLong();
                        Cuentas cuentaRetiro = empleadoRetiro.buscarCuenta(numeroCuentaRetiro);
                        if (cuentaRetiro != null) 
                        {
                            cuentaRetiro.retirar();
                        } else 
                        {
                            System.out.println("\nNúmero de cuenta no encontrado.");
                        }
                    } 
                    else 
                    {
                        System.out.println("\nEmpleado no encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("\nSaliendo del programa");
                    break;

                default:
                    System.out.println("\nOpción no válida");
            }
        } while (opcion != 6);
    }   

}
