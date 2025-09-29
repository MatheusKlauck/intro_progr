
/**
 * Turma 30
 *
 * @author Guilherme de Jesus, Matheus Klauck
 * @version 24/09
 */
import java.util.Scanner;
public class GuillhermeMatheus
{
    public static String replace(String frase, String from, String to) {
        return frase.replace(from, to);
    }
    
    public static String lerTeclado() {
        Scanner t = new Scanner(System.in);
        return t.nextLine();
    }
    
    public static int lerTecladoInt() {
        Scanner t = new Scanner(System.in);
        return t.nextInt();
    }
        
    public static void main(String args[]) {
        
        System.out.println("Insira a frase: ");
        String frase = lerTeclado();
        
        System.out.println("Quantas substituições deseja fazer: ");
        int subst = lerTecladoInt();
        int substRealizadas = 0;
        for(int i = 0; i < subst; i++) {
            System.out.print("Caracter a ser substituído ("+(i+1) + "): ");
            String c1 = lerTeclado();
            System.out.print("Substituir por ("+(i+1) + "): ");
            String c2 = lerTeclado();
            if(c1.length() > 1 || c2.length() > 1) {
                System.out.println("Precisa ser apenas 1 caractere");
            } else {
                substRealizadas ++;
                frase = replace(frase, c1, c2);
            }
        }
        
        if(substRealizadas > 0) System.out.println("Nova frase: "+frase);
        else {
            System.out.println("Nenhuma alteração foi realizada");
            System.out.println("Sua frase é: "+frase);
        }
    }
}