package POO.exercicios.Exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite seu nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu nota 1 do aluno: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite sua nota 2  do aluno: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite sua nota 3  do aluno: ");
        double nota3 = sc.nextDouble();

        Student student = new Student(nome, nota1, nota2, nota3);
        if (student.aprovado()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("Pontos restantes: " + student.pontosFaltante());
        }

        sc.close();

    }
}
