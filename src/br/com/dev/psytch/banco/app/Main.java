package br.com.dev.psytch.banco.app;

import br.com.dev.psytch.banco.modelo.*;
import br.com.dev.psytch.banco.servico.*;

public class Main {

    public static void main(String[] args) {

        // Criando clientes
        Cliente cliente1 = new Cliente("Julio Cesar", "444_482_865_01", "Rua Catarina, 41");
        Cliente cliente2 = new Cliente("Vitoria", "333_855_865_07", "Rua Catarina, 55");

        // Exibindo informações dos clientes
        System.out.println("=== Clientes Cadastrados ===");
        System.out.println(cliente1);
        System.out.println(cliente2);

        // Criando o gerenciador de contas
        GerenciadorDeConta gerenciador = new GerenciadorDeConta();

        // Abrindo contas para os clientes
        Conta cc1 = gerenciador.abrirContaCorrente(cliente1);
        Conta poupanca1 = gerenciador.abrirContaPoupanca(cliente1);
        Conta cc2 = gerenciador.abrirContaCorrente(cliente2);

        // Realizando depósitos nas contas
        System.out.println("\n=== Realizando Depósitos ===");
        cc1.depositar(1000);
        poupanca1.depositar(500);
        cc2.depositar(300);

        // Exibindo extratos das contas
        System.out.println("\n=== Extrato de Contas ===");
        gerenciador.listarContas();

        // Realizando saques
        System.out.println("\n=== Realizando Saques ===");
        cc1.sacar(200);
        poupanca1.sacar(100);

        // Exibindo extratos após saques
        System.out.println("\n=== Extrato de Contas Após Saques ===");
        gerenciador.listarContas();

        // Realizando transferências
        System.out.println("\n=== Realizando Transferências ===");
        gerenciador.tranferir(cc1, cc2, 150);

        // Exibindo extratos após transferências
        System.out.println("\n=== Extrato de Contas Após Transferências ===");
        gerenciador.listarContas();

        // Fechando conta do cliente2
        System.out.println("\n=== Fechando Conta do Cliente 2 ===");
        gerenciador.fecharConta(cc2);

        // Exibindo extrato final das contas
        System.out.println("\n=== Extrato Final das Contas ===");
        gerenciador.listarContas();

        System.out.println("\n=== Listando Contas com Saldo Positivo ===");
        gerenciador.listarContasComSaldoPositivo();
    }
}
