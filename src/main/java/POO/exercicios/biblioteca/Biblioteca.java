package POO.exercicios.biblioteca;

public class Biblioteca {
    static void main(String[] args) {
        Livro meuLivro = new Livro("1984", "George", 1999);
        System.out.println(meuLivro.exibirInfo());
        meuLivro.emprestar();
        meuLivro.emprestar();
        meuLivro.devolver();
        meuLivro.emprestar();

    }
}
