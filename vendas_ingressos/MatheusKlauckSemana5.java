
/**
 * Write a description of class Ingresso here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ingresso {
    // instance variables - replace the example below with your own
    private int numero;
    private String titular;
    private double valor;

    /**
     * Constructor for objects of class Ingresso
     */
    public Ingresso(int numero, double valor, String titular) {
        this.numero = numero;
        this.valor = valor;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public void Transferir(String titular) {
        this.titular = titular;
    }
}

/**
 * Write a description of class App here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/**
 * Write a description of class Evento here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Evento {
    // instance variables - replace the example below with your own
    private String nome;
    private String local;
    private int capacidade;
    private int ingressosVendidos;

    /**
     * Constructor for objects of class Evento
     */
    public Evento(String nome, String local, int capacidade) {
        this.nome = nome;
        this.local = local;
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void incrementarCapacidade() {
        this.capacidade = this.capacidade + 1;
    }

    public Ingresso venderIngresso(String titular, int valor) {
        if (this.capacidade > this.ingressosVendidos) {
            Ingresso ing = new Ingresso(this.capacidade, valor, titular);
            incrementarCapacidade();
            return ing;
        } else {
            return null;
        }
    }

}

public class App {

    public static void main(String[] args) {
        Evento e = new Evento("Show do motomoto", "", 2);

        Ingresso mk = e.venderIngresso("Matheusinho", 500);
        Ingresso bm = e.venderIngresso("Barbarinha", 760);

        System.out.println(mk.getTitular() + " vai");
        System.out.println(bm.getTitular() + " vai");
    }
}