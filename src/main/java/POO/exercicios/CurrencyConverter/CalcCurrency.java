package POO.exercicios.CurrencyConverter;

public class CalcCurrency {
    public static final double IOF = 0.06;

    public static double converter(double valor_dollar, double quantidade_dollar) {
        return valor_dollar * quantidade_dollar;
    }

    public static double total(double valor_dollar, double quantidade_dollar) {
        double base = converter(valor_dollar, quantidade_dollar);
        return base * (1 + IOF);
    }
}
