package br.com.controledeestoque.estoquebilly;



public class PessoaFisica extends Fornecedor {
    private String cpf;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
  
    public PessoaFisica(String setNome, String cpf, boolean cartaoFidelidade, double setCapital) {
        super.setNome(setNome);
        if (cpf.length() ==11 && cpf.matches("\\d+")){  // a expressão regular de \\d+ serve para que String receba apenas digito numérico
            this.cpf = cpf;
         
          } else 
           throw new IllegalArgumentException("O cpf precisa conter 11 numeros!");
        super.isCartaoFidelidade();
        super.setCapital(setCapital);
    }
    
    public void dadosPessoaFisica() {
        
        System.out.println("\n Nome do cliente:  " + getNome());
        System.out.println("Cpf do cliente:  " + getCpf());
        System.out.println("Possui cartão fidelidade:   " + isCartaoFidelidade());
        

    }
    
}



   

    

