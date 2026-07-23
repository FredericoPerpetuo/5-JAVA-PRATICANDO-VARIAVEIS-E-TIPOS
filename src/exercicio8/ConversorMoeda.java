package exercicio8;

import java.math.BigDecimal;
import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor atual do dollar em reais? ");
        BigDecimal cambio = sc.nextBigDecimal();
        System.out.print("Qual o valor de reais para ser convertido? ");
        BigDecimal reais = sc.nextBigDecimal();

        BigDecimal vlrConvertido = reais.divide(cambio);

        System.out.println(String.format("%.2f reais = %.2f dollares", reais, vlrConvertido));
    }
}
