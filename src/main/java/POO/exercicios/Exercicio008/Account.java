package POO.exercicios.Exercicio008;

public class Account {
    private final int numConta;
    private String titular;
    private double saldo;

    public Account(int numConta, String titular) {
        this.numConta = numConta;
        this.titular = titular;
    }

    public Account(int numConta, String titular, double depositoInicial) {
        this.numConta = numConta;
        this.titular = titular;
        depositar(depositoInicial);
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Nome do titular não pode estar vazio");
            return;
        }
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor + 5.00;
    }

    public String toString() {
        return "Conta " + numConta + " Titular: " + titular + " Saldo: " + String.format(" %.2f", saldo);
    }

}
