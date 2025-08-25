
/**
2. Na ginástica olímpica, a nota de um atleta é a soma das notas de duas bancas de
árbitros: banca A e banca B. A nota da banca A é a nota de partida do atleta. A nota da
banca B é calculada da seguinte forma:
    (a) 6 juízes atribuem notas ao atleta;
    (b) a nota mais baixa e a mais alta são descartadas;
    (c) é feita a média das notas restantes.
 */
import java.util.Scanner;
import java.lang.Math;
public class exercicio2
{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Nota 1: ");
        int n1 = teclado.nextInt();
        System.out.print("Nota 2: ");
        int n2 = teclado.nextInt();
        int min = Math.min(n1,n2);
        int max = Math.max(n1,n2);
        System.out.print("Nota 3: ");
        int n3 = teclado.nextInt();
        min = Math.min(min, n3);
        max = Math.max(max, n3);
        System.out.print("Nota 4: ");
        int n4 = teclado.nextInt();
        min = Math.min(min, n4);
        max = Math.max(max, n4);
        System.out.print("Nota 5: ");
        int n5 = teclado.nextInt();
        min = Math.min(min, n5);
        max = Math.max(max, n5);
        System.out.print("Nota 6: ");
        int n6 = teclado.nextInt();
        min = Math.min(min, n6);
        max = Math.max(max, n6);
        
        int soma = (n1+n2+n3+n4+n5+n6) - min - max;
        int media = soma / 4;
        
        System.out.println("Media do atleta (banca B): " + media);
    }
}
