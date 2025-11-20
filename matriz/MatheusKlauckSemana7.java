
/**
 * Write a description of class matriz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.lang.reflect.Method;

public class matriz
{
    public static void ExibirVetor(int [] m) {
        System.out.print("[");
        for( int i = 0; i < m.length; i++) {
                System.out.print(m[i] + ",");   // i = 0, m[0] = 3
                                                // i = 1, m[1] = 6
        }
        System.out.print("]");
    }
    
    public static void ExibirMatriz(int [][] m) {
        for( int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "|");
            }
            System.out.print("\n");
        }
    }

    public static int [][] PreencherMatriz(int [][]m, Random r) {
        for( int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[0].length; j++) {
                m[i][j] = r.nextInt(99);
            }
        }
        return m;
    }

    public static int SomarElementos(int[][] m) {
        int soma = 0;

        for( int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[0].length; j++) {
                soma += m[i][j];
            }
        }
        return soma;
    }

    public static int[] DiagonalPrincipal(int[][] m ) {
        int[] elementos = new int[m[0].length];
        for( int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[0].length; j++) {
                if(i == j) elementos[j] = m[i][j];
            }
        }

        return elementos;
    }

    public static int[] DiagonalSecundaria(int[][]m) {
        int[] elementos = new int[m[0].length];
        for( int i = m.length; i >=0; i--) {
            for(int j = 0; j < m[0].length; j++) {
                if(i + j == m.length-1) elementos[j] = m[i][j];
            }
        }

        return elementos;
    }

    public static String ExArray(int[] v) {
        String el = "[";
        for(int i =0; i < v.length; i++)
            el += v[i] + ", ";
        return el += "]";
    }

    public static int[] JogarNoVetor(int[][] m) { 
        int v[] = new int [(m.length * m[0].length)];
    
        int vp = 0;
        for(int j = 0; j<m.length; j++) {
            for(int i = 0; i < m[0].length; i++) {
                v[vp] = m[j][i];
                vp++;
            }
        }
         
        return v;
    }
    
    public static void main (String [] args) {
        int linhas = 5;
        int colunas = 5;
        int[][] mat = new int [linhas][colunas];
        mat = PreencherMatriz(mat, new Random());
        ExibirMatriz(mat);

        int soma = SomarElementos(mat);
        System.out.println("Soma: "+soma);
        int[] dp = DiagonalPrincipal(mat);
        System.out.println("Diagonal Principal: "+ ExArray(dp));
        int[] ds = DiagonalSecundaria(mat);
        System.out.println("Diagonal Secundaria: "+ ExArray(ds));
        
        int[] v = JogarNoVetor(mat);
        ExibirVetor(v);
    }
}