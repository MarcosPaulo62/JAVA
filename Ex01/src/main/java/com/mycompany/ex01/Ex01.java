/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Número 1: ");
        int num1 = leitor.nextInt();
        System.out.print("Número 2: ");
        int num2 = leitor.nextInt();
        
        int soma = num1 + num2;
        
        System.out.println("Resultado da soma é: " + soma);
    }
}
