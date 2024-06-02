# Buscador de CEP

Este projeto é um exemplo de aplicação Java que consulta endereços a partir de um CEP utilizando a API do ViaCEP. A aplicação permite ao usuário inserir múltiplos CEPs, consultando e exibindo os detalhes do endereço correspondente. Os resultados das consultas são salvos em arquivos JSON.

## Funcionalidades

Consulta de CEP: O usuário pode inserir um CEP e obter os detalhes do endereço correspondente.
Loop de Consulta: A aplicação continua pedindo CEPs até que o usuário digite "0" para sair.
Validação de CEP: A aplicação valida se o CEP inserido contém exatamente 8 dígitos numéricos.
Gravação em Arquivo: Os endereços obtidos são salvos em arquivos JSON no formato {cep}.json.

## Arquivos Principais

Main.java: Contém o loop principal que solicita a entrada do usuário e gerencia as consultas e gravações.
ConsultaCep.java: Classe responsável por fazer a requisição HTTP à API do ViaCEP e deserializar a resposta.
Endereco.java: Classe que representa o modelo de endereço retornado pela API.
GeradorDeArquivo.java: Classe responsável por salvar os endereços obtidos em arquivos JSON.
EnderecoService.java: Classe que encapsula a lógica de validação de CEP, consulta e gravação.

## Tecnologias Utilizadas
Java 17
HTTP Client (java.net.http)
Gson (com.google.gson)
