package com.itau.agro.prototype.model;

import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Carteira implements Cloneable{
    private Long numero;
    private String nome;
    private BigDecimal valor;
    private List<Produto> produtos;

    @Override
    public Carteira clone() throws CloneNotSupportedException {
        return (Carteira) super.clone();
    }

   public static Carteira getPrototipoCarteira(){

       Carteira carteira = new Carteira();
       List<Produto> produtos = new ArrayList<>();

       Produto cdb = Produto.builder()
               .nome("CDB")
               .numero(3L)
               .valor(new BigDecimal(10))
               .prazo(1)
               .build();

       produtos.add(cdb);

       carteira.setNome("Renda Fixa");
       carteira.setNumero(1234L);
       carteira.setValor(new BigDecimal(1000));
       carteira.setProdutos(produtos);

       System.out.println(carteira.getNumero());
       System.out.println(carteira.getNome());
       System.out.println(carteira.getValor());
       carteira.getProdutos().forEach(System.out::println);

       System.out.println("\n");

       return carteira;
   }

}
