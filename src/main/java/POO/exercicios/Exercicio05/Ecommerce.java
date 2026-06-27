package POO.exercicios.Exercicio05;

public class Ecommerce {
    public static void main(String[] args) {
        CardCredit cardCredit = new CardCredit("1234", "Pedro", 2000);
        Pix pix = new Pix("12345");
        Pedido pedido = new Pedido(350, cardCredit);
        Pedido pedido2 = new Pedido(350, pix);

        pedido.FinalizarPedido();
        pedido2.FinalizarPedido();

    }
}
