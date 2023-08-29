package com.catalisa.vendas.model;

import lombok.*;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = {"nome", "email", "telefone", "senha"})
public class Usuario implements Serializable {
    private static final Long serialId = 1L;
private Long id;
private String nome;
private String email;
private String telefone;
private String senha;
}
