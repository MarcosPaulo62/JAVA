package com.mycompany.exercicios;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int ano;
        float preco;
        float desconto;
        int totalVeiculos = 0;
        int totalVeiculosAntes2000 = 0;
        
        char continuar = 'S';
        
        while(continuar == 'S' || continuar =='s'){
            System.out.print("Ano do veículo: ");
            ano = leitor.nextInt();
            System.out.print("Preço do veículo: R$");
            preco = leitor.nextFloat();
            
            totalVeiculos++;
            
            if(ano <= 2000){
                desconto = preco * 0.12f;
                totalVeiculosAntes2000++;
            } else {
                desconto = preco * 0.07f;                
            }
            
            System.out.println("Valor do desconto: R$" + desconto);
            System.out.println("Valor a ser pago pelo veículo: R$"
                    + (preco - desconto));
            
            System.out.print("Deseja continuar? S/N ");
            continuar = leitor.next().charAt(0);
        }
        
        System.out.println("Total de veículos: " + totalVeiculos);
        System.out.println("Total de veículos com ano até 2000: "
                + totalVeiculosAntes2000);
    }
}
