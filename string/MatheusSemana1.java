
/**
 *5.  Faça um programa em java que lê uma palavra e imprime a mesma na ordem
inversa.
 */
import java.util.Scanner;
public class e05
{
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String p = t.nextLine();
        String pi = "";
        for (int i = p.length(); i > 0; i --) {
            pi += p.charAt(i-1);
        }
        
        System.out.println("Inversa: " + pi);
    }
}