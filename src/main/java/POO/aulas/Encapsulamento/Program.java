package POO.aulas.Encapsulamento;

public class Program {
    public static void main(String[] args) {
        Filme f1 = new Filme("Seila", 12, 5);
        f1.avaliar(10);
        System.out.println(f1.toString());
    }
}
