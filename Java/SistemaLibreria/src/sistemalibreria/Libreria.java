package sistemalibreria;

import java.util.ArrayList;
import java.util.List;

public class Libreria 
{

    private List<Usuarios> listaUsuarios;
    private List<Libro> listaLibros;

    public Libreria()
    {
        this.listaUsuarios = new ArrayList<>();
        this.listaLibros = new ArrayList<>();
    }

    public List<Usuarios> getListaUsuarios() 
    {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuarios> listaUsuarios) 
    {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    
    public void agregarUsuario(Usuarios nuevoUsuario) {
        listaUsuarios.add(nuevoUsuario);
    }

    public void agregarLibros(Libro nuevoLibro) {
        listaLibros.add(nuevoLibro);
    }

    //Funciones
    public void mostrarUsuarios() 
    {
        if (listaUsuarios.isEmpty()) 
        {
            System.out.println("\n\t***No hay usuarios registrados***");
            return;
        } 
        else 
        {
            System.out.println("\n\t***USUARIOS REGISTRADOS***");
            
            for (Usuarios nuevoUsuario : listaUsuarios) 
            {
                System.out.println("\nNombre: " + nuevoUsuario.getName() + "\nEdad: " + nuevoUsuario.getAge() + "\nId generado: " + nuevoUsuario.getId());
            }
        }

    }
    
    public void mostrarLibros() 
    {
        if (listaLibros.isEmpty()) 
        {
            System.out.println("\n\t***No hay libros registrados***");
            return;
        } 
        else 
        {
            System.out.println("\n\t***LIBROS REGISTRADOS***");
            
            for (Libro nuevoLibro : listaLibros) 
            {
                System.out.println("\nTítulo: " + nuevoLibro.getTittle() + "\nAutor: " + nuevoLibro.getAutor() + "\nId generado: " + nuevoLibro.getId());
            }
        }

    }
    
    public void rentarLibro(Usuarios nuevoUsuario, Libro nuevoLibro) 
    {
    if (!nuevoLibro.isRentado())
    {
        nuevoLibro.rentar();
        nuevoUsuario.rentarLibro(nuevoLibro); // Agregar el libro a los libros rentados por el usuario
        System.out.println("\nEl libro - " + nuevoLibro.getTittle() + " - ha sido rentado por " + nuevoUsuario.getName());
    } 
    else 
    {
        System.out.println("\nEl libro - " + nuevoLibro.getTittle() + " - no está disponible, ya ha sido rentado.");
    }
}
    
     public void mostrarUsuariosConLibros()
     {
    System.out.println("\n***Lista de usuarios que han rentado un libro***");
    for (Usuarios nuevoUsuario : listaUsuarios)
    {
        boolean tieneLibrosRentados = false;
        for (Libro libro : nuevoUsuario.getLibrosRentados()) 
        {
            if (libro.isRentado()) 
            {
                tieneLibrosRentados = true;
                break;
            }
        }
        if (tieneLibrosRentados) 
        {
            System.out.println(nuevoUsuario.getName());
        }
    }
}
    
  
     public void mostrarLibrosNoRentados() {
        System.out.println("\n***Lista de libros que no han sido rentados***");
        for (Libro nuevoLibro : listaLibros) 
        {
            if (!nuevoLibro.isRentado()) 
            {
                System.out.println("\nTítulo: " + nuevoLibro.getTittle() + "\nAutor: " + nuevoLibro.getAutor());
            }
        }
    }

    public void mostrarLibrosRentados()
    {
        System.out.println("\n***Lista de libros que han sido rentados***");
        for (Libro nuevoLibro : listaLibros)
        {
            if (nuevoLibro.isRentado()) 
            {
                System.out.println("\nTítulo: " + nuevoLibro.getTittle() + "\nAutor: " + nuevoLibro.getAutor());
            }
        }
    }

}
