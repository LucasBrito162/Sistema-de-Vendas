package br.com.controledeestoque.estoquebilly;



public class PessoaJuridica extends Fornecedor{
    private String cnpj;
   
 
   

    public String getCnpj() {
        return cnpj;
    }




    public PessoaJuridica(String setNome, String cnpj, boolean cartaoFidelidade, double setCapital) {
        super.setNome(setNome);
        
        if (cnpj.length() ==14 && cnpj.matches("\\d+")){
           this.cnpj = cnpj;
        
         } else 
          throw new IllegalArgumentException("O cnpj precisa conter 14 numeros!");
         super.setCartaoFidelidade(cartaoFidelidade);
        super.setCapital(setCapital);
  
    }

    public void dadosPessoaJuridica() {
       
        System.out.println("\n Nome da Empresa: " + getNome());
        System.out.println("Cnpj da Empresa:  " + getCnpj());
        System.out.println("É Empresa Parceira:   " + isCartaoFidelidade());
        
    }


}


    


