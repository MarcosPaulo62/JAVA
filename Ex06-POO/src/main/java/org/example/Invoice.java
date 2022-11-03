package org.example;

public class Invoice {

    private int itemFaturado;
    private String descricao;
    private int qtdComprada;
    private float preco;

    public Invoice(int itemFaturado, String descricao, int qtdComprada, float preco) {
        this.setItemFaturado(itemFaturado);
        this.setDescricao(descricao);
        this.setQtdComprada(qtdComprada);
        this.setPreco(preco);
    }

    public double getInvoiceAmount(){
        return this.preco * this.qtdComprada;
    }

    public int getItemFaturado() {
        return itemFaturado;
    }

    public void setItemFaturado(int itemFaturado) {
        this.itemFaturado = itemFaturado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        if(qtdComprada < 0) {
            this.qtdComprada = 0;
        } else {
            this.qtdComprada = qtdComprada;
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if(preco < 0) {
            this.preco = 0.0f;
        } else {
            this.preco = preco;
        }
    }
}
