package br.com.main.projeto.exercicios.basicos;


/*
15. Escreva um programa Java para trocar duas variáveis.
 */
public class N12 {
    public static void main(String[] args) {
        int par = 3;
        int impar = 2;

        int var = par;
        par = impar;
        impar = var;

        System.out.println("Par: " + par + " - Impar: " +  impar);
    }



}
