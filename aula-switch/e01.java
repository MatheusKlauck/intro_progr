
/**
 * Faça um programa que simule uma calculadora básica.
 */
import java.util.Scanner;
public class e01
{
    public static void main (String args[]) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("\f-- Calculadora Monstra --");
        System.out.println("Siga a ordem: número, operação, número");
        
        double n1 = t.nextDouble();
        
        char op = t.next().charAt(0);
        
        double n2 = t.nextDouble();
        
        switch(op) {
            case '+':
                System.out.println((n1+n2));
            break;
            case '-':
                System.out.println(n1-n2);
            break;
            case '*':
                System.out.println(n1*n2);
            break;
            case '/':
                System.out.println(n1/n2);
            break;
            default:
                System.out.println("Alto lá monstro, operação inválida");
            break;
        }
    }
}