package POO.exercicios.Exercicio05;

public class Pedido {
    private double ValorTotal;
    private MethodPayment methodPayment;

    public Pedido(double ValorTotal, MethodPayment methodPayment) {
        this.ValorTotal = ValorTotal;
        this.methodPayment = methodPayment;
    }

    public void FinalizarPedido() {
        boolean pago = methodPayment.pagar(ValorTotal);
        if (pago) {
            System.out.println("Pedido Aprovado");
        } else {
            System.out.println("Pedido Recusado");
        }
    }
}
