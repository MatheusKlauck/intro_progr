
/**
Implemente um programa que leia o saldo médio de uma conta corrente, calcule
e escreve o seu limite conforme: menor que R$ 500,00 não há limite; de R$ 500,00
a R$ 1.000,00 8% do saldo médio; maior ou igual a R$ 1.000,00 15% do saldo
médio.
*/

import java.util.Scanner;
public class e06
{
    public static void main (String args[]){
        Scanner t = new Scanner(System.in);
        double sal = t.nextDouble();
        
        if (sal < 500) {
            System.out.println("Você não tem limite");
        } else if(sal < 1000) {
            System.out.println("Limite adicional R$ " + (sal * 0.08));
        } else {
            System.out.println("Limite adicional R$ " + (sal * 0.15));
        }
    }
}