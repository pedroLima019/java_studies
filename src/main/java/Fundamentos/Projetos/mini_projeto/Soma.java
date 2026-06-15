package Fundamentos.Projetos.mini_projeto;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = input.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = input.nextInt();
        int soma = num + num2;
        System.out.println("Soma: " + soma);
    }
}
