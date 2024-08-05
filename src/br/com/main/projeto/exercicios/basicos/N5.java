package br.com.main.projeto.exercicios.basicos;

import java.util.Scanner;

public class N5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, operacao;

        System.out.println("Insira o primeiro inteiro: ");
        x = input.nextInt();
        System.out.println("Insira o segundo inteiro: ");
        y = input.nextInt();

        operacao = x * y;
        System.out.println(operacao);

    }
}
