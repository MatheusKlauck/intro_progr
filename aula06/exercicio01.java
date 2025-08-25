
/**
 * A professora quer calcular estatísticas detalhadas do desempenho de um aluno em 5 avaliações. Para isso, precisa de um programa que faça todos os cálculos.

O programa deve:

LER o NOME do aluno.

LER as notas das 5 avaliacões (valores reais de 0 a 10) - Você escolhe o nome das avaliações (ex.: P1, P2, E, T1 e T2).

LER o número de faltas na disciplina (considerando que o total de presenças é 50).

CALCULAR e mostrar:

Média final ponderada considerando que as provas tem peso 2 e demais avaliações tem peso 1.

Maior nota e menor nota.

Diferença entre a maior e a menor nota.

Percentual final da média (considerando 10 como 100%).

Presença total do aluno em percentual.
 *
 * @author Matheus Klauck e Silva
 * @version 13/08/2025
 */

import java.util.Scanner;
import java.lang.Math;

public class exercicio01
{
    public static void main (String args[]){
        Scanner t = new Scanner(System.in);
        
        System.out.print("Informe o nome do aluno: ");
        String nome = t.nextLine();
        
        
        System.out.println("Informação de notas (0 a 10) para o Aluno " + nome);
        System.out.print("  Nota P1: ");
        double p1 = t.nextDouble();
        System.out.print("  Nota P2: ");
        double p2 = t.nextDouble();
        System.out.print("  Nota E: ");
        double e = t.nextDouble();
        System.out.print("  Nota T1: ");
        double t1 = t.nextDouble();
        System.out.print("  Nota T2: ");
        double t2 = t.nextDouble();
        
        System.out.print("  Faltas no semestre: ");
        double f = t.nextDouble();
        
        double somaProvas = p1 + p2;
        double somaTrabs = e + t1 + t2;
        double medFinal = ((somaProvas * 2) + somaTrabs) / 7;
        System.out.println("    --------------------------- ");
        System.out.println("      Média final: "+medFinal);
        System.out.println("              (%): " + ((medFinal / 10) * 100));
        double maior = Math.max(p1, Math.max(p2, Math.max(e, Math.max(t1, t2))));
        double menor = Math.min(p1, Math.min(p2, Math.min(e, Math.min(t1, t2))));
        
        System.out.println("        Nota max: "+maior);
        System.out.println("        Nota min: "+menor);
        System.out.println("            Diff: "+(maior - menor));
        double presentes = (50 - f) / 50;
        System.out.println("      Presença (%):" + (presentes* 100));
        
    }
}