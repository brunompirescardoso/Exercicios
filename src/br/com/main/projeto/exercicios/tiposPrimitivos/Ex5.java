package br.com.main.projeto.exercicios.tiposPrimitivos;
import java.util.Scanner;

//Verifica se é par ou impar
public class Ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero;
        String resultado = "negativo";

        System.out.println("Insira um número inteiro: ");
        numero = input.nextInt();

        if(numero % 2 == 0) {
            resultado = "positivo";
        }
        System.out.println("O número é: " + resultado);

    }

}
