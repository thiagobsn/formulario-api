package com.thiagobsn.formulario.avaliacao.domain.entity;

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
@Table(name = "Item")
@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 1000)
    private String descricao;

    private Integer ordemApresentacao;

    private boolean ativa;

    @ManyToOne
    @JoinColumn(name = "codigoPergunta", referencedColumnName = "codigo")
    private Pergunta pergunta;


   


    
}
