package br.com.dev.psytch.banco.modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContaPoupanca extends Conta {

    private static final double TAXA_RENDIMENTO = 0.005; // Rendimento de 0.5% ao mês
    private LocalDate ultimaDataRendimento;

    public ContaPoupanca(Cliente cliente) {
        super(cliente); // Chama o construtor da superclasse Conta com o parâmetro Cliente
        this.ultimaDataRendimento = LocalDate.now();
    }

    public void aplicarRendimentoMensal() {
        LocalDate hoje = LocalDate.now();
        long mesesDesdeUltimoRendimento = ChronoUnit.MONTHS.between(ultimaDataRendimento, hoje); // Calcula os meses entre o último rendimento e o dia atual.

        if (mesesDesdeUltimoRendimento >= 1) {
            double rendimento = this.saldo * TAXA_RENDIMENTO * mesesDesdeUltimoRendimento;
            this.saldo += rendimento;
            this.ultimaDataRendimento = hoje; // Atualiza a data do último rendimento
            System.out.println("Rendimento Aplicado com Sucesso! " + mesesDesdeUltimoRendimento + " mês(es) " + rendimento);
        } else {
            System.out.println("Tempo insuficiente para aplicar Rendimento!");
        }
    }
}
