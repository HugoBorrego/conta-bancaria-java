class Conta {
    public static void main(String[] args) throws Exception {

        ContaBanco p1 = new ContaBanco(0, true);

        p1.setNumConta(12121);
        p1.setTipo("CC");
        p1.setDono("João");
        p1.abrirConta("CC");
        p1.depositar(300);

        p1.estadoConta();

        System.out.println("------------------------");

        ContaBanco p2 = new ContaBanco(0, true);

        p2.setNumConta(21212);
        p2.setDono("Pedro");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(300);

        p2.estadoConta();
    }
}
