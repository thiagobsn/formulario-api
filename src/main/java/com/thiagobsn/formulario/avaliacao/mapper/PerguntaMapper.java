package com.thiagobsn.formulario.avaliacao.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.thiagobsn.formulario.avaliacao.domain.entity.Pergunta;
import com.thiagobsn.formulario.avaliacao.dto.CadastroPerguntaDTO;
import com.thiagobsn.formulario.avaliacao.dto.PerguntaDTO;

@Mapper(componentModel = "spring")
public interface PerguntaMapper {

    @Mapping(target="tipoPergunta.codigo",  source="codigoTipoPergunta")
    @Mapping(target="avaliacao.codigo",     source="codigoAvaliacao")
    public Pergunta cadastroPerguntaDTOtoPergunta(CadastroPerguntaDTO cadastroPerguntaDTO);

    public PerguntaDTO perguntaToPerguntaDTO(Pergunta pergunta);

    public List<PerguntaDTO> perguntaToPerguntaDTO(List<Pergunta> pergunta);
    
}
