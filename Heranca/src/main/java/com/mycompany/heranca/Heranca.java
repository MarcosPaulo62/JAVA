package com.mycompany.heranca;

import java.util.Date;


public class Heranca {

    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        v.setNome("Marcos");
        v.setSalario(1000.0f);
        v.setCpf("11111111100");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.println("Salário do vendedor é: " + v.calcualarSalario());
                
    }
}
