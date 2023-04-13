package br.com.controledeestoque.estoquebilly;
public  class Fornecedor {

private String nome;
private int cafeCru;
private int cafeTorrado;
private int cafeMoido;
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
    this.cafeCru += cafeCru;
   

   
}
public int getCafeTorrado() {
    return cafeTorrado;
}
public void setCafeTorrado(int cafeTorrado) {
   this.cafeTorrado += cafeTorrado;
}
public int getCafeMoido() {
    return cafeMoido;
}
public void setCafeMoido(int cafeMoido) {
    this.cafeMoido += cafeMoido;
}


}