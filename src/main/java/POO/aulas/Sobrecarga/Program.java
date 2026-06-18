package POO.aulas.Sobrecarga;

public class Program {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Volkswagem", "Fox", "Preto");
        Carro carro2 = new Carro("Chevrolet", "onix", "Prata", 10);
        Carro carro3 = new Carro("Ferrari", "Ferrari");

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
    }
}
