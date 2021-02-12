package com.algaworks.socialbook.services.exceptions;

import java.io.Serial;

public class LivroNaoEncontradoException extends RuntimeException {


    @Serial
    private static final long serialVersionUID = -7389546583819806303L;

    public LivroNaoEncontradoException(String mensagem) {
        super(mensagem);
    }

    public LivroNaoEncontradoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
