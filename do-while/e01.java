
/**
 1. Implemente um programa que soma todos os ímpares entre 500 e 700
 */
public class e01
{
    public static void While() {
        int soma = 0;    
        int numero = 501;
        while(numero <= 699) {
        
            soma += numero;
            numero += 2;
        }       
        System.out.println("Soma W   : "+soma);
    }
    
    public static void For() {
        int soma = 0;    
        int numero = 501;
        
        for(numero = 501; numero<=699; numero += 2) {
            soma += numero;
        }
        
        System.out.println("Soma for : "+soma);
    }
    
    public static void DoWhile() {
        int soma = 0;    
        int numero = 501;
        do {
            soma += numero;
            numero += 2;
        } while(numero <= 699);
        
        System.out.println("Soma DW : "+soma);
    }
    
    public static void main (String args[]) {
        While();
        For();
        DoWhile();
    }
}