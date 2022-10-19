package com.thiagobsn.formulario.avaliacao.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class CadastroPerguntaDTO {

    @NotNull
    private Long codigoTipoPergunta;

    @NotNull
    private Long codigoAvaliacao;

    @NotEmpty
    private String enunciado;

    private Integer ordemApresentacao;

    private boolean obrigatoria;

}
