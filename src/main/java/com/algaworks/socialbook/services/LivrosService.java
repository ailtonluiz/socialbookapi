package com.algaworks.socialbook.services;

import com.algaworks.socialbook.domain.Comentario;
import com.algaworks.socialbook.domain.Livro;
import com.algaworks.socialbook.repository.ComentariosRepository;
import com.algaworks.socialbook.repository.LivrosRepository;
import com.algaworks.socialbook.services.exceptions.LivroNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LivrosService {

    @Autowired
    private LivrosRepository livrosRepository;
    @Autowired
    private ComentariosRepository comentariosRepository;

    public List<Livro> listar() {
        return livrosRepository.findAll();
    }

    public Livro buscar(Long id) {
        Livro livro = livrosRepository.findById(id).orElse(null);

        if (livro == null) {
            throw new LivroNaoEncontradoException("O Livro pode ser encontrado.");

        }
        return livro;
    }

    public Livro salvar(Livro livro) {
        livro.setId(null);
        return livrosRepository.save(livro);

    }

    public void deletar(Long id) {
        try {
            livrosRepository.deleteById(id);

        } catch (EmptyResultDataAccessException e) {
            throw new LivroNaoEncontradoException("O livro pode ser encontrador");
        }

    }

    public void atualizar(Livro livro) {
        verificarExistencia(livro);
        livrosRepository.save(livro);
    }

    private void verificarExistencia(Livro livro) {
        buscar(livro.getId());

    }

    public Comentario salvarComentario(Long livroId, Comentario comentario) {
        Livro livro = buscar(livroId);

        comentario.setLivro(livro);
        comentario.setData(new Date());
        //comentario.setTexto("Otimo livro");

        return comentariosRepository.save(comentario);
    }

    public List<Comentario> listarComentarios(Long livroId) {
        Livro livro = buscar(livroId);

        return livro.getComentarios();

    }
}
