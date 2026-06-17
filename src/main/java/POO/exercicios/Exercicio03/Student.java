package POO.exercicios.Exercicio03;

public class Student {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Student(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double notaFinal() {
        double media = nota1 + nota2 + nota3;
        return media;
    }

    public boolean aprovado() {
        if (notaFinal() >= 60) {
            return true;
        }
        return false;
    }

    public double pontosFaltante() {
        double faltante = 60 - notaFinal();
        return faltante;
    }

    @Override
    public String toString() {
        return "Aluno:  " + nome + " nota:  " + notaFinal();
    }

}
