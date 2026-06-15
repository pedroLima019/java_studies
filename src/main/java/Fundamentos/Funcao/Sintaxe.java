package Fundamentos.Funcao;

import java.util.Scanner;

public class Sintaxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int higher = max(a, b, c);
        result(higher);
        sc.close();
    }

    public static int max(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > a && b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    public static void result (int value) {
        System.out.println("Higher = " + value);
    }
}
