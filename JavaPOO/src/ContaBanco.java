public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo; //CC Conta Corrente ou CP Conta Poupança
    private String dono;
    private float saldo;
    private boolean status; //Se está a conta aberta 'true', se não está aberta 'false'

    // Metodos
    public ContaBanco(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }
    
    public void abrirConta(String tipoConta) {
        setTipo(tipoConta);
        setStatus(true);

        if (tipoConta.equals("CC")) {
            setSaldo(50);
        } else if (tipoConta.equals("CP")) {
            setSaldo(150);
        }
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com dinheiro");
        } else {
            System.out.println("Conta está em débito");
        }
    }
    
    public void depositar(float valorDeposito) {
        if (status = true) {
            setSaldo(getSaldo() + valorDeposito);
        } else {
            System.out.println("Impossivel de depositar");
        }
    }
    
    public void sacar(float valorSaque) {
        if (status = true ) {
            if (saldo > valorSaque) {
                setSaldo(getSaldo() - valorSaque);
            } else {
                System.out.println("Impossível sacar");
            }
        }
    }
    
    public void pagarMensal() {
        float valorMensal;

        if (getTipo().equals("CC")) {
            valorMensal = 12;
        } else if (getTipo().equals("CP")) {
            valorMensal = 20;
        } else {
            valorMensal = 0;
        }

        if (status = true) {
            if (saldo > valorMensal) {
                setSaldo(getSaldo() - valorMensal);
                ;
            } else {
                System.out.println("Não é possivel cobrar a mensalidade");
            }
        }
    }
    
    public void estadoConta() {
        System.out.println("Conta do " + this.dono);
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Saldo da conta: R$" + this.saldo);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
