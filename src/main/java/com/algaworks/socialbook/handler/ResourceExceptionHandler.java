package com.algaworks.socialbook.handler;

import com.algaworks.socialbook.domain.DetalhesErro;
import com.algaworks.socialbook.services.exceptions.LivroNaoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler({LivroNaoEncontradoException.class})
    public ResponseEntity<DetalhesErro> handleLivroNaoEncontradoException
            (LivroNaoEncontradoException e, HttpServletRequest request) {

        DetalhesErro erro = new DetalhesErro();

        erro.setStatus(404l);
        erro.setTitulo("O livro não foi encontrado.");
        erro.setMensagemDesenvolvedor("http://erros.socialbooks.com/404");
        erro.setTimestamp(System.currentTimeMillis());


        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);

    }
}
