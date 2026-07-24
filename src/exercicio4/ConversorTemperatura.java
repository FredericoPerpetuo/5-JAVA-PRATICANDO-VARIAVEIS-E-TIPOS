package exercicio4;

public class ConversorTemperatura {
    public static void main(String[] args) {
        int celsius = 20;
        double fahrenheit = ((celsius * 9)/5) + 32;

        System.out.println(String.format("%d Celisus = %.2f Fahrenheit", celsius, fahrenheit));
    }
}
