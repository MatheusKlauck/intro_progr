
/**
 2) Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10
    metro e cresce 3 centímetros por ano. Construa um programa que calcule e exiba
    quantos anos serão necessários para que Zé seja maior que Chico.
 */
public class e02
{
     
    public static void WhileSimples() {
        double chico = 1.5;
        double ze = 1.1;
        double tempo = 0;
        
        while(ze < chico) {
            chico += 0.02;
            ze += 0.03;
            tempo += 1;
        }
        
        System.out.println("W: Zé fica maior que chico em " + tempo + " anos.");
    }
    
        public static void DoWhile() {
        double chico = 1.5;
        double ze = 1.1;
        double tempo = 0;
        
        do {
            chico += 0.02;
            ze += 0.03;
            tempo += 1;
        } while (ze < chico);
        
        System.out.println("DW: Zé fica maior que chico em " + tempo + " anos.");
    }
    
    public static void main (String args[]) {
        WhileSimples();
        DoWhile();
        
    }
}