package POO.exercicios.Exercicio07;

public class Program {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Papel");
        p1.setPreco(100);
        p1.adicionarEstoque(10);
        p1.removerEstoque(5);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Estoque: " + p1.getEstoque());
        System.out.println("Preço: " + p1.getPreco());
    }
}
