package POO.exercicios.Exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Gross Salary: ");
        double grossSalary = sc.nextDouble();

        System.out.println("TAX: ");
        double tax = sc.nextDouble();

        Employee emp = new Employee(name, grossSalary, tax);

        System.out.println();
        System.out.println("wich percentage to increase salary ? ");
        double percentage = sc.nextDouble();

        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + emp);

        sc.close();
    }
}
