
/**
 * Escreva a descri��o da classe App aqui.
 * 
 * @author (seu nome) 
 * @version (n�mero de vers�o ou data)
 */
public class App
{
    public static void print(String msg) {
        System.out.println(msg);
    }
    public static void main(String args[]){
    
        Jarro j1 = new Jarro(4);
        Jarro j2 = new Jarro(3);
        j1.encher();
        
        print(""+j1.getLitros());
        
        j1.despejar(j2);
        j2.esvaziar();
        j2.encher();
        j2.despejar(j1);
        
        print("J1: "+j1.getLitros()+"  J2: "+j2.getLitros());
        
    }
}
