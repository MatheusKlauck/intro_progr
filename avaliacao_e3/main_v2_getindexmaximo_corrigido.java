
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class main
{
    public static String ExArray(int[] v) {
        String el = "[";
        for(int i =0; i < v.length; i++)
            el += v[i] + ", ";
        return el += "]";
    }

    public static void EscreverMat(int [][] mat) {
        for (int [] linha: mat) {
            for (int elem : linha) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static int getMaximo(int[] v) {
        int max = v[0];

        for(int i =1; i < v.length; i++) {
            if(v[i] > max) max = v[i];
        }

        return max;
    }

    public static int[] maximoPorColuna(int [][] A) {
        int [] m = new int[A[0].length];

        for(int col = 0; col < A[0].length; col++) {
            int[] elem_coluna = new int[A.length];
            int ec_i = 0;
            // captura todos os elementos em um array
            for(int l = 0; l < A.length; l++) {
                elem_coluna[ec_i] = A[l][col];
                ec_i++;
            }
            m[col] = getMaximo(elem_coluna);
        }

        return m;
    }

    public static int[] produtoMatrizVetor(int [][]A, int []x) 
    {
        int [] y = new int [x.length];

        for( int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[0].length; j++) {
                y[i] += A[i][j] * x[j];
            }
        }

        return y;
    }

    public static int [][] PreencherMatriz(int [][]m, Random r) {
        for( int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[0].length; j++) {
                m[i][j] = r.nextInt(100);
            }
        }
        return m;
    }

    public static int[] somaPorLinha(int [][] A) {
        int[] s = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int soma = 0;
            for (int j = 0; j < A[i].length; j++) {
                soma += A[i][j];
            }
            s[i] = soma;
        }
        return s;
    }

    public static int [][] transposta(int[][] A) {
        int linhas = A.length;
        int colunas = A[0].length;
        int[][] T = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                T[j][i] = A[i][j];
            }
        }
        return T;
    }
    
    public static int getIndexMaximo(int[] v) {
        int max = getMaximo(v);
        
        for(int i = 0; i < v.length; i++) {
            if(v[i] == max) return i;
        }

        return 0;
    }

    public static void main (String [] args) {
        int l = 4;
        int c = 5;
        int [][] A = new int[l][c];

        PreencherMatriz(A, new Random());
        EscreverMat(A);

        System.out.println("________");
        int [] m = maximoPorColuna(A);
        System.out.println("Maximo Por Coluna: " + ExArray(m));
        
        System.out.println("________");
        int []s = somaPorLinha(A);
        System.out.println("Soma por linha: " + ExArray(s));
        
        System.out.println("________");
        int[][] t = transposta(A);
        
        System.out.println("Matriz transposta: ");
        EscreverMat(t);
        System.out.println("________");
        int[]x = new int[] {2,2,2,2,2};

        int[] prod = produtoMatrizVetor(A, x);
        System.out.println("Produto: " + ExArray(prod));
        
        System.out.println("________");
        int index_maximo_m = getIndexMaximo(m);
        System.out.println("Index maximo (max por coluna): [" + index_maximo_m + "] = [" + m[index_maximo_m] + "]");
        
        System.out.println("________");
        int index_maximo_s = getIndexMaximo(s);
        System.out.println("Index maximo (soma por coluna): [" + index_maximo_s + "] = [" + s[index_maximo_s] + "]");
        
    }
}