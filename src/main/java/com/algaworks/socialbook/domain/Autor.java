package com.algaworks.socialbook.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.hibernate.validator.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonInclude(Include.NON_NULL)
    @NotEmpty(message = ",KSDFKJLHDFKLJHSF")
    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date nascimento;

    @JsonInclude(Include.NON_NULL)
    private String nacionalidade;

    @OneToMany(mappedBy = "autor")
    @JsonIgnore
    private List<Livro> livros;


}
