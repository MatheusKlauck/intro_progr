
/**
 1) Leia 4 valores, faça a soma e o produto desses valores lidos. Mostre na tela.
 */
import java.util.Scanner;

public class e01
{
    // instance variables - replace the example below with your own
    public static void main (String args[]) {
        Scanner t = new Scanner(System.in);
        int soma = 0;
        int mult = 1;
        int count = 0;
        
        while(count < 4) {
            System.out.println("Digite um valor: ");
            int val = t.nextInt();
            soma += val;
            mult *= val;
            count ++;
        }
        
        System.out.println("Soma: "+soma);
        System.out.println("Mult: "+mult);
    }
}