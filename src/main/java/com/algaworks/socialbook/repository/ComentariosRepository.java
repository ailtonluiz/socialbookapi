package com.algaworks.socialbook.repository;

import com.algaworks.socialbook.domain.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {
}
