package POO.aulas.ClassesObjetos;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta, int carga) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("Erro ao rabiscar");
        } else {
            System.out.println("Rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true;
        System.out.println("Tampando");
    }

    public void destampar() {
        this.tampada = false;
        System.out.println("Destampando");
    }
}
