/*

 */
package ejerciciolibro;


public class Libro 
{
    String tittle = "El libro de la selva";
    String author = "Rudyard Kipling";
    int year = 1894;
    
    //Método par imprimir información
    String getinfo()
    {
        String data = "Tittle: " + this.tittle + "\nAuthor: " + this.author + "\nYear: " + this.year;
        return data;
    }
}
