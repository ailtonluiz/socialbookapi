package com.algaworks.socialbook.repository;

import com.algaworks.socialbook.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository<Livro, Long> {
}
