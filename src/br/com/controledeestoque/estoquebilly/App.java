package br.com.controledeestoque.estoquebilly;

public class App {
    public static void main(String[] args) throws Exception {
        ControleDeEstoque controleDeEstoque = new ControleDeEstoque();
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setCafeCru(10);
        fornecedor.setCafeMoido(10);
        fornecedor.setCafeTorrado(10);
       controleDeEstoque.getEstoque(fornecedor);

        PessoaJuridica pessoaJuridica = new PessoaJuridica("12345644", false, 25.99);
        pessoaJuridica.setNome(" Café Mania");
        pessoaJuridica.dadosPessoaJuridica();
        pessoaJuridica.setCafeCru(5);
         controleDeEstoque.getEstoque(pessoaJuridica);

        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("987654321", true, 30000.98);
        pessoaJuridica2.setNome(" Cafe do Caval");
        pessoaJuridica2.dadosPessoaJuridica();
        controleDeEstoque.getEstoque(pessoaJuridica2);

        PessoaFisica pessoaFisica = new PessoaFisica("12345645457", true, 10000.00);
        pessoaFisica.setNome(" Lucas brito");
        pessoaFisica.dadosPessoaFisica();
        pessoaFisica.setCafeCru(2);
        controleDeEstoque.getEstoque(pessoaFisica);
      
        

    }
}
