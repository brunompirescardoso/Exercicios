package br.com.main.projeto.exercicios.tiposPrimitivos;

import java.util.Scanner;
/**
 * Cálculo de área de um retângulo
 */
public class Ex1 {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       int b, h, area;
       System.out.println("Insira a base do retângulo: ");
       b = input.nextInt();
       System.out.println("Insira a altura do retângulo: ");
       h = input.nextInt();

       area = b * h;
       System.out.println("A área do retângulo é: " + area + "m");

   }



}
