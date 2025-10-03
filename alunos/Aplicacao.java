
/**
 * Write a description of class Aplicacao here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Aplicacao
{
    private static void print(String msg) {
        System.out.print(msg);
    }
    
    private static void println(String msg) {
        System.out.println(msg);
    }

    public static void main (String args[]) {
        Aluno a1 = new Aluno("Mk", 007);
        Scanner t = new Scanner(System.in);

        print("Insira a nota da P1: ");
        a1.setP1(t.nextDouble());

        print("Insira a nota da P2: ");
        a1.setP2(t.nextDouble());

        print("Insira a média dos trabalhos: ");
        a1.setAvgExer(t.nextDouble());

        print("Insira a frequência do aluno: ");
        a1.setFrequencia(t.nextInt());
        a1.calcularG1();
        if(a1.estaAprovado()) print("Aprovado");
        else {
            if(a1.aptoG2()) {
                println("Aluno esta apto a G2");
                print("Insira a nota da G2: ");
                a1.setG2(t.nextDouble());
                if(a1.aprovadoG2()) {
                    print("Aprovado via G2");
                }
            } else {
                print("Aluno não apto à G2");
            }
        }
    }
}