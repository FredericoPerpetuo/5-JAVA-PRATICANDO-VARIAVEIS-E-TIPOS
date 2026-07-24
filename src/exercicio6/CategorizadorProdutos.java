package exercicio6;

import exercicio6.entities.Produto;

import java.math.BigDecimal;

public class CategorizadorProdutos {
    public static void main(String[] args) {
        Produto prod1 = new Produto("Mouse", new BigDecimal("50.00"));//Econômico
        Produto prod2 = new Produto("Mouse Pad", new BigDecimal("49.99"));//Econômico
        Produto prod3 = new Produto("Fan RGB", new BigDecimal("50.01"));//Intermediário
        Produto prod4 = new Produto("Teclado", new BigDecimal("199.99"));//Intermediário
        Produto prod5 = new Produto("Teclado RGB", new BigDecimal("200.00"));//Intermediário
        Produto prod6 = new Produto("Gabinete RGB", new BigDecimal("200.01"));//Premium

        System.out.println(prod1.getNome() + " - Categoria: " + prod1.getCategoria());
        System.out.println(prod2.getNome() + " - Categoria: " + prod2.getCategoria());
        System.out.println(prod3.getNome() + " - Categoria: " + prod3.getCategoria());
        System.out.println(prod4.getNome() + " - Categoria: " + prod4.getCategoria());
        System.out.println(prod5.getNome() + " - Categoria: " + prod5.getCategoria());
        System.out.println(prod6.getNome() + " - Categoria: " + prod6.getCategoria());
    }
}
