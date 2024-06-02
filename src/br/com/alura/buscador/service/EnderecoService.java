package br.com.alura.buscador.service;

import br.com.alura.buscador.models.ConsultaCep;
import br.com.alura.buscador.models.Endereco;
import br.com.alura.buscador.models.GeradorDeArquivo;

import java.io.IOException;


public class EnderecoService {
    private ConsultaCep consultaCep;

    public EnderecoService() {
        this.consultaCep = new ConsultaCep();
    }

    public Endereco buscarEndereco(String cep) {
        if (!isValidaCep(cep)) {
            throw new IllegalArgumentException("CEP invalido. Deve conter 8 digitos numericos.");
        }
        return consultaCep.buscaEndereco(cep);
    }

    public boolean isValidaCep(String cep) {
        return cep != null && cep.matches("\\d{8}");
    }

    public void salvarEndereco(Endereco endereco) throws IOException {
        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
        geradorDeArquivo.salvaJson(endereco);
    }
}

