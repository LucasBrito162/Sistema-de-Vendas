package br.com.controledeestoque.estoque;

import br.com.controledeestoque.metodos.SistemaDeCompra;

public class App {
    public static void main(String[] args) throws Exception {

        Fornecedor fornecedor = new Fornecedor();        
        SistemaDeCompra sistemaDeCompra = new SistemaDeCompra();

        fornecedor.setCafeCru(1000);
        fornecedor.setCafeMoido(1000);
        fornecedor.setCafeTorrado(1000);
        

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Café Mania","lucasdebritonu", true, 10000.00);
        pessoaJuridica.dadosPessoaJuridica();
        sistemaDeCompra.comprarCafeCru(200, fornecedor, pessoaJuridica);
        System.out.println("\n ESTOQUE DO CAFÉ MANIA");
        pessoaJuridica.imprimirEstoque();



        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("Cafe Caval", "lucasdebritonu", false, 10000);
        pessoaJuridica2.dadosPessoaJuridica();
        sistemaDeCompra.comprarCafeCru(200, fornecedor, pessoaJuridica2);
        System.out.println("\n ESTOQUE DO CAFÉ CAVAL");
        pessoaJuridica2.imprimirEstoque();


        System.out.println(fornecedor.getCapital());
        fornecedor.imprimirEstoque();

        System.out.println(sistemaDeCompra.getCapital());
    }
}
