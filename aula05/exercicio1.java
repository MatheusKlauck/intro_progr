
/**
1. Implemente um programa que leia o horário de umevento qualquer ocorrido durante o
dia. Considerando que o horário é representado emhora, minuto e segundo, o programa
deve:
    (a) converter esse horário para segundos e escrever tal informação na tela.
    (b) escrever na tela quantos segundos faltam para o dia acabar.
 */
import java.util.Scanner;

public class exercicio1
{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int h = teclado.nextInt() * 60 * 60;
        int m = teclado.nextInt() * 60;
        int s = teclado.nextInt();
        
        int sTotal = h + m + s;
        
        System.out.println("Horário em segundos: " + sTotal);
        
        int dia = 24 * 60 * 60;
        
        System.out.println("Faltam " + (dia - sTotal) + "s para o dia acabar");
    }
}