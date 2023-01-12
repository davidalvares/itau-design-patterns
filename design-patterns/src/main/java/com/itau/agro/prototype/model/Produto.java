package com.itau.agro.prototype.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    private Long numero;
    private String nome;
    private int prazo;
    private BigDecimal valor;
}
