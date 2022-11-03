package org.example;

public class Pessoa {
    private String nome;
    private int dataNasc;
    private float altura;

    public Pessoa(String nome, int dataNasc, float altura) {
        this.setNome(nome);
        this.setDataNasc(dataNasc);
        this.setAltura(altura);
    }

    public void imprimirDados (){
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.dataNasc);
        System.out.println("Altura: " + this.altura);
        System.out.println("Idade: " + this.calculaIdade());
    }

    public int calculaIdade(){
        return 2022 - this.dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
