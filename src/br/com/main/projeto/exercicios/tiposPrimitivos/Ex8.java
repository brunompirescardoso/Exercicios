package br.com.main.projeto.exercicios.tiposPrimitivos;

import java.util.Scanner;

//Calculo de ano bissexto
public class Ex8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ano = 0;
        boolean div4, div100, div400;

        System.out.println("Insira um ano: ");
        ano = input.nextInt();

        //Condicoes
        div4 = ano % 4 ==0;
        div100 = ano % 100 == 0;
        div400 = ano % 400 == 0;

        if(div4 && (!div100 || div400)){
            System.out.println("Bissexto");
        }else{
            System.out.println("Não bissexto");
        }

    }
}
