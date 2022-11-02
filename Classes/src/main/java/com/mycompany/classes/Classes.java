package com.mycompany.classes;


import java.util.Scanner;

public class Classes {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Pessoa objetoPessoa = new Pessoa(70.0f, 1.75f);
        
        System.out.println("Digite o peso da pessoa: ");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite a altura da pessoa: ");
        objetoPessoa.setAltura(leitor.nextFloat());
        
        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    }
}
