
/**
 * Uma casa de espetáculos teatrais precisa de um programa que calcula o valor do
ingresso. Faça um programa que leia o custo total do espetáculo (esse valor total é a soma
dos gastos com: elenco, técnicos, local da apresentação, ...) e o número de poltronas
existentes no teatro. O programa deve solicitar ainda ao usuário: percentual de lucro
desejado, percentual mínimo de ocupação esperado (das poltronas do teatro) em cada
espetáculo e quantidade de espetáculos que será realizada. Com base nesses dados, o
programadeve calcular e escreverovalordoingresso.
 */

import java.util.Scanner;
public class exercicio5
{
   
    public static void main (String args[]) 
    {
       Scanner teclado = new Scanner(System.in);
       
       System.out.print("Custo total do espetáculo: ");
       double custo = teclado.nextDouble();
       
       System.out.print("Número de poltronas: ");
       int poltronas = teclado.nextInt();
       
       System.out.print("Percentual de lucro desejado: ");
       double p_lucro = teclado.nextDouble();
       
       System.out.print("Quantidade de espetáculo: ");
       int espetaculos = teclado.nextInt();
       
       double lucro = (custo + (custo * p_lucro)/100) / espetaculos;
       
       
       double valor_ingresso = lucro / poltronas;
       
       System.out.print("O valor do ingresso deve ser de: R$ " + valor_ingresso);
       
       
    }
}