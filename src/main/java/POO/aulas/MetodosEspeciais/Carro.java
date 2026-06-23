package POO.aulas.MetodosEspeciais;

public class Carro {
    private String modelo;
    private String cor;
    private String proprietario;
    private boolean acelerar;

    public Carro(String modelo, String proprietario, String cor) {
        this.modelo = modelo;
        this.proprietario = proprietario;
        this.cor = cor;

    }

    public String getModelo() {
        System.out.println("Modelo: " + this.modelo);
        return this.modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            System.out.println("Modelo invalido");
        } else {
            this.modelo = modelo;
            System.out.println("Modelo: " + this.modelo);
        }
    }

    public String getProprietario() {
        System.out.println("Proprietario: " + this.proprietario);
        return this.proprietario;
    }

    public void setProprietario(String proprietario) {
        if (proprietario == null || proprietario.trim().isEmpty()) {
            System.out.println("Proprietario invalido");
        } else {
            this.proprietario = proprietario;
            System.out.println("Proprietario: " + this.proprietario);
        }
    }

    public String getCor() {
        System.out.println("Cor: " + this.cor);
        return this.cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.trim().isEmpty()) {
            System.out.println("Cor invalido");
        } else {
            this.cor = cor;
            System.out.println("Cor: " + this.cor);
        }
    }

    public boolean isAcelerar() {
        System.out.println("Acelerar: " + this.acelerar);
        return this.acelerar;
    }

    public void setAcelerar(boolean acelerar) {
        this.acelerar = acelerar;
        if (acelerar) {
            System.out.println("Acelerado");
        } else {
            System.out.println("Parado");
        }
    }

}
