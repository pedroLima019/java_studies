// Main.java
package POO.aulas.MetodosEspeciais;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Celta", "Pedro", "Vermelho");
        Carro c2 = new Carro("Ferrari", "Paulo", "Preto");

        System.out.println("=== Carro 1 ===");
        System.out.println("Proprietário: " + c1.getProprietario());
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Cor: " + c1.getCor());
        c1.setAcelerar(true);
        System.out.println("Acelerando: " + c1.isAcelerar());

        System.out.println("----------------------------");

        System.out.println("=== Carro 2 ===");
        System.out.println("Proprietário: " + c2.getProprietario());
        System.out.println("Modelo: " + c2.getModelo());
        System.out.println("Cor: " + c2.getCor());
        c2.setAcelerar(false);
        System.out.println("Acelerando: " + c2.isAcelerar());

        System.out.println("----------------------------");

        System.out.println("=== Testando validações ===");
        c1.setModelo("");        // ❌ vazio → mensagem de erro
        c1.setModelo("Onix");   // ✅ válido → atualiza
    }
}