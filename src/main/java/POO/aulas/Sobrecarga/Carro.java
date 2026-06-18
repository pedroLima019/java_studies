package POO.aulas.Sobrecarga;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int numLugares;

    public Carro(String marca, String modelo, String cor, int numLugares) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.numLugares = 0;
    }

    public Carro(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String toString() {
        return "CARRO: " + marca + " ," + modelo + ", " + cor + " ," + numLugares;
    }
}
