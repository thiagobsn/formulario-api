package com.thiagobsn.formulario.avaliacao.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.thiagobsn.formulario.avaliacao.domain.entity.Avaliacao;
import com.thiagobsn.formulario.avaliacao.dto.AvaliacaoDTO;
import com.thiagobsn.formulario.avaliacao.dto.CadastroAvaliacaoDTO;

@Mapper(componentModel = "spring")
public interface AvaliacaoMapper {

    @Mapping(target="tipo.codigo", source="codigoTipoAvaliacao")
    public Avaliacao cadastroAvaliacaoDTOtoAvaliacao(CadastroAvaliacaoDTO cadastroAvaliacaoDTO);

    public AvaliacaoDTO avaliacaoToAvaliacaoDTO(Avaliacao avaliacao);
    
}
