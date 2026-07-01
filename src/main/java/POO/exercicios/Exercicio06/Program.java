package POO.exercicios.Exercicio06;

public class Program {
    public static void main(String[] args) {
        Arquivo a = new Arquivo("relatorio.txt", "dados sensíveis");

        // nível 0 tenta ver
        System.out.println(a.visualizarConteudo(0)); // ACESSO_NEGADO

        // aumenta nível
        a.alterarNivelAcesso(1);

        // nível 1 tenta ver
        System.out.println(a.visualizarConteudo(1)); // dados sensíveis

        // tenta modificar
        a.alterarConteudo("alterado", 0); // false
        a.alterarConteudo("alterado", 2); // true

    }
}
