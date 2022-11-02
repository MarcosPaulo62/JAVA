package com.mycompany.ex02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Número 1: ");
        int num1 = leitor.nextInt();
        System.out.print("Número 2: ");
        int num2 = leitor.nextInt();
        
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));
    }
}
