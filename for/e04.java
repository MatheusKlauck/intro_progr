
/**
4. Faça um programa que leia uma quantidade não determinada de
números positivos. Calcule a quantidade de números pares e
ímpares, a média de valores pares e a média geral dos números lidos.
O número que encerrará a leitura será zero.
 */
import java.util.Scanner;
import java.lang.Math;

public class e04
{
    public static void main (String args[]) {
        System.out.println("insira nros e serao exibidas informacoes: ");
        System.out.println("Insira 0 para sair ");
        Scanner t = new Scanner(System.in);
        
        int par = 0;
        int soma_par = 0;
        int imp = 0;
        int soma_imp = 0;
        int val = t.nextInt();
        
               
        do {
            System.out.print("Informe um numero: ");
            
            val = t.nextInt();
            if (val % 2 == 0) {
                par ++;
                soma_par += val;
            } else {
                imp ++;
                soma_imp += val;
            }
        } while(val != 0);
        
        System.out.println("Pares informados: "+par);
        System.out.println("Pares média     : "+(soma_par/par));
        System.out.println("Impar informados: "+imp);
        System.out.println("Impares média   : "+(soma_imp/imp));
    }
}