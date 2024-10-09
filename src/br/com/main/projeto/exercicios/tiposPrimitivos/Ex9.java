package br.com.main.projeto.exercicios.tiposPrimitivos;

import java.util.Scanner;

//Calculo de raízes de equanção de segundo grau
public class Ex9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c, delta, x1, x2;;

        //Entradas usuario
        System.out.println("Insira o coeficiente de a: ");
        a = input.nextInt();
        System.out.println("Insira o coeficiente de b: ");
        b = input.nextInt();
        System.out.println("Insira o coeficiente de c: ");
        c = input.nextInt();

        if(a != 0){
            //Calculo delta
            delta = (int) ((Math.pow(b, 2)) - (4 * a * c));
            if(delta < 0){
                System.out.println("Não tem raízes.");
            }else{
                x1 = (int) (b + Math.sqrt(delta)) / 2 * a;
                x2 = (int) (b - Math.sqrt(delta)) / 2 * a;
                System.out.println("x1: " + x1 + " x2: " + x2);
            }

        }


    }
}
