
/**
 * Faça um programa que informe se o aluno está aprovado ou está em G2 ou foi
reprovado.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class e02
{
    public static void main (String args[]){
    
        Scanner t = new Scanner(System.in);
        
        double n = t.nextDouble();
        
        if(n >= 7) {System.out.print("Aprovado");}
        else if (n >= 4) {System.out.print("G2");}
        else {System.out.print("Reprovado");}
    }
}