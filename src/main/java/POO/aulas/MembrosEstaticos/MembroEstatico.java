package POO.aulas.MembrosEstaticos;

import POO.aulas.MembrosEstaticos.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class MembroEstatico {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor do raio: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n%n", c);
        System.out.printf("Volume: %.2f%n%n", v);
        System.out.printf("PI valor: %.2f%n%n", PI);

        sc.close();
    }

}
