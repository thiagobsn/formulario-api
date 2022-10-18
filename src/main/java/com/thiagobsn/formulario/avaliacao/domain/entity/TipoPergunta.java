package com.thiagobsn.formulario.avaliacao.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TipoPergunta")
@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class TipoPergunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 100, nullable = false)
    private String descricao;

    @Column(columnDefinition = "boolean default true")
    private Boolean ativo;
    
}
