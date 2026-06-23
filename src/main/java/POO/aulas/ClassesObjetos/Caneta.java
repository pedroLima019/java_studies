package POO.aulas.ClassesObjetos;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;


    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("Erro ao rabiscar");
        } else {
            System.out.println("Rabiscando");
        }
    }

    protected void tampar() {
        this.tampada = true;
        System.out.println("Tampando");
    }

    protected void destampar() {
        this.tampada = false;
        System.out.println("Destampando");
    }
}
