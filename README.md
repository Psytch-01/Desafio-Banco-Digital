# Desafio-Banco-Digital 🏦

## Descrição

Este projeto é uma implementação de um **Banco Digital** utilizando os conceitos de **Programação Orientada a Objetos (POO)**, como parte do desafio proposto no Bootcamp Bradesco-DIO. O objetivo do desafio é construir uma aplicação simples de gestão bancária, com funcionalidades de contas correntes e poupanças, oferecendo uma visão prática dos conceitos fundamentais da programação orientada a objetos.

A aplicação permite a criação de clientes, abertura de contas bancárias, realização de saques, depósitos, transferências, e cálculo de rendimentos mensais para contas poupança. Além disso, foi implementado um gerenciador de contas que controla as operações bancárias, como a abertura, fechamento e listagem de contas.

---

## Objetivo do Projeto

O principal objetivo deste projeto foi implementar um banco digital simples utilizando os conceitos de POO, com foco na clareza da estrutura e na praticidade das operações. Este desafio permitiu que conceitos como herança, polimorfismo, encapsulamento e composição fossem aplicados de forma direta e eficiente, promovendo uma boa compreensão de como esses conceitos podem ser utilizados no desenvolvimento de sistemas reais.

---
## Funcionalidades Implementadas

- **Cadastro de Clientes**: Criação de clientes com informações básicas (nome, CPF, endereço).
- **Abertura de Contas**: Criação de contas bancárias, tanto Correntes quanto Poupanças.
- **Operações Bancárias**: Saques, depósitos e transferências entre contas.
- **Rendimento de Conta Poupança**: Cálculo automático de rendimento mensal para contas poupança com base em uma taxa fixa.
- **Gerenciamento de Contas**: Um gerenciador que permite a criação, fechamento e listagem de contas.
- **Validação de CPF**: Um validador simples para verificar se o CPF de um cliente está no formato correto.

## 🧱 Estrutura do Projeto

### Pacotes:

- **br.com.banco.modelo**: Contém as classes de modelo, como `Cliente`, `Conta`, `ContaCorrente`, `ContaPoupanca`.
- **br.com.banco.servico**: Contém os serviços para manipulação das contas, como o `GerenciadorDeConta` e o `Autenticador`.
- **br.com.banco.util**: Contém utilitários como o `ValidadorCPF` e o `FormatadorMonetario`.

---

## 💡 Funcionalidades adicionais

Durante o desenvolvimento, foram aplicados recursos do **Java 8**, como **expressões lambda** e **Streams** da Java Collections API, com o intuito de tornar o código mais fluido e moderno.

### Exemplos de uso:

- `listarContas()`  
  Utiliza `.forEach(Conta::imprimirExtrato)` para exibir todas as contas de forma enxuta.

- `listarContasComSaldoPositivo()`  
  Utiliza `.stream().filter(...).forEach(...)` para exibir apenas contas com saldo positivo de maneira funcional.

---
### Principais Classes:

1. **Cliente**: Representa o cliente do banco com atributos como nome, CPF e endereço.
2. **Conta**: Classe abstrata representando uma conta bancária genérica, com funcionalidades como saque, depósito e transferência.
3. **ContaCorrente**: Subclasse de `Conta`, representa uma conta corrente com regras específicas de operação.
4. **ContaPoupanca**: Subclasse de `Conta`, implementa o cálculo de rendimento mensal para contas poupança.
5. **GerenciadorDeConta**: Classe responsável pelo gerenciamento das contas bancárias, como abrir e fechar contas.
6. **Autenticador**: Classe para validar login de clientes (simples, sem segurança avançada).
7. **ValidadorCPF**: Valida o formato do CPF para garantir que ele esteja correto antes de ser utilizado.
8. **FormatadorMonetario**: Utilitário para formatar valores monetários, exibindo-os corretamente com o símbolo "R$".

---


## Tecnologias Utilizadas

- **Java 8+**: Utilizado para a implementação de todas as classes e operações.
- **POO (Programação Orientada a Objetos)**: Todos os conceitos de POO foram aplicados no design das classes e na lógica do sistema.
- **Java.time**: Para a manipulação de datas e cálculo do rendimento mensal da conta poupança.

## Como Rodar o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu_usuario/Desafio-Banco-Digital.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd Desafio-Banco-Digital
   ```
3. ## 🧪 Testes

A classe `Main` foi implementada com o propósito de testar todas as funcionalidades disponíveis de forma clara e demonstrativa.

---

