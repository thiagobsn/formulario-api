package com.thiagobsn.formulario.avaliacao.domain.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Avaliacao")
@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 200, nullable = false)
    private String nome;

    @Column(length = 1000)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "codigoTipoAvaliacao", referencedColumnName = "codigo", nullable = false)
    private TipoAvaliacao tipo;
    
    @Column(name = "dataInicio")
    private LocalDate dataInicio;

    @Column(name = "dataFim")
    private LocalDate dataFim;

    @Column(columnDefinition = "boolean default true")
    private boolean ativo;
    
}
