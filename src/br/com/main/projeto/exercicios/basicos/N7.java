package br.com.main.projeto.exercicios.basicos;

import java.util.Scanner;

//Write a Java program that takes a number as input and prints its multiplication table up to 10.
public class N7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Insira um inteiro: ");
        numero = input.nextInt();

        for(int x = 1; x <= 10; x++){
            System.out.println(numero + " * " + x + " = " + (numero * x));
        }

    }
}
