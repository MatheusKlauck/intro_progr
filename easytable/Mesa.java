public class Mesa {
    private int id;
    private int numero;
    private int capacidade;
    private boolean reservada;

    public Mesa(int id, int numero, int capacidade) {
        this.id = id;
        this.numero = numero;
        this.capacidade = capacidade;
        this.reservada = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }

    public boolean verificarDisponibilidade() {
        return !reservada;
    }
}