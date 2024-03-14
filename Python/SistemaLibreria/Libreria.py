class Libreria:

    __listaUsuarios = []
    __listaLibros = []

    def __init__(self):
        self.__listaUsuarios = []
        self.__listaLibros = []
    
    def getListaUsuarios(self):
        return self.__listaUsuarios
    
    def setListaUsuarios(self, listaUsuarios):
        self.__listaUsuarios = listaUsuarios
    
    def getListaLibros(self):
        return self.__listaLibros
    
    def setListaLibros(self, listaLibros):
        self.__listaLibros = listaLibros
    
    def agregarUsuario(self, nuevoUsuario):
        self.__listaUsuarios.append(nuevoUsuario)
    
    def  agregarLibros(self, nuevoLibro):
        self.__listaLibros.append(nuevoLibro)
    
    def mostrarUsuarios(self):
        if not self.__listaUsuarios:
            print("\n\t***No hay usuarios registrados***")
        else:
            print("\n\t***USUARIOS REGISTRADOS***")
            for nuevoUsuario in self.__listaUsuarios:
                print("\nNombre: " + str(nuevoUsuario.getName()) + "\nEdad: " + str(nuevoUsuario.getAge()) + "\nId generado: " + str(nuevoUsuario.getId()))
    
    def mostrarLibros(self):
        if not self.__listaLibros:
            print("\n\tNo hay libros registrados")
        else:
            print("\n\t***LIBROS REGISTRADOS***")
            for nuevoLibro in self.__listaLibros:
                print("\nTítulo: " + str(nuevoLibro.getTittle()) + "\nAutor: " + str(nuevoLibro.getAutor()) + "\nId generado: " + str(nuevoLibro.getId()))
            
    
    def rentarLibro(self, nuevoUsuario, nuevoLibro):
        if not nuevoLibro.getRentado():
            nuevoLibro.rentar()
            nuevoUsuario.rentarLibro(nuevoLibro)
            print("\nEl libro - " + str(nuevoLibro.getTittle()) + " - ha sido rentado por " + str(nuevoUsuario.getName()))
        else:
            print("\nEl libro - " + nuevoLibro.getTittle() + " - no está disponible, ya ha sido rentado.")

    def mostrarUsuariosConLibros(self):
        print("\n***Lista de usuarios que han rentado un libro***")
        for nuevoUsuario in self.__listaUsuarios:
            tieneLibrosRentados = any(libro.getRentado() for libro in nuevoUsuario.getLibrosRentados())
            if tieneLibrosRentados:
                print(str(nuevoUsuario.getName()))

    def mostrarLibrosNoRentados(self):
        print("\n***Lista de libros que no han sido rentados***")
        for nuevoLibro in self.__listaLibros:
            if not nuevoLibro.getRentado():
                print("\nTítulo: " + str(nuevoLibro.getTittle()) + "\nAutor: " + str(nuevoLibro.getAutor()))

    def mostrarLibrosRentados(self):
        print("\n***Lista de libros que han sido rentados***")
        for nuevoLibro in self.__listaLibros:
            if nuevoLibro.getRentado():
                print("\nTítulo: " + str(nuevoLibro.getTittle()) + "\nAutor: " + str(nuevoLibro.getAutor()))

        