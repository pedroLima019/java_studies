package POO.exercicios.Exercicio05;

public class Pix implements MethodPayment {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    @Override
    public boolean pagar(double valor) {
        if (valor <= 0) {
            return false;
        }

        System.out.println("Valor pago no PIX: " + valor);
        return true;
    }
}
