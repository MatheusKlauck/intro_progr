
/**
5. Implemente um programa que leia um valor inteiro, não negativo e
escreva o seu fatorial e seu somatório.
 */
import java.util.Scanner;
import java.lang.Math;

public class e05
{
    public static void main (String args[]) {
        System.out.println("Informe um numero para saber o fatorial: ");
        
        String fatS = "";
        int fatorial = 1;
        int soma = 0;
        String somaS = "";
        Scanner t = new Scanner(System.in);
        int num = t.nextInt();
        for(int i = num; i > 0; i--) {
            fatorial *=i;
            soma += i;
            fatS += i + " * ";
            somaS += i + " + ";
        }
        
        System.out.println(fatS + " = " + fatorial);
        System.out.println(somaS + " = " + soma);
    }
}