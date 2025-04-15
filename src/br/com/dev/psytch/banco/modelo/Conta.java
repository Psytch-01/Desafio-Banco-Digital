package br.com.dev.psytch.banco.modelo;

public abstract class Conta {

    private long numero;
    private int agencia;
    private double saldo;
    private String titular;

    public void sacar(double valor) {

    }

    public void depositar(double valor) {

    }

    public void transferir(double valor, Conta destino) {

    }
}
