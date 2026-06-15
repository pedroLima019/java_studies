package Fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segunto número: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;
        System.out.print("Resultado: " + soma);

        sc.close();
    }
}

