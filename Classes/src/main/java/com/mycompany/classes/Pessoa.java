package com.mycompany.classes;


public class Pessoa {
    
    // Atributos 
    private float peso;
    private float altura;
    
    // Método Construtor
    public Pessoa(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
    }
    
    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }
    
    // Métodos acessores
    public void setPeso(float peso) {
        this.peso = peso;
    }    
    public float getPeso() {
        return peso;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }    
    public float getAltura() {
        return altura;
    }
}
