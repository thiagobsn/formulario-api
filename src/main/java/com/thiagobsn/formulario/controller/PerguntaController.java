package com.thiagobsn.formulario.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagobsn.formulario.avaliacao.dto.CadastroPerguntaDTO;
import com.thiagobsn.formulario.avaliacao.dto.PerguntaDTO;
import com.thiagobsn.formulario.avaliacao.service.PerguntaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/perguntas")
@Tag(name = "Pergunta")
public class PerguntaController {

    @Autowired
    private PerguntaService perguntaService;

    @Operation(summary = "Listar perguntas", description = "Lista todas as perguntas de uma avaliações.")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Lista de avaliações"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos"),
        @ApiResponse(responseCode = "500", description = "Erro interno")
    })
    @GetMapping("/{codigoAvaliacao}")
    public ResponseEntity<List<PerguntaDTO>> listarPerguntasPorAvaliacao(@PathVariable Long codigoAvaliacao) {
        return ResponseEntity.ok(perguntaService.listarPerguntaPorAvaliacao(codigoAvaliacao));
    }

    @Operation(summary = "Cadastrar nova pergunta", description = "Cadastra uma nova pergunta para uma avaliação.")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Cadastro realizado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos"),
        @ApiResponse(responseCode = "500", description = "Erro interno")
    })
    @PostMapping
    public ResponseEntity<PerguntaDTO> cadastrar(@RequestBody @Valid CadastroPerguntaDTO cadastroPerguntaDTO) {
        return ResponseEntity.ok(perguntaService.cadastrar(cadastroPerguntaDTO));
    }
    
}
