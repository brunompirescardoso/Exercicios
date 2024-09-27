package br.com.main.projeto.exercicios.tiposPrimitivos;

import java.util.Scanner;

//Converte reais para dollar
public class Ex7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double valor, cotacaoDollar, conversao;

        System.out.println("Insira o valor em reais: ");
        valor = input.nextDouble();
        System.out.println("Insira a cotação atual do dollar: ");
        cotacaoDollar = input.nextDouble();

        conversao = valor / cotacaoDollar;
        System.out.println("O valor em dollar é igual a: " + conversao);
    }
}
