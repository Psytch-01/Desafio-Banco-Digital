package br.com.dev.psytch.banco.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO++;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public long getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");

        } else if (this.saldo > valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + this.saldo);
        } else {
            System.out.println("Transação invalida");
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso. Saldo atual: " + this.saldo);

    }

    public void transferir(Conta contaDestino, double valor) {
        this.saldo -= valor;
        contaDestino.depositar(valor);
        System.out.println("Tranferência realizada com sucesso. Saldo atual: " + this.saldo);
    }

    public void imprimirExtrato() {
        System.out.println("Conta: " + cliente.getNome());
        System.out.println("Número: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: R$" + String.format("%.2f", saldo));
    }
}
