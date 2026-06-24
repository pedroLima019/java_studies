// Main.java
package POO.aulas.MetodosEspeciais;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Celta", "Pedro", "Vermelho");
        Carro c2 = new Carro("Ferrari", "Paulo", "Preto");

        System.out.println("--------------------------");
        System.out.println("CARRO 01");
        System.out.println("--------------------------");

        c1.setAcelerar(true);
        c1.getModelo();
        c1.getCor();
        c1.getProprietario();

        System.out.println("--------------------------");
        System.out.println("CARRO 02");
        System.out.println("--------------------------");

        c2.setAcelerar(false);
        c2.getModelo();
        c2.getCor();
        c2.getProprietario();

    }
}