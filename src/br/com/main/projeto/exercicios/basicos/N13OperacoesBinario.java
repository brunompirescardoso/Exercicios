package br.com.main.projeto.exercicios.basicos;

import java.util.List;

public class N13OperacoesBinario {
    public int binToInt(String bin){
        char[] list = bin.toCharArray();
        int size = list.length - 1;
        int total = 0;

        for(int x = 0, y = size; x <= size; x++, y--){
            if(list[x] == '1'){
                total += Math.pow(2, y);
            }
        }
        return total;
    }

    public int binarySum(int fNum, int sNum){
        return fNum + sNum;
    }
}
