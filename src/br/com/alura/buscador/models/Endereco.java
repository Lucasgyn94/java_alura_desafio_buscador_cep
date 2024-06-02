package br.com.alura.buscador.models;

public record Endereco(String cep, String logradouro, String complemento,
                       String localidade, String uf) {
}
