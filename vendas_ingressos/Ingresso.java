
/**
 * Write a description of class Ingresso here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ingresso
{
    // instance variables - replace the example below with your own
    private int numero;
    private String titular;
    private double valor;

    /**
     * Constructor for objects of class Ingresso
     */
    public Ingresso(int numero, double valor, String titular)
    {
       this.numero = numero;
       this.valor = valor;
       this.titular = titular;
    }

    public int getNumero()
    {
        return numero;
    }
    
    public String getTitular() { return this.titular; }
    
    public void Transferir(String titular) { this.titular = titular; }
}