import java.util.Scanner;
import java.time.LocalDateTime;
public class e_int
{
    public static boolean ehBissexto(int ano) {
       if(
       (ano % 4 == 0 && ano % 100 != 0) ||
       ano % 400 == 0
       ) return true;
       return false;
    }
    
    public static void printAniversario(int dataAniver, int dataAtual) {
        if(dataAniver == dataAtual)
        System.out.println("Parabéns pelo seu aniversário");
    }
    
    
    
    public static String Signo(int dia, int mes) {
        String abc = (Integer.toString(mes) + Integer.toString(dia));
        int a = Integer.parseInt(abc);
        
        if (a <= 120) {
            return "Capricórnio";
        } else if (a <= 218) {
            return "Aquário";
        } else if( a <= 320) {
            return "Peixes";
        } else if(a <= 420) {
            return "Áries";
        } else if (a <= 520) {
            return "Touro";
        } else if (a <= 620) {
            return "Gêmeos";
        } else if (a <= 722) {
            return "Câncer";
        } else if (a <= 822) {
            return "Leão";
        } else if (a <= 922) {
            return "Virgem";
        } else if (a <= 1022) {
            return "Libra";
        } else if (a <= 1121) {
            return "Escorpião";
        } else {
            return "Sagitário";
        }
    } 
    
    public static String Signo2(int dia, int mes) {
    switch(mes):
    case 1:
    case 2:
        
    }
    
    public static void main(String args[])
    {
        Scanner t = new Scanner(System.in);
        
        System.out.println(ehBissexto(2024));
        
        System.out.println(Signo(03, 05));
        
        
        
        
        LocalDateTime hoje = LocalDateTime.now();
        LocalDateTime aniver = LocalDateTime.of(1998, 10, 2, 0, 0, 0);
        
        int diff = hoje.compareTo(aniver); // dateTime1 is before dateTime2
            
            System.out.println(diff);
    }
}