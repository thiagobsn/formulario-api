package com.thiagobsn.formulario.avaliacao.dto;

import com.thiagobsn.formulario.avaliacao.domain.entity.TipoPergunta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class PerguntaDTO {

    private Long codigo;
    private TipoPergunta tipoPergunta;
    private Integer ordemApresentacao;
    private String enunciado;
    private boolean obrigatoria;
    private AvaliacaoDTO avaliacao;
    
}
