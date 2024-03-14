package sistemalibreria;

import java.util.*;
public class Libro 
{
    Scanner leer = new Scanner(System.in);
    Random aleatorio = new Random();
    
    private int id;
    private String tittle;
    private String autor;
    private boolean rentado;
    
   public Libro( String tittle, String autor, int id, boolean rentado)
   {
       this.id = aleatorio.nextInt(1000)+1;
       this.tittle = tittle;
       this.autor = autor;
       this.rentado = false;
   }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isRentado() {
        return rentado;
    }

    public void setRentado(boolean rentado) {
        this.rentado = rentado;
    }
   
    public void rentar()
    {
        this.rentado = true;
    }
    
    
}
