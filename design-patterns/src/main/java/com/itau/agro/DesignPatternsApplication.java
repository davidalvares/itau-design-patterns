package com.itau.agro;

import com.itau.agro.prototype.model.Carteira;
import com.itau.agro.prototype.model.Produto;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.itau.agro.prototype.model.Carteira.getPrototipoCarteira;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) throws CloneNotSupportedException {

        Carteira carteira = getPrototipoCarteira();

        System.out.println("=================== carteira clonada ===========================");

        Carteira carteira1 = carteira.clone();
        List<Produto> produtos = new ArrayList<>();


        Produto lci = Produto.builder()
                .nome("LCI")
                .numero(1L)
                .valor(new BigDecimal(10))
                .prazo(90)
                .build();

        Produto lca = Produto.builder()
                .nome("LCA")
                .numero(2L)
                .valor(new BigDecimal(100000))
                .prazo(180)
                .build();

        produtos.add(lci);
        produtos.add(lca);

        carteira1.setNome("Carteira Agro");
        carteira1.setNumero(7L);
        carteira1.setValor(new BigDecimal(700));
        carteira1.setProdutos(produtos);


        System.out.println(carteira1.getNumero());
        System.out.println(carteira1.getNome());
        System.out.println(carteira1.getValor());
        carteira1.getProdutos().forEach(System.out::println);

        System.out.println("=================== Vish carteira clonada mais uma vez ===========================");

        Carteira carteira2 = carteira1.clone();


        Produto lci360 = Produto.builder()
                .nome("LCI")
                .numero(1L)
                .valor(new BigDecimal(170000))
                .prazo(360)
                .build();

        Produto lca720 = Produto.builder()
                .nome("LCA")
                .numero(2L)
                .valor(new BigDecimal(200000))
                .prazo(720)
                .build();

        produtos.add(lci360);
        produtos.add(lca720);

        carteira2.setNome("Carteira Agro Clonada 2 vez vish");
        carteira2.setNumero(11L);
        carteira2.setValor(new BigDecimal(2000000));
        carteira2.setProdutos(produtos);


        System.out.println(carteira2.getNumero());
        System.out.println(carteira2.getNome());
        System.out.println(carteira2.getValor());
        carteira2.getProdutos().forEach(System.out::println);

    }

}

