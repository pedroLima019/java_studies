package Fundamentos.EstruturaCondicional;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int numero = sc.nextInt();
    String result =  (numero > 10) ? "é maior " : "Não é maior" ;

        System.out.println(result);

    }
}
