package com.algaworks.socialbook.services.exceptions;

import java.io.Serial;

public class AutorExistenteException extends RuntimeException {


    @Serial
    private static final long serialVersionUID = -7389546583819806303L;

    public AutorExistenteException(String mensagem) {
        super(mensagem);
    }

    public AutorExistenteException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
