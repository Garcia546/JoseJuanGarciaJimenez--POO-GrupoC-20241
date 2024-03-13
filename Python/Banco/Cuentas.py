

class Cuentas:
    def __init__(self, account_number, tipo):
        self.account_number = account_number
        self.mount = 0
        self.tipo = tipo
        self.cantidad = 0

    def mostrar_informacion(self):
        print("\nNúmero de cuenta: ", self.account_number, "\nSaldo: ", self.mount, "\nTipo de cuenta: ", self.tipo)

    def get_account_number(self):
        return self.account_number

    def get_mount(self):
        return self.mount

    def get_tipo(self):
        return self.tipo

    def set_tipo(self, tipo):
        self.tipo = tipo

    def depositar(self):
        if self.tipo == 'A':
            cantidad = float(input("\nCantidad que deseas ingresar (máximo $50,000): "))
            if cantidad > 50000:
                print("No puedes ingresar más de $50,000")
                return
        elif self.tipo == 'B':
            cantidad = float(input("\nCantidad que deseas ingresar (máximo $100,000): "))
            if cantidad > 100000:
                print("No puedes ingresar más de $100,000")
                return
        elif self.tipo == 'C':
            cantidad = float(input("\nCantidad que deseas ingresar (ilimitado): "))
        else:
            print("\nTipo de cuenta no válido")
            return

        print("Se han agregado: $", cantidad)
        self.mount += cantidad

    def retirar(self):
        if self.tipo == 'A':
            cantidad = float(input("Cantidad que deseas retirar (mínimo $1,000): "))
            if self.mount - cantidad < 1000:
                print("No puedes retirar más de lo permitido o dejar el saldo menor al mínimo")
                return
        elif self.tipo == 'B':
            cantidad = float(input("Cantidad que deseas retirar (mínimo $5,000): "))
            if self.mount - cantidad < 5000:
                print("No puedes retirar más de lo permitido o dejar el saldo menor al mínimo")
                return
        elif self.tipo == 'C':
            cantidad = float(input("Cantidad que deseas retirar (mínimo $10,000): "))
            if self.mount - cantidad < 10000:
                print("No puedes retirar más de lo permitido o dejar el saldo menor al mínimo")
                return
        else:
            print("Tipo de cuenta no válido")
            return

        print("Se han retirado: $", cantidad)
        self.mount -= cantidad
