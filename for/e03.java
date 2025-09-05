
/**
3. Faça um programa que leia um número e mostre todo os seus
antecessores.
 */
import java.util.Scanner;
import java.lang.Math;

public class e03
{
    public static void main (String args[]) {
        System.out.println("Informe um numero (+) que eu te mostrarei todos os seus antecessores: ");
        Scanner t = new Scanner(System.in);
        
        int val = t.nextInt();
        
        for(int i = val-1; i >= 0; i--) {
            System.out.println(i);
        }
                
    }
}