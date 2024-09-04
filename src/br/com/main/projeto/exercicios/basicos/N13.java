package br.com.main.projeto.exercicios.basicos;

import java.util.Scanner;

public class N13 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N13OperacoesBinario operacao = new N13OperacoesBinario();

        System.out.println("Insira o primeiro numero binario: ");
        String b1 = input.next();
        System.out.println("Insira o segundo numero binario: ");
        String b2 = input.next();



        System.out.println("A soma é igual a: " + operacao.binarySum(operacao.binToInt(b1), operacao.binToInt(b2)));







    }


}
