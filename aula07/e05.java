
/**
Escreva um programa que determina o preço de venda dos produtos de uma loja
conforme o preço de custo desses produtos. O programa deve ler o preço de custo
e calcular o valor de venda conforme o que segue: valor abaixo de R$10,00, lucro
de 70%; de R$10,00 a menos de R$30,00, lucro de 50%; de R$30,00 a menos de
R$50,00 lucro de 40%; de R$50,00 ou mais, lucro de 30%.

*/

import java.util.Scanner;
public class e05
{
    public static void main (String args[]){
        Scanner t = new Scanner(System.in);
        double custo = t.nextDouble();
        
        if (custo < 10) {
            System.out.println("Lucro 70%, venda por R$" + (custo * 1.7));
        } else if(custo < 30) {
            System.out.println("Lucro 50%, venda por R$" + (custo * 1.5));
        } else if (custo < 50) {
            System.out.println("Lucro 40%, venda por R$" + (custo * 1.4));
        } else {
            System.out.println("Lucro 30%, venda por R$" + (custo * 1.3));
        }
    }
}