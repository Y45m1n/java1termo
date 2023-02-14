package CalculadoraDeDescontos;

public class CalcularDesnconto {
public void calcular() {
    System.out.println( "============");
    double precoProduto;
    precoProduto = 200;
    System.out.println( " O preço do produto é de " + precoProduto + " reais ");
    double percentualDesconto = 10.0;
    percentualDesconto = 20;
    System.out.println( " O desconto será de " + percentualDesconto + "% " ); // Regra de tres para descobrir qual o valor do desconto
    double desconto = precoProduto*percentualDesconto/100; 
    //preco do produto menos o desconto para saber o valor do produto com o desconto que foi calculado na linha anterior
    double precoComDesconto = precoProduto - desconto;
    System.out.println( " Com desconto, o produto sai " + "por R$" + precoComDesconto + ".");
    System.out.println( " Fim!" );
    System.out.println( "============");
}
public void calcular30() {
    System.out.println( "============");
    double precoProduto;
    precoProduto = 200;
    System.out.println( " O preço do produto é de " + precoProduto + " reais ");
    double percentualDesconto = 10.0;
    percentualDesconto = 30;
    System.out.println( " O desconto será de " + percentualDesconto + "% " ); // Regra de tres para descobrir qual o valor do desconto
    double desconto = precoProduto*percentualDesconto/100; 
    //preco do produto menos o desconto para saber o valor do produto com o desconto que foi calculado na linha anterior
    double precoComDesconto = precoProduto - desconto;
    System.out.println( " Com desconto, o produto sai " + "por R$" + precoComDesconto + ".");
    System.out.println( " Fim!" );
    System.out.println( "============");
    
}
public void calcular50() {
    System.out.println( "============");
    double precoProduto;
    precoProduto = 200;
    System.out.println( " O preço do produto é de " + precoProduto + " reais ");
    double percentualDesconto = 10.0;
    percentualDesconto = 50;
    System.out.println( " O desconto será de " + percentualDesconto + "% " ); // Regra de tres para descobrir qual o valor do desconto
    double desconto = precoProduto*percentualDesconto/100; 
    //preco do produto menos o desconto para saber o valor do produto com o desconto que foi calculado na linha anterior
    double precoComDesconto = precoProduto - desconto;
    System.out.println( " Com desconto, o produto sai " + "por R$" + precoComDesconto + ".");
    System.out.println( " Fim!" );
    System.out.println( "============");
    
}
}
