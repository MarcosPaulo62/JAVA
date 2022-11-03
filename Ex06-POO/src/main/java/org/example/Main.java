package org.example;

public class Main {
    public static void main(String[] args) {
        Invoice fatura = new Invoice(01,
                "Fone de ouvido",
                10,
                95);

        System.out.println("Item nº: " + fatura.getItemFaturado());
        System.out.println("Nome: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQtdComprada());
        System.out.println("Preço: R$" + fatura.getPreco());
        System.out.println("Total: R$" + fatura.getInvoiceAmount());
    }
}