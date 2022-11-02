package com.mycompany.ex24;

import java.util.Scanner;

public class Ex24 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        char continuar = 'S';
        
        while(continuar == 'S' || continuar == 's') {
            System.out.print("Digite um número: ");
            int entrada = leitor.nextInt();
            
            if(entrada == 0) {
                System.out.println("Zero");
            } else {
                if(entrada < 0) {
                    System.out.println("Negativo");
                } else {
                    System.out.println("Positivo");
                }
            }
            
            System.out.print("Continuar? ");
            continuar = leitor.next().charAt(0);
        }
    }
}
