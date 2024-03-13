

class Banco:
    def __init__(self):
        self.empleados = []

    def agregar_empleado(self, empleado):
        self.empleados.append(empleado)

    def mostrar_empleados(self):
        if not self.empleados:
            print("\n***No hay empleados registrados***")
            return
        print("\n*** LISTA DE EMPLEADOS ***")
        for empleado in self.empleados:
            empleado.ver_cuentas()

    def mostrar_empleado(self, nombre):
        encontrado = False
        for empleado in self.empleados:
            if empleado.name.lower() == nombre.lower():
                empleado.ver_cuentas()
                encontrado = True
                break
        if not encontrado:
            print("***Empleado no encontrado***")

    def buscar_empleado(self, nombre):
        for empleado in self.empleados:
            if empleado.name.lower() == nombre.lower():
                return empleado
        return None
