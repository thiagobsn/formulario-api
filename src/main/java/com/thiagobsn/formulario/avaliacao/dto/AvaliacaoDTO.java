package com.thiagobsn.formulario.avaliacao.dto;

import java.time.LocalDate;

import com.thiagobsn.formulario.avaliacao.domain.entity.TipoAvaliacao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class AvaliacaoDTO {

    private Long codigo;
    private String nome;
    private String descricao;
    private TipoAvaliacao tipo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    
}
