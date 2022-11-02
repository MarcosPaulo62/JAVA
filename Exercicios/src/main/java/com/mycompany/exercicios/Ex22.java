package com.mycompany.exercicios;

import java.util.Scanner;

public class Ex22 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        
        int i = 0;
        for (; i < 4; i++) {
            
            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitor.nextLine();
            System.out.println("Digite o preço de custo: ");
            precoCusto = leitor.nextFloat();
            System.out.println("Digite o preço de venda: ");
            precoVenda = leitor.nextFloat();
            
            totalCusto += precoCusto;
            totalVenda += precoVenda;
            
            if(precoCusto == precoVenda){
                System.out.println("Houve empate entre o preço"
                        + " de custo e o preço de venda");
            } else {
                if(precoCusto > precoVenda) {
                    System.out.println("Houve prejuízo");
                } else {
                    System.out.println("Houve lucro");
                }
            }
            
            System.out.println(nomeProduto + ", preço de custo = R$"
            + precoCusto + " preço de venda = R$" + precoVenda);
        }
        
        System.out.println("A média do preço de custo é de R$"
                + (totalCusto / i));
        System.out.println("A média do preço de venda é de R$"
                + (totalVenda / i));
    }
}
