package org.example;

public class ContaCorrente {
    private int numero;
    private String nome;
    private float saldo;

    public ContaCorrente(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0.0f;
    }

    public ContaCorrente(int numero, String nome, float saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void alterarNome(String nome){
        this.nome = nome;
    }

    public void deposito(float valor) {
        this.saldo += valor;
    }

    public void saque(float valor){
        this.saldo -= valor;
    }

    public void imprimirDados(){
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Nome do correntista: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
    }
}
