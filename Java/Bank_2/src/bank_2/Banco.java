
package bank_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco 
{
    Empleado empleado;

    Scanner leer = new Scanner(System.in);
    private ArrayList<Empleado> empleados;

    public Banco() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados()
    {
        if (empleados.isEmpty()) 
        {
            System.out.println("\n***No hay empleados registrados***");
            return;
        }
        System.out.println("\n*** LISTA DE EMPLEADOS ***");
        for (Empleado empleado : empleados) 
        {
            empleado.verCuentas();
        }
    }

    public void mostrarEmpleado(String nombre) 
    {
    boolean encontrado = false;
    for (Empleado empleado : empleados) {
        if (empleado.getName().equalsIgnoreCase(nombre)) 
        {
            empleado.verCuentas();
            encontrado = true;
            break;
        }
    }
    if (!encontrado) 
    {
        System.out.println("***Empleado no encontrado***");
    }
}

    public Empleado buscarEmpleado(String nombre) {
    for (Empleado empleado : empleados) {
        if (empleado.getName().equalsIgnoreCase(nombre)) {
            return empleado;
        }
    }
    return null;
}
}
