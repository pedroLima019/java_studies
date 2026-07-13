package Arrays.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class vetores01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("digite o tamanho do vetor:");
        int n = input.nextInt();
        double[] vetor = new double[n];

        System.out.println("digite três valores de altura: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = input.nextDouble();

        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }
        double soma2 = soma / n;

        System.out.printf("Average height: %.2f%n", soma2);

        input.close();
    }
}
