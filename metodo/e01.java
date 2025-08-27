 

/*
Crie um programa em java que:
    Leia um número inteiro informado pelo usuário
    Use métodos para:
        - Verificar se o número é par ou ímpar.
        - Calcular o dobro do número.
    Exiba os resultados no final.
*/
import java.util.Scanner;

public class e01 {
    public static boolean EhPar(int num) {
        return num % 2 == 0;
    }

    public static int Dobrar(int num) {
        return num * 2;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira um número e veja a magikka acontecer: ");
        int num = in.nextInt();

        if (EhPar(num)) {
            System.out.println("É par!");
        } else {
            System.out.println("É ímpar!");
        }

        System.out.println("Dobro do seu número é " + Dobrar(num) + " UAUU ;D");
    }
}
