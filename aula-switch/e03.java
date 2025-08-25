
/**
 Implemente um programa que leia 3 valores reais (n1, n2 e n3) e um
valor inteiro (opcao). O programa deve escrever os valores n1, n2 e n3
em uma determinada ordem, a qual é definida pelo valor de opcao.
(a) Se opcao for 1, o programa deve escrever os valores em ordem crescente.
(b) Se opcao for 2, o programa deve escrever os valores em ordem decrescente.
(c) Se opcao for 3, o maior deve ser escrito entre os demais
 */
import java.util.Scanner;
import java.lang.Math;
public class e03
{
    public static void main (String args[]) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("\fInsira três números, e eu os ordenarei conforme as opções:");
        System.out.println("1 - ordem crescente");
        System.out.println("2 - ordem decrescente");
        System.out.println("3 - intermediário primeiro");
        
        System.out.print("Insira n1: ");
        int n1 = t.nextInt();
        System.out.print("Insira n2: ");
        int n2 = t.nextInt();
        System.out.print("Insira n3: ");
        int n3 = t.nextInt();
        
        System.out.print("Insira a ordem: ");
        int o = t.nextInt();
        int max = Math.max(n1, Math.max(n2, n3));
        int min = Math.min(n1, Math.min(n2, n3));
        int med = 0;
        
        if(max != n1 && min != n1) med = n1;
        else if(max != n2 && min != n2) med = n2;
        else med = n3;
        
        
        switch(o) {
            case 1: System.out.println(min+", "+ med + ", " + max);
            break;
            case 2: System.out.println(max+", "+ med + ", "+min);
            break;
            case 3: System.out.println(med+", "+ min + ", "+max);
                
            break;
            default:
                System.out.println("Ordem inexistente");
                break;
        }
    }
}