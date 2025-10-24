
/**
 * Write a description of class Evento here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Evento
{
    // instance variables - replace the example below with your own
    private String nome;
    private String local;
    private int capacidade;
    private int ingressosVendidos;
    /**
     * Constructor for objects of class Evento
     */
    public Evento(String nome, String local, int capacidade)
    {
        this.nome = nome;
        this.local = local;
        this.capacidade = capacidade;
    }
    
    public int getCapacidade() {return this.capacidade;}
    
    public void incrementarCapacidade() { this.capacidade = this.capacidade + 1; }
    
    public Ingresso venderIngresso(String titular, int valor) {
        if(this.capacidade > this.ingressosVendidos) {
            Ingresso ing = new Ingresso(this.capacidade, valor, titular);
            incrementarCapacidade();
            return ing;
        }
        else {
            return null;
        }
    }
    
    
}