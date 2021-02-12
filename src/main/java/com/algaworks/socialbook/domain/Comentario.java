package com.algaworks.socialbook.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Comentario {

    private Long id;
    private String texto;
    private String usuario;
    private Date data;

}