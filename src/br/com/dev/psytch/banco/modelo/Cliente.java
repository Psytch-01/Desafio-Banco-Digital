package br.com.dev.psytch.banco.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String senha;
    private List<Conta> contasCliente;

    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.senha = senha;
        this.contasCliente = new ArrayList<>();  // Inicializa a lista de contas
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSenha() {
        return senha;
    }


    public void adicionarConta(Conta conta) {
        this.contasCliente.add(conta);
    }

    public void listaContas() {
        if (contasCliente.isEmpty()) {
            System.out.println("Este cliente não possui contas cadastradas.");
        } else {
            System.out.println("Contas do cliente " + nome + ":");
            for (Conta conta : contasCliente) {
                conta.imprimirExtrato();
            }
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + "\n" + "CPF: " + cpf + "\n" + "Endereco: " + endereco + "\n";
    }
}
