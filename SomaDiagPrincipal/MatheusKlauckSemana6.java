
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class main
{
    public static int DP2(int[][] m) {
        int[] elementos = new int[m[0].length];
        for( int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[0].length; j++) {
                if(i == j) elementos[j] = m[i][j];
            }
        }

        return SomarElementos(elementos);
    }

    public static int DP1(int[][] m) {
        int[] elementos = new int[m[0].length];
        int j = 0;
        for( int i = 0; i < m.length; i++) {
            if(i == j) elementos[j] = m[i][j];
            j++;
        }

        return SomarElementos(elementos);
    }
    
    public static int [][] PreencherMatriz(int [][]m, Random r) {
        for( int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[0].length; j++) {
                m[i][j] = r.nextInt(99);
            }
        }
        return m;
    }
    
     public static int SomarElementos(int[] m) {
        int soma = 0;
        for( int i = 0; i < m.length; i++) {
            for(int j = 0; j < m.length; j++) {
                soma += m[i];
            }
        }
        return soma;
    }

    public static void main (String [] args) {
        int linhas = 5;
        int colunas = 5;
        int[][] mat = new int [linhas][colunas];
        mat = PreencherMatriz(mat, new Random());
        
        int somaDp1 = DP1(mat);
        System.out.println("Soma DP 1: "+ somaDp1);
        int somaDP2 = DP2(mat);
        System.out.println("Soma DP 2: "+ somaDP2);
    }
}