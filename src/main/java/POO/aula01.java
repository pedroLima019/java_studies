package POO;

import java.util.Locale;
import java.util.Scanner;

public class aula01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        System.out.println("escreva os lados dos triangulos X :");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("escreva os lados dos triangulos Y :");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double area = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(area * (area - xA) * (area - xB) * (area - xC));

        area = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(area * (area - yA) * (area - yB) * (area - yC));

        System.out.println("Triangulo X area: %.4f%n " + areaX);
        System.out.println("Triangulo Y area: %.4f%n " + areaY);

        if (areaX > areaY) {
            System.out.println("larger area: X");
        } else {
            System.out.println("larger area: Y");
        }
        sc.close();

    }
}
