package com.algaworks.socialbook.com.algaworks.socialbook.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Livro {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nome;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date publicacao;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String editora;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String resumo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Comentario> comentarios;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String autor;

    public Livro() {
    }

    public Livro(String nome) {
        this.nome = nome;
    }

}
