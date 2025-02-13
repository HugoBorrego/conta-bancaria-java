import java.util.Scanner;

public class Cliente {
    // Atributos do Cliente
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;
    static Scanner scanner = new Scanner(System.in);

    public void solicitarNumero() {
        // Solicita o número da conta
        System.out.println("Por favor, digite o número da Conta!");
        this.numero = scanner.nextInt();
        scanner.nextLine();
    }

    public void solicitarAgencia() {
        // Solicita o número da agência
        System.out.println("Por favor, digite o número da Agência!");
        this.agencia = scanner.nextLine();
    }

    public void solicitarNomeCliente() {
        // Solicita o nome do cliente
        System.out.println("Por favor, digite o Nome do Cliente!");
        this.nomeCliente = scanner.nextLine();
    }

    public void solicitarSaldo() {
        // Solicita o saldo da conta
        System.out.println("Por favor, digite o Saldo da Conta!");
        this.saldo = scanner.nextDouble();
    }
}
