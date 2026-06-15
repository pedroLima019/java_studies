package POO.exercicios.Exercicio02;

public class Employee {

    private String name;
    private double grossSalary;
    private double taxa;

    public Employee(String name, double grossSalary, double taxa) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.taxa = taxa;
    }

    public double netSalary() {
        return grossSalary - taxa;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * (percentage / 100.0);
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}


