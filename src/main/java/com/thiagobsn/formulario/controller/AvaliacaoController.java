package com.thiagobsn.formulario.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagobsn.formulario.avaliacao.domain.entity.Avaliacao;
import com.thiagobsn.formulario.avaliacao.dto.AvaliacaoDTO;
import com.thiagobsn.formulario.avaliacao.dto.CadastroAvaliacaoDTO;
import com.thiagobsn.formulario.avaliacao.service.AvaliacaoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/api/avaliacoes")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @Operation(tags = "Avaliação", summary = "Listar avaliações", description = "Lista todas as avaliações cadastradas.")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Lista de avaliações"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos"),
        @ApiResponse(responseCode = "500", description = "Erro interno")
    })
    @GetMapping
    public ResponseEntity<List<Avaliacao>> listarAvaliacoes() {
        return ResponseEntity.ok(avaliacaoService.listarTodos());
    }

    @Operation(tags = "Avaliação", summary = "Cadastrar nova avaliação", description = "Cadastra uma nova avaliação.")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Cadastro realizado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos"),
        @ApiResponse(responseCode = "500", description = "Erro interno")
    })
    @PostMapping
    public ResponseEntity<AvaliacaoDTO> cadastrar(@RequestBody @Valid CadastroAvaliacaoDTO cadastroAvaliacaoDTO) {
        return ResponseEntity.ok(avaliacaoService.cadastrar(cadastroAvaliacaoDTO));
    }
    
}
