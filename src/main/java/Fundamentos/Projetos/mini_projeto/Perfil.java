package Fundamentos.Projetos.mini_projeto;

import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome;
        nome = input.next();
        System.out.print("Digite seu sobrenome: ");
        String lastName;
        lastName = input.next();
        System.out.println("Olá " + nome + " " + lastName);
        System.out.println("Tudo bem ? " );

    }
}
