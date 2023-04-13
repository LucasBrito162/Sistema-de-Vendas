package br.com.controledeestoque.estoquebilly;

public class ControleDeEstoque extends Fornecedor{
    private int estoque;


public void getEstoque(Fornecedor fornecedor) {
    this.estoque = (getCafeCru() + getCafeMoido() + getCafeTorrado());
    System.out.println("Quantidade de Café Cru:  " +fornecedor.getCafeCru());
    System.out.println("Quantidade de Café Moido:  " + fornecedor.getCafeMoido());
    System.out.println("Quantidade de Café Torrado:  " + fornecedor.getCafeTorrado());
    System.out.println("Quantidade do estoque Total:   " + this.estoque);
   }
    
}
