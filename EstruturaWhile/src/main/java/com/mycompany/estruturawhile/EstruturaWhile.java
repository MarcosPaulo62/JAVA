package com.mycompany.estruturawhile;

import java.util.Scanner;

public class EstruturaWhile {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int totalAlunos = 5;
        
        while(totalAlunos > 0) {
            String nomeAluno = leitor.nextLine();
            int idadeAluno = leitor.nextInt();
            
            System.out.println("O nome do aluno é: " + nomeAluno + " e sua "
                                + "idade é:" + idadeAluno);
            
            totalAlunos--;
        }
    }
}
