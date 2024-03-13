

from Banco import Banco
from Empleado import Empleado
from Cuentas import Cuentas

   
banco = Banco()

empleados = []

opcion = 0
while opcion != 6:
        print("\n*** MENÚ DE OPCIONES ***")
        print("1) Agregar empleado")
        print("2) Mostrar todos los empleados")
        print("3) Mostrar información de un empleado específico")
        print("4) Depositar dinero en una cuenta")
        print("5) Retirar dinero de una cuenta")
        print("6) Salir")
        opcion = int(input("\nSeleccione una opción: "))
        
        if opcion == 1:
            empleado = Empleado("", 0, 0, [])
            
            name = input("\nNombre: ")
            empleado.set_name(name)
            
            age = int(input("Edad: "))
            empleado.set_age(age)
            
            salary = float(input("Salario: "))
            empleado.set_salary(salary)
            
            num_cuentas = int(input("¿Cuántas cuentas desea agregar?: "))
            for i in range(num_cuentas):
                print("\nTipo de cuenta", i+1, ": ", end="")
                tipo = input().upper()[0]
                
                cuenta = int(input("Número de cuenta: "))
                cuentas = Cuentas(cuenta, tipo)
                empleado.add_cuenta(cuentas)
                
                empleados.append(empleado)
                banco.agregar_empleado(empleado)
                
        elif opcion == 2:
            banco.mostrar_empleados()
            
        elif opcion == 3:
            nombre_empleado = input("\nIngrese el nombre del empleado: ")
            banco.mostrar_empleado(nombre_empleado)
            
        elif opcion == 4:
            nombre_empleado_deposito = input("\nIngrese el nombre del empleado: ")
            empleado_deposito = banco.buscar_empleado(nombre_empleado_deposito)
            if empleado_deposito is not None:
                numero_cuenta_deposito = int(input("Ingrese el número de cuenta: "))
                cuenta_deposito = empleado_deposito.buscar_cuenta(numero_cuenta_deposito)
                if cuenta_deposito is not None:
                    cuenta_deposito.depositar()
                else:
                    print("Número de cuenta no encontrado.")
            else:
                print("Empleado no encontrado.")
                
        elif opcion == 5:
            nombre_empleado_retiro = input("\nIngrese el nombre del empleado: ")
            empleado_retiro = banco.buscar_empleado(nombre_empleado_retiro)
            if empleado_retiro is not None:
                numero_cuenta_retiro = int(input("Ingrese el número de cuenta: "))
                cuenta_retiro = empleado_retiro.buscar_cuenta(numero_cuenta_retiro)
                if cuenta_retiro is not None:
                    cuenta_retiro.retirar()
                else:
                    print("\nNúmero de cuenta no encontrado.")
            else:
                print("\nEmpleado no encontrado.")
                
        elif opcion == 6:
            print("\nSaliendo del programa")
            
        else:
            print("\nOpción no válida")



  