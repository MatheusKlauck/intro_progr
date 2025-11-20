public class Conta {
    private Reserva reserva;
    private double total;

    public Conta(Reserva reserva) {
        this.reserva = reserva;
        this.total = 0.0;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public double getTotal() {
        return total;
    }

    public void calcularTotal() {
        if (reserva.getPedido() != null) {
            total = reserva.getPedido().getValor();
        } else {
            total = 0.0;
        }
    }

    public void emitirConta() {
        System.out.println("===== Conta =====");
        System.out.println("Cliente: " + reserva.getCliente().getNome());
        System.out.println("Mesa: " + reserva.getMesa().getNumero());
        System.out.println("Data/Hora: " + reserva.getData() + " " + reserva.getHora());

        if (reserva.getPedido() != null) {
            System.out.println("Pedido: " + reserva.getPedido().getDescricao());
            System.out.println("Valor: R$ " + reserva.getPedido().getValor());
        } else {
            System.out.println("Nenhum pedido registrado.");
        }

        System.out.println("Total: R$ " + total);
    }
}