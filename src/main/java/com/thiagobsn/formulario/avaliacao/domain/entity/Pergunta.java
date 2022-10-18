package com.thiagobsn.formulario.avaliacao.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Pergunta")
@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class Pergunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    @ManyToOne
    @JoinColumn(name = "codigoTipoPergunta", referencedColumnName = "codigo", nullable = true)
    private TipoPergunta TipoPergunta;

    private Integer ordemApresentacao;

    @Column(length = 2000)
    private String enunciado;

    private boolean obrigatoria;

    @ManyToOne
    @JoinColumn(name = "codigoAvaliacao", referencedColumnName = "codigo")
    private Avaliacao avaliacao;

}
