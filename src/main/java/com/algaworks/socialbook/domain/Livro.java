package com.algaworks.socialbook.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Livro {

    @JsonInclude(Include.NON_NULL)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Transient
    private List<Comentario> comentarios;

    @JsonInclude(Include.NON_NULL)
    private String autor;

    public Livro() {
    }

    public Livro(String nome) {
        this.nome = nome;
    }

}