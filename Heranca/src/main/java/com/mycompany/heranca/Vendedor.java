package com.mycompany.heranca;


public class Vendedor extends Funcionario{ 
         
    private int totalItensVendidos;
    private float comissaoPorItem;

    public Vendedor() {
        super(); // Inicia o objeto vendedor com os atributos de funcionario
    }
    
    public float calcualarSalario(){
        return super.getSalario() + (this.comissaoPorItem
                                * this.totalItensVendidos);
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
        
}
