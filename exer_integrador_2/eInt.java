
/**
Faça um programa que leia o nome de 3 pessoas e os exiba em ordem alfabética. Aproveite para explorar os comandos da classe String.

Dica: usando compareTo
if (nome1.compareToIgnoreCase(nome2) <0 && nome1.compareToIgnoreCase(nome3) <0){

           primeiro = nome1;
 */
import java.util.Random;
import java.util.Scanner;
public class eInt
{
    public static void main (String args[]) {
        Scanner t = new Scanner(System.in);
        String p1 = "";
        String p2 = "";
        String p3 = "";
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome [" + (i+1) + "]: ");
            if(i == 0) p1 = t.nextLine();
            if(i == 1) p2 = t.nextLine();
            if(i == 2) p3 = t.nextLine();
        }
        
        String primeiro = "";
        String segundo = "";
        String terceiro = "";
        
        if(p1.compareToIgnoreCase(p2) < 0 && p1.compareToIgnoreCase(p3) < 0) {
          primeiro = p1;
          
          if(p2.compareToIgnoreCase(p3) < 0) {
              segundo = p2;
              terceiro = p3;
          } else {
              segundo = p3;
              terceiro = p2;
          }
          
        } else if (p2.compareToIgnoreCase(p1) < 0 && p2.compareToIgnoreCase(p3) < 0) {
          primeiro = p2;
          
          if(p1.compareToIgnoreCase(p3) < 0) {
              segundo = p1;
              terceiro = p3;
          } else {
              segundo = p3;
              terceiro = p1;
          }
        } else {
          primeiro = p3;
            
          if(p1.compareToIgnoreCase(p2) < 0) {
              segundo = p1;
              terceiro = p2;
          } else {
              segundo = p2;
              terceiro = p1;
          }
        }
        
        System.out.println("Nomes em ordem alfabética: ");
        System.out.println(primeiro);
        System.out.println(segundo);
        System.out.println(terceiro);
    }
}