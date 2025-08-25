
/**
 * Escreva um programa que lê a idade e informa se é menor ou maior de idade.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class e01
{
    public static void main (String args[]){
    
        Scanner t = new Scanner(System.in);
        
        int i = t.nextInt();
        
        if(i>17) System.out.print("Maior de idade");
        else System.out.print("Menor de idade");

    }
}