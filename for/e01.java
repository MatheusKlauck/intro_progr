
/**
 1. Faça um programa que informe o número de alunos de uma turma e
calcule a média do exercício de avaliação 1 dos alunos
 */
import java.util.Scanner;
public class e01
{
    public static void main (String args[]) {
        Scanner t = new Scanner(System.in);
        
        int alunos = 0;
        double soma_nota = 0;
        
        
        System.out.println("Quantos alunos na turma: ");
        alunos = t.nextInt();
        
        for(int i = 1; i <= alunos; i++) {
            System.out.println("Nota do aluno "+ i + ":");
            double nota = t.nextDouble();
            soma_nota += nota;
        }
        
        System.out.println("Média: " + (soma_nota / alunos));
    }
}