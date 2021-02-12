package com.algaworks.socialbook.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Livro {

    @JsonInclude(Include.NON_NULL)
    private Long id;

    @JsonInclude(Include.NON_NULL)
    private String nome;

    @JsonInclude(Include.NON_NULL)
    private Date publicacao;

    @JsonInclude(Include.NON_NULL)
    private String editora;

    @JsonInclude(Include.NON_NULL)
    private String resumo;

    @JsonInclude(Include.NON_NULL)
    private List<Comentario> comentarios;

    @JsonInclude(Include.NON_NULL)
    private String autor;

    public Livro() {
    }

    public Livro(String nome) {
        this.nome = nome;
    }

}