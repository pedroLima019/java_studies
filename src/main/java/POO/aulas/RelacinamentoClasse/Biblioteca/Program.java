package POO.aulas.RelacinamentoClasse.Biblioteca;

public class Program {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.setTitulo("Clean Code");
        l1.setAutor("Robert C. Martin");
        l1.setPaginas(464);

        Livro l2 = new Livro();
        l2.setTitulo("Java Efetivo");
        l2.setAutor("Joshua Bloch");
        l2.setPaginas(416);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);

        biblioteca.listarLivros();

    }
}
