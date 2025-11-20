import java.util.Scanner;

public class EasyTable
{
    private static Cliente[] clientes = new Cliente[50];
    private static int countClientes = 0;

    private static Mesa[] mesas = new Mesa[30];
    private static int countMesas = 0;
    
    private static Reserva[] reservas = new Reserva[30];
    private static int countReservas = 0;
    
    private static Scanner t = new Scanner(System.in);
    private static void exibirMenu() {
        System.out.println("\n=== EASY TABLE SYSTEM ===");
        System.out.println("1.  Cadastrar Cliente");
        System.out.println("2.  Cadastrar Mesa");
        System.out.println("3.  Registrar Reserva");
        System.out.println("4.  Adicionar Pedido à Reserva");
        System.out.println("5.  Calcular e Fechar Conta");
        System.out.println("6.  Listar Reservas");
        System.out.println("7.  Relatório de Mesas");
        System.out.println("11. Exibir clientes");
        System.out.println("0. Sair");
        System.out.print("Escolha: ");
    }
    
    private static void cadastrarCliente() {
        if(countClientes >= clientes.length) {
            System.out.println("Lista de clientes cheia!");
            return;
        }
        
        System.out.println("=====================");
        System.out.println("=== Criar cliente ===");
        System.out.println("=====================");
        
        t.nextLine();
        System.out.print("\n\tNome:");
        String nome = t.nextLine();
        System.out.print("\n\tTelefone:");
        String telefone = t.nextLine();
        
        Cliente c = new Cliente(countClientes, nome, telefone);
        clientes[countClientes] = c;
        countClientes++;
    }
    
    private static void cadastrarMesa() {
        if(countClientes >= clientes.length) {
            System.out.println("Lista de mesas cheia!");
            return;
        }
        
        System.out.println("======================");
        System.out.println("=== Cadastrar mesa ===");
        System.out.println("======================");
        
        
        System.out.print("\n\tNumero:");
        int numero = t.nextInt();
        System.out.print("\n\tCapacidade:");
        int cap = t.nextInt();
        
        Mesa m = new Mesa(countMesas, numero, cap);
        mesas[countMesas] = m;
        countMesas++;
    }
    
    private static void cadastrarReserva() {
        
        System.out.println("=========================");
        System.out.println("=== Cadastrar reserva ===");
        System.out.println("=========================");
        
        t.nextLine();
        System.out.print("\n\t Nome cliente: ");
        String n_c = t.nextLine();
        Cliente c = null;
        for(Cliente cliente:clientes)
            if(cliente != null && cliente.getNome().compareToIgnoreCase(n_c)==0) {
                c = cliente;
                continue;
            }
        System.out.print("\n\t Numero mesa: ");
        int n_m = t.nextInt();
        
        Mesa m = null;
        for(Mesa mesa:mesas)
            if(mesa != null && mesa.getNumero() == n_m) {
                m = mesa;
                continue;
            }
        
        System.out.print("\n\t Data: ");
        String d = t.nextLine();
        
        System.out.print("\n\t hora: ");
        String h = t.nextLine();
        Reserva r = new Reserva(countReservas, c, m, d, h);
        boolean conflitante = ReservaConflitante(r);
        if(conflitante){
            System.out.println("Conflito nessa reserva! Tente outro horario ou mesa");
            return;
        }
        countReservas++;
    }
    
    private static boolean ReservaConflitante(Reserva r) {
        for(Reserva reserva:reservas) {
            if(reserva != null && reserva.verificarConflito(r)) return true;
        }
        
        return false;
    }
    
    private static void exibirClientes() {
        for (Cliente cliente:clientes) {
            if(cliente!=null)
                System.out.println(cliente.exibirResumo());
        }
    }
    
    public static void main (String[] args) {
        int opcao = 0;
        
        do {     
            exibirMenu();
            opcao = t.nextInt();
            switch(opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarMesa();
                    break;
                case 3:
                    cadastrarReserva();
                    break;
                case 11:
                    exibirClientes();
                    break;
            }
        } while(opcao != 0);
    }
}