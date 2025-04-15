package br.com.dev.psytch.banco.servico;

import br.com.dev.psytch.banco.modelo.*;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeConta {

    private List<Conta> contas;

    public GerenciadorDeConta() {
        this.contas = new ArrayList<>();
    }

    public Conta abrirContaCorrente(Cliente cliente) {
        ContaCorrente cc = new ContaCorrente(cliente);
        contas.add(cc);
        System.out.println("Conta Corrente aberta com sucesso para o cliente " + cliente.getNome());
        return cc;
    }

    public Conta abrirContaPoupanca(Cliente cliente) {
        ContaPoupanca poupanca = new ContaPoupanca(cliente);
        contas.add(poupanca);
        System.out.println("Conta Poupanca aberta com sucesso para o cliente " + cliente.getNome());
        return poupanca;
    }

    public void fecharConta(Conta conta) {
        if (contas.contains(conta)) {
            contas.remove(conta);
            System.out.println("Conta Fechada com sucesso!");
        } else {
            System.out.println("Conta Não foi encontrada!");
        }
    }

    public void tranferir(Conta origem, Conta destino, double valor) {
        origem.transferir(destino, valor);
    }

    public void listarContas() {
        System.out.println("Contas Cadastradas:");
        contas.forEach(Conta::imprimirExtrato); // lambda - conta -> conta.imprimirExtrato()
    }

    public void listarContasComSaldoPositivo() {
        System.out.println("Contas com saldo positivo:");
        contas.stream()
                .filter(conta -> conta.getSaldo() > 0)
                .forEach(Conta::imprimirExtrato); // lambda - conta -> conta.imprimirExtrato()
    }
}
