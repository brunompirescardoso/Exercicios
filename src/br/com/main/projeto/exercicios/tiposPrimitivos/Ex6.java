package br.com.main.projeto.exercicios.tiposPrimitivos;

import java.util.Scanner;

//Calcula taxa de juros simples
public class Ex6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double valorInicial, taxaJuros, valorFinal;
        int quantMeses;

        System.out.println("Insira o valor inicial: ");
        valorInicial = input.nextDouble();
        valorFinal = valorInicial;
        System.out.println("Insira a taxa de juros mensal: ");
        taxaJuros = input.nextDouble();
        System.out.println("Insira a quantidade de meses: ");
        quantMeses = input.nextInt();


        valorFinal += valorInicial * (taxaJuros / 100) * quantMeses;

        System.out.println("Valor total: " + valorFinal);

    }

}
