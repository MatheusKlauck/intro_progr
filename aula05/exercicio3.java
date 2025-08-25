
/**
3. Faça um programa que leia a capacidade (em litros) do tanque de um carro, o seu
consumo médio (km/litro) e a distância (em km) que esse carro precisa percorrer. O
programa deve calcular e escrever tantas vezes será necessário parar para abastecer para
que o carro consiga percorrer a distância informada.
 */
import java.util.Scanner;

public class exercicio3
{
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        double litros = teclado.nextDouble();
        double media = teclado.nextDouble();
        double distancia = teclado.nextDouble();
        
        double consumo = distancia/litros;
        
        double abastecimentos = consumo / media;
        
        System.out.println(abastecimentos);
    }
}