package POO.aulas.Encapsulamento;

public class Filme {
    private String titulo;
    private double duracao;
    private int idadeMinima;
    private double avaliacao = 0;

    public Filme(String titulo, double duracao, int idadeMinima) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.idadeMinima = idadeMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        if (idadeMinima >= 0 && idadeMinima <= 18) {
            this.idadeMinima = idadeMinima;
        } else {
            System.out.println("Idade inválida");
        }
    }

    public void avaliar(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.avaliacao = nota;
        } else {
            System.out.println("Avaliação inválida");
        }
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
                "\nDuração: " + duracao + " min" +
                "\nClassificação: " + idadeMinima + " anos" +
                "\nAvaliação: " + avaliacao;
    }
}
