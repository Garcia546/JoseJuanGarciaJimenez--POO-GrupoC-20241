"""
Se desea crear un sistema para una librería, este sistema debe de contener 3 clases, 
librería (la cual contiene libros y usuarios).  

Considerar lo siguiente:
- El sistema debe de poder contar con una opción para registrar usuarios.
- El sistema debe de poder contar con una opción para registrar libros.
- El sistema debe de poder contar con una opción para realizar la renta de un libro.
- Considerar que usuario puede rentar uno o muchos libros, pero un libro puede ser 
rentado solo por un usuario.
- El sistema debe de poder contar con una opción para listar todos los usuarios registrados.
- El sistema debe de poder contar con una opción para listar todos los libros registrados.
- El sistema debe de poder contar con una opción para listar todos los usuarios que hayan 
comprado al menos un libro.
- El sistema debe de poder contar con una opción para listar todos los libros que no han 
sido rentados.
- El sistema debe de poder contar con una opción para listar todos los libros que han sido 
rentados.
- El sistema debe de contar con n menú para que el usuario pueda interactuar con el y 
seleccionar las opciones deseadas.
"""


from Libreria import Libreria
from Usuarios import Usuarios
from Libro import Libro

libreriaObjeto = Libreria()

opcion = 0

while opcion != 9:

    print("\n\n\t****BIENVENIDO A LA LIBRERIA***")
    print("\n\tMenú")
    print("1) Agregar usuario")
    print("2) Mostrar Usuarios registrados")
    print("3) Registrar libros")
    print("4) Mostrar libros registrados")
    print("5) Realizar la renta de un libro")
    print("6) Mostrar usuarios con libros rentados")
    print("7) Mostrar libros que no han sido rentados")
    print("8) Mostrar todos los libros que han sido rentados")
    print("9) Salir")

    opcion = int(input("\nElige una opción: "))

    if opcion == 1:
      print("\nOpción 1")  
      name = input("\nNombre del usuario: ")
      age = int(input("Edad: "))
      print("Tu id se genera autmáticamente")

      usuarioObjeto = Usuarios(name, age, 0)
      libreriaObjeto.agregarUsuario(usuarioObjeto)

    elif opcion == 2:
       libreriaObjeto.mostrarUsuarios()
    
    elif opcion == 3:
       print("\nOpción 3")
       tittle = input("\nNombre del libro: ")
       autor = input("Autor: ")
       print("El id se genera automáticamente")

       libroObjeto = Libro(tittle, autor, 0, False)
       libreriaObjeto.agregarLibros(libroObjeto)
    
    elif opcion == 4:
       libreriaObjeto.mostrarLibros()
    
    elif opcion == 5:
        print("\nOpción 5")
        nombreRentador = input("Ingrese el nombre del usuario que desea rentar el libro: ")
        libroRentado = input("Ingrese el título del libro que desea rentar: ")

        usuarioRentador = None
        for nuevoUsuario in libreriaObjeto.getListaUsuarios():
            if nuevoUsuario.getName() == nombreRentador:
                usuarioRentador = nuevoUsuario
                break

        tituloRentado = None
        for nuevoLibro in libreriaObjeto.getListaLibros():
            if nuevoLibro.getTittle() == libroRentado:
                tituloRentado = nuevoLibro
                break

        if usuarioRentador and tituloRentado:
            libreriaObjeto.rentarLibro(usuarioRentador, tituloRentado)
        else:
            print("\nEl usuario o el libro especificado no existe")
    
    elif opcion ==6:
        libreriaObjeto.mostrarUsuariosConLibros()

    elif opcion == 7:
            libreriaObjeto.mostrarLibrosNoRentados()

    elif opcion == 8:
        libreriaObjeto.mostrarLibrosRentados()
    
    elif opcion == 9:
        print("\Saliendo del programa")

    else:
        print("\nOpción no válida")
