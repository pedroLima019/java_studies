package POO.exercicios.Exercicio008;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account conta;

        System.out.print("Número da conta: ");
        int numConta = sc.nextInt();

        System.out.print("Titular: ");
        String titular = sc.next();

        System.out.println("Haverá depósito inicial (s/n) ?  ");
        char opcao = sc.next().charAt(0);

        if (opcao == 's') {
            System.out.println("Valor do depósito inicial: ");
            double saldo = sc.nextDouble();
            conta = new Account(numConta, titular, saldo);
        } else {
            conta = new Account(numConta, titular);
        }

        System.out.println("DADOS DA CONTA: ");
        System.out.println(conta);

        System.out.println("Digite um valor para deposito: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);

        System.out.println("Valor atualizado do deposito: ");
        System.out.println(conta);
        sc.close();
    }
}
