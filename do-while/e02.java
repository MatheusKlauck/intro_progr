
/**
    2. Elabore um programa que escreve 50 valores acima de 100 que são divisíveis 
    por 7.  
 */
public class e02
{    
    public static void main (String args[]) {
        int count = 0;
        int i = 100;
        do{
            i ++;
            if(i % 7 == 0) {
                System.out.println(count + "("+i+")");
                count ++;
            }                      
        }while(count<=50);        
    }
}