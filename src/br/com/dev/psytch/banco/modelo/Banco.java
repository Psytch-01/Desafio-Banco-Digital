package br.com.dev.psytch.banco.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static final String NOME = "Seidenfaden Bank";
    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco() {
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return NOME;
    }

    public void adicionaCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("O cliente " + cliente.getNome() + " adicionado com sucesso ao nosso Banco!");
    }

    public void removerCliente(Cliente cliente) {
        if (clientes.contains(cliente)) {
            clientes.remove(cliente);
            System.out.println("O cliente " + cliente.getNome() + " removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    public void adicionaConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta " + conta.getNumero() + " adicionado com sucesso ao sistema");
    }

    public Cliente buscarClientePorCPF(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        System.out.println("Cliente com CPF " + cpf + " não encontrado!");
        return null;
    }

    public void imprimirListaClientes() {
        System.out.println("Lista de clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void imprimirListaContas() {
        System.out.println("Lista de contas:");
        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }
    }
}
