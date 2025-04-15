package br.com.dev.psytch.banco.modelo;

public class ContaCorrente extends Conta {

    private double taxaSaque = 1.50;


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");

        } else if (this.saldo > valor) {
            this.saldo -= valor + taxaSaque;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + this.saldo);
        } else {
            System.out.println("Transação invalida");
        }
    }
}