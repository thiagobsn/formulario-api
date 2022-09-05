package com.thiagobsn.formulario.avaliacao.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class CadastroAvaliacaoDTO {

    @NotEmpty(message = "{avaliacao.cadastro.nome.obrigatorio}")
    private String nome;

    @NotEmpty(message = "{avaliacao.cadastro.descricao.obrigatorio}")
    private String descricao;
    
    @NotNull(message = "{avaliacao.cadastro.codigotipoavaliacao.obrigatorio}")
    private Long codigoTipoAvaliacao;

    private LocalDate dataInicio;
    private LocalDate dataFim;
    
}
