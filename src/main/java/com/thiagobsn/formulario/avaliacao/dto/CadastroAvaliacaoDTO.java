package com.thiagobsn.formulario.avaliacao.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class CadastroAvaliacaoDTO {

    private String nome;
    private String descricao;
    private Long codigoTipoAvaliacao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private boolean ativo;
    
}
