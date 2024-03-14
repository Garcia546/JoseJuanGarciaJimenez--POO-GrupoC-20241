
package sistemalibreria;
import java.util.*;


public class Usuarios 
{
    Scanner leer = new Scanner(System.in);
    Random aleatorio = new Random();
    
    private int id;
    private String name;
    private int age;
    private List<Libro> librosRentados;
    
    public Usuarios( String name, int age, int id)
    {
        this.id = aleatorio.nextInt(1000)+1;
        this.name = name;
        this.age = age;
         this.librosRentados = new ArrayList<>();
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
   public List<Libro> getLibrosRentados() {
        return librosRentados;
    }

    public void rentarLibro(Libro libro) {
        librosRentados.add(libro);
    }
 
}
