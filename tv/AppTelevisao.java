
/**
 * Write a description of class AppTelevisao here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppTelevisao
{
    public static void main (String args[]) {
        Televisao tv = new Televisao();
        
        tv.ligar();
        tv.mudarCanal(54);
        tv.mostrarEstado();
    }
}