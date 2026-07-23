package exercicio6.entities;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal preco;

    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria(){
        String categoria;
        if(preco.compareTo(new BigDecimal("50.00")) <= 0){
            categoria = "Econômico";
        }else if(preco.compareTo(new BigDecimal("50.00")) == 1 && preco.compareTo(new BigDecimal("200.00")) <= 0){
            categoria = "Intermediário";
        }else{
            categoria = "Premium";
        }
        return categoria;
    }
}
