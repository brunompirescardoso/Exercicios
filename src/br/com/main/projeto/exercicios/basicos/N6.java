package br.com.main.projeto.exercicios.basicos;

import java.util.Scanner;

/*
6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
 */
public class N6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;

        System.out.println("Insira o primeiro inteiro: ");
        x = input.nextInt();
        System.out.println("Insira o segundo inteiro: ");
        y = input.nextInt();

        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        System.out.println(x + " % " + y + " = " + (x % y));

        input.close();

    }
}
