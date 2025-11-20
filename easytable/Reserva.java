public class Reserva {
    private int id;
    private Cliente cliente;
    private Mesa mesa;
    private String data;
    private String hora;
    private Pedido pedido;

    public Reserva(int id, Cliente cliente, Mesa mesa, String data, String hora) {
        this.id = id;
        this.cliente = cliente;
        this.mesa = mesa;
        this.data = data;
        this.hora = hora;
        this.pedido = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean verificarConflito(Reserva outra) {
        return this.mesa.getNumero() == outra.mesa.getNumero() &&
               this.data.equals(outra.data) &&
               this.hora.equals(outra.hora);
    }
}