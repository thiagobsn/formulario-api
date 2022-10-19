package com.thiagobsn.formulario.avaliacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagobsn.formulario.avaliacao.domain.entity.Pergunta;
import com.thiagobsn.formulario.avaliacao.domain.repository.PerguntaRepository;
import com.thiagobsn.formulario.avaliacao.dto.CadastroPerguntaDTO;
import com.thiagobsn.formulario.avaliacao.dto.PerguntaDTO;
import com.thiagobsn.formulario.avaliacao.mapper.PerguntaMapper;

@Service
public class PerguntaService {
    
    @Autowired
    private PerguntaRepository perguntaRepository;

    @Autowired
    private PerguntaMapper perguntaMapper;


    public List<PerguntaDTO> listarPerguntaPorAvaliacao(Long codigoAvaliacao) {
        List<Pergunta> lista = perguntaRepository.findAllByAvaliacaoCodigo(codigoAvaliacao);
        return perguntaMapper.perguntaToPerguntaDTO(lista);
    }

    public PerguntaDTO cadastrar(CadastroPerguntaDTO cadastroPerguntaDTO) {
        Pergunta pergunta = perguntaMapper.cadastroPerguntaDTOtoPergunta(cadastroPerguntaDTO);
        pergunta = perguntaRepository.save(pergunta);
        return perguntaMapper.perguntaToPerguntaDTO(pergunta);
    }
}
