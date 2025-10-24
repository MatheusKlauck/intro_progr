
/**
 * Write a description of class App here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class App
{
    
    public static void main (String [] args)
    {
        Evento e = new Evento("Show do motomoto", "", 2);
        
        Ingresso mk = e.venderIngresso("Matheusinho", 500);
        Ingresso bm = e.venderIngresso("Barbarinha", 760);
        
        System.out.println(mk.getTitular() + " vai");
        System.out.println(bm.getTitular() + " vai");
    }
}