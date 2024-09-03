package br.com.main.projeto.exercicios.basicos;

import java.util.List;

public class N13OperacoesBinario {
    public int somaBinarios(String bin1, String bin2){
        char[] listaBinario1 = bin1.toCharArray();
        char[] listaBinario2 = bin2.toCharArray();

        int total = 0;

        int  tamanho1 = listaBinario1.length - 1;
        int  tamanho2 = listaBinario2.length - 1;

        for(int x = 0, y = tamanho1; x <= tamanho1; x++, y--) {
            if (listaBinario1[x] == '1') {

                total += (int) Math.pow(2, y);
            }
        }

        for(int x = 0, y = tamanho2; x <= tamanho2; x++, y--) {
            if (listaBinario2[x] == '1') {

                total += (int) Math.pow(2, y);
            }
        }


        return total;
    }

}
