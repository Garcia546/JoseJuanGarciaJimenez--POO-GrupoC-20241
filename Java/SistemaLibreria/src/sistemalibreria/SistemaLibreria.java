/*
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
 */
package sistemalibreria;

import java.util.*;

public class SistemaLibreria {

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        
        Libreria libreriaObjeto = new Libreria();
        
        int opcion;
        
        do {
            System.out.println("\n\n\t****BIENVENIDO A LA LIBRERÍA****");
            System.out.println("\n\tMenú");
            System.out.println("1) Agregar usuario");
            System.out.println("2) Mostrar Usuarios registrados");
            System.out.println("3) Registrar libros");
            System.out.println("4) Mostrar libros registrados");
            System.out.println("5) Realizar la renta de un libro");
            System.out.println("6) Mostrar usuarios con libros rentados");
            System.out.println("7) Mostrar libros que no han sido rentados");
            System.out.println("8) Mostrar todos los libros que han sido rentados");
            System.out.println("9) Salir");

            System.out.print("\nElige una opción: ");
            opcion = leer.nextInt();

            switch (opcion) 
            {
                case 1:
                    leer.nextLine();
                    System.out.println("\nOpción 1");
                    
                    System.out.print("\nNombre del usuario: ");
                    String name = leer.nextLine();
                    
                    System.out.print("Edad: ");
                    int age = leer.nextInt();
                    
                    System.out.println("Tu id se genera automáticamente");
                    
                    Usuarios usuarioObjeto = new Usuarios(name,age, 0);
                    libreriaObjeto.agregarUsuario(usuarioObjeto);
                   
                    break;

                case 2:
                    System.out.println("\nOpción 2");
                   libreriaObjeto.mostrarUsuarios();
                    break;

                case 3:
                   leer.nextLine();
                    System.out.print("\nNombre del libro: ");
                    String tittle = leer.nextLine();
                    
                    System.out.print("Autor: ");
                    String autor = leer.nextLine();
                    
                    System.out.print("El id se genera automáticamente");
                    
                    Libro libroObjeto = new Libro(tittle, autor, 0, false);
                    libreriaObjeto.agregarLibros(libroObjeto);
                    
                    break;
                    
                case 4:
                    System.out.println("\nOpción 4");
                    libreriaObjeto.mostrarLibros();
                    break;
                    
                case 5:
                    leer.nextLine();
                    System.out.print("Ingrese el nombre del usuario que desea rentar el libro: ");
                    String nombreRentador = leer.nextLine();
                    
                    System.out.print("Ingrese el título del libro que desea rentar: ");
                    String libroRentado = leer.nextLine();

                    Usuarios usuarioRentador = null;
                    for (Usuarios nuevoUsuario : libreriaObjeto.getListaUsuarios()) 
                    {
                        if (nuevoUsuario.getName().equals(nombreRentador)) 
                        {
                            usuarioRentador = nuevoUsuario;
                            break;
                        }
                    }

                    Libro tituloRentado = null;
                    for (Libro nuevoLibro : libreriaObjeto.getListaLibros()) 
                    {
                        if (nuevoLibro.getTittle().equals(libroRentado))
                        {
                            tituloRentado = nuevoLibro;
                            break;
                        }
                    }

                    if (usuarioRentador != null && tituloRentado != null) 
                    {
                        libreriaObjeto.rentarLibro(usuarioRentador, tituloRentado);
                    } 
                    else 
                    {
                        System.out.println("\nEl usuario o el libro especificado no existe.");
                    }
                    break;
                    
                case 6:
                    libreriaObjeto.mostrarUsuariosConLibros();
                    break;
                    
                case 7: 
                    libreriaObjeto.mostrarLibrosNoRentados();
                    break;
                    
                case 8: 
                    libreriaObjeto.mostrarLibrosRentados();
                    break;
                    
                case 9:System.out.println("\nSaliendo del programa");
                    break;
             
                default:
                    System.out.println("\nOpción no válida");

            }

        } while (opcion != 9);

    }

}
