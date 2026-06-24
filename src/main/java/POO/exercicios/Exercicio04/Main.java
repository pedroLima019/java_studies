package POO.exercicios.Exercicio04;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta01 = new ContaCorrente(0, true);
        conta01.abrirConta("CP");
        conta01.setSaldo(1000);
        System.out.println("Tipo de Conta: " + conta01.getTipoConta());
        conta01.depositar(500);
        System.out.println("Saldo atual: " + conta01.getSaldo());
    }
}
