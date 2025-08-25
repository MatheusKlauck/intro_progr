
/**
Faça um programa que lê a altura de uma pessoa em metros e o seu sexo (use 1
para feminino e 2 para masculino). A seguir, o programa deve escrever o peso ideal
dessa pessoa conforme descrito: Para homens, use 72.7 x altura -58. Para
mulheres, use 62.1 x altura -44.7

*/

import java.util.Scanner;
public class e04
{
    public static void main (String args[]){
        Scanner t = new Scanner(System.in);
        double h = t.nextDouble();
        int sexo = t.nextInt();
        
        double imc = 0.0;
        if (sexo == 1)
            imc = 72.7 * h - 58;
        else
            imc = 62.1 * h - 44.7;
        
        System.out.print("Seu peso ideal é: (kg) " + imc);
    }
}