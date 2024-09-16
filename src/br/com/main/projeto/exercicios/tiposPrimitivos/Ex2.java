package br.com.main.projeto.exercicios.tiposPrimitivos;

import java.util.Scanner;

//Converte temperatura em Celsius para Farenheit
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celsius, farenheit;
        System.out.println("Insira a temperatura em Celisus: ");
        celsius = input.nextDouble();

        farenheit = (celsius * 1.8) + 32;
        System.out.println("Farenheit: " + farenheit);
    }

}
