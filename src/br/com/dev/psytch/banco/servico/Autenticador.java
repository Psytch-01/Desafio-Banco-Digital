package br.com.dev.psytch.banco.servico;

import br.com.dev.psytch.banco.modelo.Cliente;

import java.util.List;

public class Autenticador {

    // Implementação de um sistema simples de autenticação de clientes, considerando CPF e Senha
    public boolean autenticar(List<Cliente> cleintes, String cpf, String senha) {
        for (Cliente cliente : cleintes) {
            if (cliente.getCpf().equals(cpf) && cliente.getSenha().equals(senha)) {
                return true; // Aqui marca um login bem sucedido.
            }
        }
        // Caso o autenticador não encontre o cliente ou a senha seja inválida
        System.out.println("Falha ao autenticar! CPF ou senha inválidos!");
        return false;
    }
}
