--
INSERT INTO TIPOAVALIACAO(NOME) VALUES ('Questionário');

--
INSERT INTO TIPOPERGUNTA(NOME) VALUES ('Aberta(Discursivo)');
INSERT INTO TIPOPERGUNTA(NOME) VALUES ('Escolha única');
INSERT INTO TIPOPERGUNTA(NOME) VALUES ('Multipla escolha');


--
INSERT INTO AVALIACAO(NOME, DESCRICAO, CODIGOTIPOAVALIACAO, DATAINICIO, DATAFIM) VALUES ('Avaliação de teste', 'Avaliação de teste', 1, null, null);