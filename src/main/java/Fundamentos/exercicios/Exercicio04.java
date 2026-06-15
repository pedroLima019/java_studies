package Fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM-VINDO AO BANCO DE HORAS");

        System.out.println("Qual seu ID: ");
        int id = sc.nextInt();

        System.out.print("Digite quantas horas você trabalhou:");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Digite quanto você recebe por Horas trabalhadas:");
        double valorHoras = sc.nextDouble();

        double somaHoras = valorHoras * horasTrabalhadas;
        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = U$ %.2f%n", somaHoras);

        sc.close();

    }
}
