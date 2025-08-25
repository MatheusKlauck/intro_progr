
/**
 Implemente um programa que leia 3 valores reais (n1, n2 e n3) e um
valor inteiro (opcao). O programa deve escrever os valores n1, n2 e n3
em uma determinada ordem, a qual é definida pelo valor de opcao.
(a) Se opcao for 1, o programa deve escrever os valores em ordem crescente.
(b) Se opcao for 2, o programa deve escrever os valores em ordem decrescente.
(c) Se opcao for 3, o maior deve ser escrito entre os demais
 */
import java.util.Scanner;
import java.lang.Math;
public class e02_2
{
    public static String nome_d0(int valor) {
        switch(valor) {
            case 1: return "um";
            case 2: return "dois";
            case 3: return "três";
            case 4: return "quatro";
            case 5: return "cinco";
            case 6: return "seis";
            case 7: return "sete";
            case 8: return "oito";
            case 9: return "nove";
            case 10: return "dez";
            case 11: return "onze";
            case 12: return "doze";
            case 13: return "treze";
            case 14: return "quatorze";
            case 15: return "quinze";
            case 16: return "dezesseis";
            case 17: return "desessete";
            case 18: return "dezoito";
            case 19: return "dezenove";
            default: return "";
            } 
    }
    
    public static String nome_d1(int val) {
       switch(val) {
        case 2: return "vinte";
        case 3: return "trinta";
        case 4: return "quarenta";
        case 5: return "cinquenta";
        case 6: return "sessenta";
        case 7: return "setenta";
        case 8: return "oitenta";
        case 9: return "noventa";
       default: return "";    
       }
    }
    
    public static String nome_d2(int val) {
       switch(val) {
        case 1: return "cento";
        case 2: return "duzentos";
        case 3: return "trezentos";
        case 4: return "quatrocentos";
        case 5: return "quinhentos";
        case 6: return "seiscentos";
        case 7: return "setecentos";
        case 8: return "oitocentos";
        case 9: return "novecentos";
       default: return "";
       }
    }
    
    public static String nome_d3(int val) {
           if(val == 0) return "";
         else if(val == 1) return "Mil";  
        return nome_d0(val) + " mil";
    }
    
    public static void main (String args[]) {
        Scanner t = new Scanner(System.in);
        int valor = t.nextInt();
        
        int d0 = (int)(valor/1)%100; // últimos 2
        //System.out.println(d0 + " " + nome_d0(d0));
        int d1 = (int)(valor/10)%10; // 3 digito
        //System.out.println(d1 + " " + nome_d1(d1));
        int d2 = (int)(valor/100)%10; // 2 digito
        //System.out.println(d2 + " " + nome_d2(d2));
        int d3 = (int)(valor/1000)%10; // 1 digito
        //System.out.println(d3 + " " + nome_d3(d3));
        
        String nome = "";
        if (d3!=0)
            nome += nome_d3(d3);
        if (d2!=0)
            nome += " " + nome_d2(d2);
        if(d1!=0)
            if (d2!=0) nome += " e " + nome_d1(d1);
            else nome += nome_d1(d1);
        if(d0!=0) {
            if(d0 > 20) nome += nome_d0(valor/1%100) + " e " + nome_d0(valor/1%10);
            else {
                if(d3!=0 || d2 != 0) nome += " e " + nome_d0(d0);
                else {
                    if(d0 > 20) 
                     nome += " e " + nome_d0(d0);
                    else nome += nome_d0(d0);
                }
            }
        }
        System.out.println(nome);
    }
}