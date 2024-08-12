package br.com.main.projeto.exercicios.basicos;

import java.util.Scanner;

/*
Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */
public class N11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double raio;
        double area, perimetro;

        System.out.println("Insira o raio do circulo: ");
        raio = input.nextDouble();

        area = (Math.pow(raio, 2)) * Math.PI;
        perimetro = (2 * raio) * Math.PI;

        System.out.println("Perimeter is = " + perimetro);
        System.out.println("Area is = " + area);

    }
}
