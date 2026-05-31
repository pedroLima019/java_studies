package Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double planoBasic = 50.0;

        System.out.print("Quantas horas você utilizou o plano: ");
        int minutos = sc.nextInt();

        if (minutos > 100) {
            planoBasic = planoBasic + (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta: R$ %.2f\n", planoBasic);

        sc.close();
    }
}
