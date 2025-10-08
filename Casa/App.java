
/**
 * Write a description of class App here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class App
{
    public static void main (String args []) {
        Casa c = new Casa(100, 300);
        
        Terreno t = new Terreno(200, 400);
        
        double al = t.calcularAreaLivre(c);
        
        System.out.println("Área Livre: " + al);
    }
}