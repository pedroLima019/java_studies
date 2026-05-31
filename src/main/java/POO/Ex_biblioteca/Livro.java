package POO.Ex_biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicado;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int anoPublicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
        this.disponibilidade = true;
    }

    public void emprestar() {
        if (this.disponibilidade) {
            this.disponibilidade = false;
            System.out.println("Livro emprestado com sucesso ! ");
        } else {
            System.out.println("Indisponível: Livro emprestado ");
        }
    }

    public void devolver() {
        if (!this.disponibilidade) {
            this.disponibilidade = true;
            System.out.println("Livro devolvido !");
        }
    }

    public String exibirInfo() {
        return "Titulo: | " + titulo + " | Autor: " + autor + " | Ano publicação: "
                + anoPublicado;
    }
}





