package com.algaworks.socialbook.services;

import com.algaworks.socialbook.domain.Autor;
import com.algaworks.socialbook.repository.AutoresRepository;
import com.algaworks.socialbook.services.exceptions.AutorExistenteException;
import com.algaworks.socialbook.services.exceptions.AutorNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoresService {
    @Autowired
    private AutoresRepository autoresRepository;


    public List<Autor> listar() {
        return autoresRepository.findAll();
    }

    public Autor salvar(Autor autor) {
        if (autor.getId() != null) {
            Autor a = autoresRepository.findById(autor.getId()).orElse(null);

            if (a != null) {
                    throw  new AutorExistenteException("O autor já existe.");
            }
        }

        return autoresRepository.save(autor);
    }
    public Autor buscar(Long id) {
        Autor autor = autoresRepository.findById(id).orElse(null);

        if(autor == null) {
            throw new AutorNaoEncontradoException("O autor não pôde ser encontrado.");
        }
        return autor;
    }
}
