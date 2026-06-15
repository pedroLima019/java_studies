package POO.exercicios.Exercicio01;

public class RectangleCalc {
    public static void main(String[] args) {
        Rectangle calcRectangle = new Rectangle(5, 10);
        System.out.println("Veja os resultados dos calculados: ");
        System.out.println("Resultado da area: " + calcRectangle.area());
        System.out.println("Resultado do perimetro: " + calcRectangle.perimeter());
        System.out.println("Resultado da diagonal: " + String.format("%.2f", calcRectangle.diagonal()));
    }
}
