package exercicio5;

import exercicio5.entities.Livro;

import java.math.BigDecimal;

public class CategorizadorLivros {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis",
                208, new BigDecimal("59.90"), 'F');
        Livro livro2 = new Livro("Era dos extremos", "Eric Hobsbawm",
                632, new BigDecimal("78.90"), 'H');

        System.out.println(livro1);
        System.out.println(livro2);
    }
}
