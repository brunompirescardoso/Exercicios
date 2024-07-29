package br.com.main.projeto.exercicios.basicos;


import java.util.Scanner;

//Escreva um programa Java para dividir dois números e imprimi-los na tela.
public class N3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro número inteiro: ");
        int numero1 = input.nextInt();
        System.out.println("Insira o segundo número inteiro: ");
        int numero2 = input.nextInt();

        int divisao = numero1 / numero2;

        System.out.println(divisao);
    }
}
