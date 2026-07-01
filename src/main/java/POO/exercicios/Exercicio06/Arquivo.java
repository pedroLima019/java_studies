package POO.exercicios.Exercicio06;

public class Arquivo {
    private String nome;
    private String conteudo;
    private int tamanhoByte;
    private int nivelAcesso;

    public Arquivo(String nome, String conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.tamanhoByte = conteudo.length();
        this.nivelAcesso = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getTamanhoByte() {
        return tamanhoByte;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public boolean alterarConteudo(String novoConteudo, int nivelRequisitante) {
        if (nivelRequisitante >= nivelAcesso) {
            this.conteudo = novoConteudo;
            tamanhoByte = novoConteudo.length();
            return true;
        }
        return false;
    }

    public boolean alterarNivelAcesso(int novoNivel) {
        if (novoNivel < 0 || novoNivel > 2) {
            return false;
        }

        if (novoNivel < this.nivelAcesso) {
            return false;
        }

        this.nivelAcesso = novoNivel;
        return true;
    }

    public String visualizarConteudo(int nivelRequisitante) {
        if (nivelRequisitante >= nivelAcesso) {

            return conteudo;
        }
        return "Acesso_Negado";
    }

}
