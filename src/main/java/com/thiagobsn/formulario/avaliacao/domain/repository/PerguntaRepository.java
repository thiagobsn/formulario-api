package com.thiagobsn.formulario.avaliacao.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiagobsn.formulario.avaliacao.domain.entity.Pergunta;

@Repository
public interface PerguntaRepository extends JpaRepository<Pergunta, Long> {

    public List<Pergunta> findAllByAvaliacaoCodigo(Long codigoAvaliacao);
    
}
