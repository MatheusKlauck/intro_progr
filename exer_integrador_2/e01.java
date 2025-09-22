
/**
 1) Criar um jogo de adivinhação onde o computador escolhe um número aleatório
entre 1 e 100, e o usuário deve tentar adivinhar. O programa deve informar se o 
 */
import java.util.Random;
import java.util.Scanner;
public class e01
{
    public static void main (String args[]) {
        Scanner t = new Scanner(System.in);
        int val = 0;
        Random rand = new Random();
        int randomVal = rand.nextInt(1, 100);
        
        while(val != randomVal) {
            System.out.println("Digite um numero: ");
            val = t.nextInt();
            if(val < randomVal) System.out.println("Tente um valor maior");
            else System.out.println("Tente um valor menor");
        }
        
        System.out.println("Você adivinhou o número! "+val);
        
    }
}