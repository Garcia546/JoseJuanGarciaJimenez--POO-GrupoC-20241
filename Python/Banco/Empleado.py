class Empleado:
    def __init__(self, name, age, salary, cuentas):
        self.name = name
        self.age = age
        self.salary = salary
        self.cuentas = cuentas

    def add_cuenta(self, cuenta):
        self.cuentas.append(cuenta)

    def set_name(self, name):
        self.name = name

    def set_age(self, age):
        self.age = age

    def set_salary(self, salary):
        self.salary = salary

    def ver_cuentas(self):
        print("\n***INFORMACIÓN DEL EMPLEADO***")
        print("Nombre:", self.name, "\nEdad:", self.age, "\nSalario:", self.salary)
        print("\nCuentas bancarias:")
        for cuenta in self.cuentas:
            cuenta.mostrar_informacion()

    def buscar_cuenta(self, numero_cuenta):
        for cuenta in self.cuentas:
            if cuenta.account_number == numero_cuenta:
                return cuenta
        return None

