package br.com.main.projeto.exercicios.tiposPrimitivos;
import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double produto, desconto, total;
        System.out.println("Insira o valor do produto: ");
        produto = input.nextDouble();
        System.out.println("Insira o percentual do desconto: ");
        desconto = input.nextDouble();

        total = produto - (produto * desconto/100);
        System.out.println("Valor com desconto: " + total);

    }
}
