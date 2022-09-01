package com.thiagobsn.formulario.avaliacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagobsn.formulario.avaliacao.domain.entity.Avaliacao;
import com.thiagobsn.formulario.avaliacao.domain.repository.AvaliacaoRepository;
import com.thiagobsn.formulario.avaliacao.dto.CadastroAvaliacaoDTO;
import com.thiagobsn.formulario.avaliacao.mapper.AvaliacaoMapper;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    @Autowired
    private AvaliacaoMapper avaliacaoMapper;

    public List<Avaliacao> listarTodos() {
        return avaliacaoRepository.findAll();
    }

    public Avaliacao cadastrar(CadastroAvaliacaoDTO cadastroAvaliacaoDTO) {
        Avaliacao avaliacao = avaliacaoMapper.cadastroAvaliacaoDTOtoAvaliacao(cadastroAvaliacaoDTO);
        return avaliacaoRepository.save(avaliacao);
    }
    
}
