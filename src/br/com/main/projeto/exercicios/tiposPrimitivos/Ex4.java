package br.com.main.projeto.exercicios.tiposPrimitivos;
import java.util.Scanner;

//Calculo de IMC
public class Ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Insira sua altura (em m): ");
        altura = input.nextDouble();
        System.out.println("Insira seu peso (em kg): ");
        peso = input.nextDouble();

        imc = peso / (Math.pow(altura, 2));
        System.out.println("IMC: " + imc);
    }
}
