package br.com.alura.buscador.principal;

import br.com.alura.buscador.models.Endereco;
import br.com.alura.buscador.service.EnderecoService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        EnderecoService enderecoService = new EnderecoService();

        while (true) {
            System.out.println("Digite um número de CEP para consulta (ou 0 para sair): ");
            String cep = leitura.nextLine();

            if (cep.equals("0")) {
                break;
            }

            try {
                Endereco novoEndereco = enderecoService.buscarEndereco(cep);
                System.out.println(novoEndereco);
                enderecoService.salvarEndereco(novoEndereco);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("CEP inválido.");
            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando a aplicação.");
            }
        }

        System.out.println("O programa finalizou corretamente!");
        leitura.close();
    }
}
