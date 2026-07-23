package exercicio3;

public class Media {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;

        double media = (nota1 + nota2 + nota3)/3;

        System.out.println(String.format("Média das notas sem arredondamento = %f", media));
        System.out.println(String.format("Média das notas com arredondamento = %.2f", media));
    }
}
