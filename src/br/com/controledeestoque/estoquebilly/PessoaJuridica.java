package br.com.controledeestoque.estoquebilly;

public class PessoaJuridica extends Fornecedor  {
    private String cnpj;
    private boolean  empresaParceira;

    public String getCnpj() {
        return cnpj;
    }

    public boolean isEmpresaParceira() {
        return empresaParceira;
    }

    public PessoaJuridica(String cnpj, boolean empresaParceira, double setCapital) {
        this.cnpj = cnpj;
        this.empresaParceira = empresaParceira;
        super.setCapital(setCapital);
  
    }

    public void dadosPessoaJuridica() {
        System.out.println("\n Nome da Empresa: " + getNome());
        System.out.println("Cnpj da Empresa:  " + getCnpj());
        System.out.println("É Empresa Parceira:   " + isEmpresaParceira());
        System.out.println("Total do Capital:  " + getCapital());
    }

    

}
