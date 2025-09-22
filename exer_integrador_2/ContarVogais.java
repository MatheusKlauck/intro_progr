
/**
 * Write a description of class ContarVogais here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContarVogais
{
   public static void main (String args[]) {
       String texto = "Java e legal";
       
       int countVogais = 0;
       
       for (int i = 0; i < countVogais; i++) {
           char c = texto.charAt(i);
           
           if("AEIOUaeiou".indexOf(c) != -1) countVogais++;
       }
    }
}