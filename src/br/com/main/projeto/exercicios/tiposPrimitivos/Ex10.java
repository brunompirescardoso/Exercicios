package br.com.main.projeto.exercicios.tiposPrimitivos;

import java.util.Scanner;

//Conversão de decimal para binário
public class Ex10 {100100
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int decimal;
        String binario;

        System.out.println("Insira o decimal: ");
        decimal = input.nextInt();
        binario = Integer.toBinaryString(decimal);
        System.out.println("Decimal: " + decimal + " - Binario: " + binario);

    }
}
