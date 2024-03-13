
package bank_2;

import java.util.ArrayList;


public class Empleado 
{
    private String name;
    private int age;
    private double salary;
    private Cuentas account;
    private ArrayList<Cuentas> cuentas;

    public Empleado(String name, int age, double salary, ArrayList<Cuentas> cuentas) 
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cuentas = cuentas;
        this.account = null;
    }
    
    public Empleado(String name, int age, double salary, long accountNumber) 
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cuentas = cuentas; //Se vincula a la lista cuentas
        this.account = null;
    }

    public ArrayList<Cuentas> getCuentas() 
    {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuentas> cuentas)
    {
        this.cuentas = cuentas;
    }
    
    
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    }

    public Cuentas getAccount() 
    {
        return account;
    }
    
    public void setAccount(Cuentas account)
    {
        this.account = account;
    }
    
    
    
    public void verCuentas() 
    {
        System.out.println("\n***INFORMACIÓN DEL EMPLEADO***");
        System.out.println("Nombre: " + this.getName() + "\nEdad: " + this.getAge() + "\nSalario: " + this.getSalary());
        System.out.println("\nCuentas bancarias:");
        for (Cuentas cuenta : cuentas) 
        {
            cuenta.mostrarInformacion();
        }
    }

    public Cuentas buscarCuenta(long numeroCuenta) 
    {
        for (Cuentas cuenta : cuentas)
        {
            if (cuenta.getAccountNumber() == numeroCuenta) 
            {
                return cuenta;
            }
        }
        return null;
    }
}
