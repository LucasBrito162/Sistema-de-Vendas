package br.com.controledeestoque.estoquebilly;

import br.com.controledeestoque.metodos.Estoque;

public class PessoaFisica extends Fornecedor implements Estoque{
    private String cpf;
    private boolean cartaoFidelidade;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public boolean isCartaoFidelidade() {
        return cartaoFidelidade;
    }
    public void setCartaoFidelidade(boolean cartaoFidelidade) {
        this.cartaoFidelidade = cartaoFidelidade;
    }
  
    public PessoaFisica(String cpf, boolean cartaoFidelidade, double setCapital) {
        this.cpf = cpf;
        this.cartaoFidelidade = cartaoFidelidade;
        super.setCapital(setCapital);
    }
    
    public void dadosPessoaFisica() {
        System.out.println("\n Nome do cliente:  " + getNome());
        System.out.println("Cpf do cliente:  " + getCpf());
        System.out.println("Possui cartão fidelidade:   " + isCartaoFidelidade());
        System.out.println("Total do capital:   " + getCapital());

    }

    @Override
    public void imprimirEstoque() {
        System.out.println("\n Estoque de café cru: " + getCafeCru());
        System.out.println("Estoque de café torrado: " + getCafeTorrado());
        System.out.println("Estoque de café moído: " + getCafeMoido());
    }









    
    }


   

    

