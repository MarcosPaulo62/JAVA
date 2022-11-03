package org.example;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1, "Marcos");
        conta.imprimirDados();

        conta.alterarNome("Marcos Paulo");
        conta.deposito(5000);
        conta.saque(1500);
        conta.imprimirDados();
    }
}