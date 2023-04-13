package br.com.controledeestoque.estoquebilly;

public class PessoaFisica extends Fornecedor {
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
   

    
}
