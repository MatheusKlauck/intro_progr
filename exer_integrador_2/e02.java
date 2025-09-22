
/**
Exercício 2 - Elaborar um programa para conjugar verbos regulares no presente, passado e futuro

dica: usar o método substring que serve para extrair uma parte de uma string.
Nesse caso, 0 é o índice inicial da substring (ou seja, começa do primeiro caractere) 
e prefixoT é o índice final (exclusivo), ou seja, a substring incluirá os caracteres até o índice prefixoT - 1. 

Exemplo: String prefixo = verbo.substring(0, prefixoT); 
 */
import java.util.Scanner;

public class e02
{
        public static String getSufixo(String v) {
            return v.substring(v.length()-2, v.length());
        }
        
        public static String getPrefixo(String v) {
            return v.substring(0, v.length()-2);
        }
        
        public static boolean ehRegular(String v) {
            String sufixo = getSufixo(v);
            if(
            sufixo.compareToIgnoreCase("AR") == 0 ||
            sufixo.compareToIgnoreCase("ER") == 0 ||
            sufixo.compareToIgnoreCase("IR") == 0
            ) return true;
            return false;
        }
        
        public static void conjugarPassado(String v) {
            String prefixo = getPrefixo(v);
            String sufixo = getSufixo(v);
            
            switch(sufixo.toUpperCase()) {
                case "AR":
                    System.out.println("Eu "+ prefixo + "ei");
                    System.out.println("Tu "+ prefixo + "aste");
                    System.out.println("Ele "+ prefixo + "ou");
                    System.out.println("Nós "+ prefixo + "amos");
                    System.out.println("Vós "+ prefixo + "astes");
                    System.out.println("Eles "+ prefixo + "aram");
                break;
                case "ER":
                    System.out.println("Eu "+ prefixo + "i");
                    System.out.println("Tu "+ prefixo + "este");
                    System.out.println("Ele "+ prefixo + "eu");
                    System.out.println("Nós "+ prefixo + "emos");
                    System.out.println("Vós "+ prefixo + "estes");
                    System.out.println("Eles "+ prefixo + "eram");
                    break;
                case "IR":
                    System.out.println("Eu "+ prefixo + "i");
                    System.out.println("Tu "+ prefixo + "iste");
                    System.out.println("Ele "+ prefixo + "iu");
                    System.out.println("Nós "+ prefixo + "imos");
                    System.out.println("Vós "+ prefixo + "istes");
                    System.out.println("Eles "+ prefixo + "iram");
                    break;
            }            
        }
        
                public static void conjugarPresente(String v) {
            String prefixo = getPrefixo(v);
            String sufixo = getSufixo(v);
            
            switch(sufixo.toUpperCase()) {
                case "AR":
                    System.out.println("Eu "+ prefixo + "o");
                    System.out.println("Tu "+ prefixo + "as");
                    System.out.println("Ele "+ prefixo + "a");
                    System.out.println("Nós "+ prefixo + "amos");
                    System.out.println("Vós "+ prefixo + "ais");
                    System.out.println("Eles "+ prefixo + "am");
                break;
                case "ER":
                    System.out.println("Eu "+ prefixo + "o");
                    System.out.println("Tu "+ prefixo + "es");
                    System.out.println("Ele "+ prefixo + "e");
                    System.out.println("Nós "+ prefixo + "emos");
                    System.out.println("Vós "+ prefixo + "eis");
                    System.out.println("Eles "+ prefixo + "em");
                    break;
                case "IR":
                    System.out.println("Eu "+ prefixo + "o");
                    System.out.println("Tu "+ prefixo + "es");
                    System.out.println("Ele "+ prefixo + "e");
                    System.out.println("Nós "+ prefixo + "imos");
                    System.out.println("Vós "+ prefixo + "is");
                    System.out.println("Eles "+ prefixo + "em");
                    break;
            }            
        }
        
       public static void main (String args[]) {
       Scanner t = new Scanner(System.in);
       String palavra = "";
       while(palavra != "saia!") {
           palavra = t.nextLine();
             
       if(!ehRegular(palavra)) {
           System.out.println("Verbo não é regular (terminado em AR,ER,IR)");
       } else {
           conjugarPassado(palavra);
           conjugarPresente(palavra);
       }
       }
          
    }
}