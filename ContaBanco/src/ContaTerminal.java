public class ContaTerminal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.solicitarNumero();
        cliente.solicitarAgencia();
        cliente.solicitarNomeCliente();
        cliente.solicitarSaldo();

        System.out.println("Olá " + cliente.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + cliente.agencia + ", conta " + cliente.numero + " e seu saldo R$" + cliente.saldo + " já está disponível para saque.");
    }
}
