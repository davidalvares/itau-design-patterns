package com.itau.agro.prototype.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produtos {
    private Long numero;
    private String nome;
    private LocalDate dataVencimento;
    private BigDecimal valor;
}
