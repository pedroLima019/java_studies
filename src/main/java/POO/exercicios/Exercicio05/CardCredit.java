package POO.exercicios.Exercicio05;

public class CardCredit implements MethodPayment {

    private String NumCard;
    private String CardName;
    private double LimitDisp;

    public CardCredit(String numCard, String cardName, double limitDisp) {
        this.NumCard = numCard;
        this.CardName = cardName;
        this.LimitDisp = limitDisp;
    }

    public String getCardName() {
        return CardName;
    }


    public double getLimitDisp() {
        return LimitDisp;
    }


    public String getNumCard() {
        return NumCard;
    }


    @Override
    public boolean pagar(double valor) {
        if (valor <= 0) {
            return false;
        } else if (getLimitDisp() >= valor) {
            LimitDisp -= valor;
            System.out.println("Informações do cartão: " + getNumCard() + " pagou com valor " + valor);
            System.out.println("Valor disponivel:  " + getLimitDisp());
            return true;
        }

        return false;
    }
}
