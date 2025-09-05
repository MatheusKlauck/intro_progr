
/**
 3) Faça um programa que leia 6 valores inteiros e, ao final, escreva o maior e o
    menor valor informado.
 */
import java.util.Scanner;

public class e03
{
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        int numero;
        int count = 0;
        do {
            System.out.println("Insira um número: ");
            numero = t.nextInt();
            if(numero > numero) numero = numero;
            count += 1;
        } while (count < 6);
        
        System.out.println("O maior número digitado foi: " + numero);
    }
}