package br.com.controledeestoque.estoquebilly;

import br.com.controledeestoque.metodos.Estoque;

public class Fornecedor implements Estoque{

    private String nome;
    private int cafeCru ;
    private int cafeTorrado;
    private int cafeMoido ;
    private double capital;

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;

    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public int getCafeCru() {
        return cafeCru;
    }

    public void setCafeCru(int cafeCru) {
        this.cafeCru = cafeCru;

    }

    public int getCafeTorrado() {
        return cafeTorrado;
    }

    public void setCafeTorrado(int cafeTorrado) {
        this.cafeTorrado = cafeTorrado;
    }

    public int getCafeMoido() {
        return cafeMoido;
    }

    public void setCafeMoido(int cafeMoido) {
        this.cafeMoido = cafeMoido;
    }
    
    public void comprarCafeCru(int quantidade, Fornecedor fornecedor) {
        if (quantidade <= fornecedor.getCafeCru()) {
            setCafeCru(getCafeCru() + quantidade);
            fornecedor.setCafeCru(fornecedor.getCafeCru() - quantidade);
            System.out.println("Compra de café cru realizada com sucesso!");
        } else {
            System.out.println("Não há café cru suficiente no estoque do fornecedor.");
        }
    }
    
    public void comprarCafeTorrado(int quantidade, Fornecedor fornecedor) {
        if (quantidade <= fornecedor.getCafeTorrado()) {
            setCafeTorrado(getCafeTorrado() + quantidade);
            fornecedor.setCafeTorrado(fornecedor.getCafeTorrado() - quantidade);
            System.out.println("\n Compra de café torrado realizada com sucesso!");
        } else {
            System.out.println("\n Não há café torrado suficiente no estoque do fornecedor.");
        }
    }
    
    public void comprarCafeMoido(int quantidade, Fornecedor fornecedor) {
        if (quantidade <= fornecedor.getCafeMoido()) {
            setCafeMoido(getCafeMoido() + quantidade);
            fornecedor.setCafeMoido(fornecedor.getCafeMoido() - quantidade);
            System.out.println("\n Compra de café moido realizada com sucesso!");
        } else {
            System.out.println("\n Não há café moido suficiente no estoque do fornecedor.");
        }
    }
  
    @Override
    public void imprimirEstoque() {
        System.out.println("\n Estoque de café cru: " + getCafeCru());
        System.out.println("Estoque de café torrado: " + getCafeTorrado());
        System.out.println("Estoque de café moído: " + getCafeMoido());
    }
  
    }

   
    
    

