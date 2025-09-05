
/**
2. Faça um programa que calcule os 100 primeiros quadrados perfeitos
(números naturais): 0, 1, 4, 9 ,16.
 */
import java.util.Scanner;
import java.lang.Math;

public class e02
{
    public static void main (String args[]) {
        System.out.println("10000 primeiros quadrados inteiros: ");
        
        String quadrados = "";
        for(int i = 0; i <=10000; i++) {
            if (Math.sqrt(i) % 1 == 0)
                quadrados += " " + i;
        }
        
        System.out.println(quadrados);
        
    }
}