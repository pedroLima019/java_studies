package POO.exercicios.Exercicio04;

public class Main {
    public static void main(String[] args) {
        ContaCorrente p1 = new ContaCorrente(500, true);
        ContaCorrente p2 = new ContaCorrente(1000, true);

        p1.abrirConta("CC");
        p1.setNumConta(1234);
        p1.setDono("Pedro");
        p1.depositar(500);
        p1.sacar(500);
        p1.sacar(50);
        p1.pagarMensal();
        p1.sacar(20);
        p1.sacar(10);
        p1.sacar(6);
        p1.sacar(1);
        p1.sacar(1);
        p1.fecharConta();

        p2.abrirConta("CP");
        p2.setNumConta(4321);
        p2.setDono("Lucas");
        p2.depositar(350);

        p1.estadoAtual();
        p2.estadoAtual();


    }
}
