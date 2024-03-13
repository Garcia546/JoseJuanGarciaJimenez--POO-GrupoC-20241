
package bank_2;

import java.util.Scanner;
public class Cuentas 
{
     private long accountNumber;
    private double mount;
    private char tipo;
    private double cantidad;

    public Cuentas(long accountNumber, char tipo)
    {
        this.accountNumber = accountNumber;
        this.tipo = tipo;
    }

    public void mostrarInformacion() {
        System.out.println("\nNúmero de cuenta: " + accountNumber + "\nSaldo: " + mount + "\nTipo de cuenta: " + tipo);
    }

    public long getAccountNumber() 
    {
        return accountNumber;
    }

    public double getMount() 
    {
        return mount;
    }

    public char getTipo() 
    {
        return tipo;
    }
    
    
    public void setTipo(char tipo) 
    {
        switch(tipo)
        {
            case 'A':
            case 'B':
            case 'C':
            break;
            
            default:
                System.out.println("\nTipo de cuenta no válido");
        }
        this.tipo = tipo;
    }
    
    Scanner leer = new Scanner(System.in);
    public void depositar()
    {
         switch (tipo) 
         {
            case 'A':
                System.out.print("\nCantidad que deseas ingresar (máximo $50,000): ");
                cantidad = leer.nextDouble();
                if (cantidad > 50000) 
                {
                    System.out.println("No puedes ingresar más de $50,000");
                    return; // Salir del método si la cantidad excede el límite
                }
                break;

            case 'B':
                System.out.print("\nCantidad que deseas ingresar (máximo $100,000): ");
                cantidad = leer.nextDouble();
                if (cantidad > 100000) 
                {
                    System.out.println("No puedes ingresar más de $100,000");
                    return; // Salir del método si la cantidad excede el límite
                }
                break;

            case 'C':
                System.out.print("\nCantidad que deseas ingresar (ilimitado): ");
                cantidad = leer.nextDouble();
                break; // No hay límite para la cuenta tipo C

            default:
                System.out.println("\nTipo de cuenta no válido");
                return; // Salir del método si el tipo de cuenta no es válido
        }
        System.out.println("Se han agregado: $" + cantidad);
        mount += cantidad;
    }
    
    public void retirar()
    {
        switch (tipo) 
        {
            case 'A':
                System.out.print("Cantidad que deseas retirar (mínimo $1,000): ");
                cantidad = leer.nextDouble();
                if (mount - cantidad < 1000) 
                {
                    System.out.println("No puedes retirar más de lo permitido o dejar el saldo menor al mínimo");
                    return; // Salir del método si el retiro excede el límite o deja el saldo menor al mínimo
                }
                break;
                
            case 'B':
                System.out.print("Cantidad que deseas retirar (mínimo $5,000): ");
                cantidad = leer.nextDouble();
                if (mount - cantidad < 5000) 
                {
                    System.out.println("No puedes retirar más de lo permitido o dejar el saldo menor al mínimo");
                    return; // Salir del método si el retiro excede el límite o deja el saldo menor al mínimo
                }
                break;
                
            case 'C':
                System.out.print("Cantidad que deseas retirar (mínimo $10,000): ");
                cantidad = leer.nextDouble();
                if (mount - cantidad < 10000)
                {
                    System.out.println("No puedes retirar más de lo permitido o dejar el saldo menor al mínimo");
                    return; // Salir del método si el retiro excede el límite o deja el saldo menor al mínimo
                }
                break;
                
            default:
                System.out.println("Tipo de cuenta no válido");
                return; // Salir del método si el tipo de cuenta no es válido
        }
        System.out.println("Se han retirado: $" + cantidad);
        mount -= cantidad;
    }
}
