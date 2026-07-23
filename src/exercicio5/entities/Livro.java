package exercicio5.entities;

import java.math.BigDecimal;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private BigDecimal preco;
    private char categoria;

    public Livro(String titulo, String autor, int numeroPaginas, BigDecimal preco, char categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getDescricaoCategoria() {
        String descricaoCategoria;
        if (categoria == 'F') {
            descricaoCategoria = "Ficção";
        } else if (categoria == 'N') {
            descricaoCategoria = "Não-ficção";
        } else if (categoria == 'T') {
            descricaoCategoria = "Tecnologia";
        } else if (categoria == 'H') {
            descricaoCategoria = "História";
        } else {
            descricaoCategoria = "Categoria inválida";
        }
        return descricaoCategoria;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", preco=" + preco +
                ", categoria=" + getDescricaoCategoria() +
                '}';
    }
}
