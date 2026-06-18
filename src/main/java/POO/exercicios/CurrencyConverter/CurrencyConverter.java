package POO.exercicios.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do Dollar: ");
        double valor_dollar = sc.nextDouble();

        System.out.println("Qual o valor em dolar a ser convertido: ");
        double quantidade_dollar = sc.nextDouble();

        double result = CalcCurrency.total(valor_dollar, quantidade_dollar);

        System.out.printf("Valor a ser pago em reais = %.2f%n", result);

        sc.close();

    }
}
