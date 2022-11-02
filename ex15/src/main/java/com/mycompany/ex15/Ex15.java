package com.mycompany.ex15;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o número: ");
        int num = leitor.nextInt();
        
        if (num >= 100 && num <= 200) {
            System.out.println("O número " + num + " está entre 100 e 200");
        } else {
            System.out.println("O número " + num + " não está entre 100 e 200");
        }
    }
}
