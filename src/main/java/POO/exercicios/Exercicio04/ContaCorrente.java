package POO.exercicios.Exercicio04;

public class ContaCorrente {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private double saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("------------------------------");
        System.out.println("Número conta: " + this.numConta);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + this.status);
        System.out.println("Deposito: " + this.saldo);
        System.out.println("------------------------------");
    }

    // Constructor
    public ContaCorrente(double saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }

    //getters and setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Métodos
    public void abrirConta(String tipoConta) {
        setTipoConta(tipoConta);
        setStatus(true);

        if (tipoConta == "CC") {
            System.out.println("Conta Corrente aberta com sucesso");
            saldo = 50;
            System.out.println("SAlDO: " + saldo);
        } else if (tipoConta == "CP") {
            System.out.println("Conta Pessoal aberta com sucesso");
            saldo = 100;
            System.out.println("SAlDO: " + saldo);
        }
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta tem dinheiro");
        } else if (saldo < 0) {
            System.out.println("Conta com débito");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso ");
        }
    }

    public void depositar(double valor) {
        if (this.getStatus()) {
            saldo += valor;
            System.out.println("VAlOR " + valor + " depositado com sucesso");
        } else {
            System.out.println("Erro ao depositar");
        }
    }

    public void sacar(double valor) {
        if (this.getStatus()) {
            if (saldo >= valor) {
                setSaldo(saldo - valor);
                System.out.println("VAlOR " + valor + " sacado com sucesso");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Erro ao sacar");
        }
    }

    public void pagarMensal() {
        float valorMensal = 0;
        if (tipoConta == "CC") {
            valorMensal = 12;
            System.out.println("Valor a pagar: " + valorMensal);
        } else if (tipoConta == "CP") {
            valorMensal = 20;
            System.out.println("Valor a pagar: " + valorMensal);
        }
        if (this.getStatus()) {
            if (saldo > valorMensal) {
                setSaldo(getSaldo() - valorMensal);
                System.out.println("saldo insuficiente");
            }
        }
    }
}
