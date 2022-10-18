package com.thiagobsn.formulario.avaliacao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagobsn.formulario.avaliacao.domain.entity.Avaliacao;
import com.thiagobsn.formulario.avaliacao.domain.repository.AvaliacaoRepository;
import com.thiagobsn.formulario.avaliacao.dto.AvaliacaoDTO;
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

    public AvaliacaoDTO cadastrar(CadastroAvaliacaoDTO cadastroAvaliacaoDTO) {
        Avaliacao avaliacao = avaliacaoMapper.cadastroAvaliacaoDTOtoAvaliacao(cadastroAvaliacaoDTO);
        return avaliacaoMapper.avaliacaoToAvaliacaoDTO(avaliacaoRepository.save(avaliacao));
    }
    
}
