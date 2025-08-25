
/**
 * Faça um programa que lê a idade e classifica de acordo com: crianças até 11 anos;
adolescentes de 12 a 17 anos; adultos de 18 a 59 anos; idoso com 60 anos ou mais.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class e03
{
    public static void main (String args[]){
    
        Scanner t = new Scanner(System.in);
        
        int n = t.nextInt();
        
        if(n < 12) {System.out.print("Criança");}
        else if (n < 18) {System.out.print("Adolescente");}
        else if (n < 59) {System.out.print("Adulto");}
        else { System.out.print("Idoso");}
    }
}