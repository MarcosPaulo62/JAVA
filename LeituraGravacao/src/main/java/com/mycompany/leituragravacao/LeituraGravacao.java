package com.mycompany.leituragravacao;

import java.util.Scanner; // Importa o comando de leitura

public class LeituraGravacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        int idade = leitor.nextInt(); // Lê um inteiro
        float cotacaoDolar = leitor.nextFloat(); // Lê um float
        double cotacaoEuro = leitor.nextDouble(); // Lê um double
        String nome = leitor.nextLine(); // Lê uma frase
        String codigoRua = leitor.next(); // Lê uma palavra

        System.out.println("Imprime texto e pula linha"); 
        System.out.print("Imprime texto");
        
    }
}
