
/**
 * Write a description of class exercicio4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.lang.Math;

public class exercicio4
{
    public static void main (String args[]) {
        
        int capacidade = 100;
        
        Scanner teclado = new Scanner(System.in);
        
        double caixas = Math.ceil((double)teclado.nextInt() / capacidade);
        
        System.out.println("Caixas necessárias: "+ caixas);
    }
}