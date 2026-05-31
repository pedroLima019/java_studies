package EstruturaRepeticao;

import java.util.Scanner;

public class loopWhile {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        while (numero != 0) {
            System.out.println("Digite outro numero: ");
            numero = sc.nextInt();
        }

        System.out.println("vai tomar no caneco ! ");
        sc.close();
    }


}
