package engetelecom.poo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        char[][] map = new char[0][0];
        int count = 0;
        // Enquanto houver nova linha, acrescenta uma linha na Array char
        while (entrada.hasNext()) {
            String linha = entrada.nextLine();
            if(linha.isEmpty())break;
            count++;
            map = Arrays.copyOf(map, count);
            map[count-1] = linha.toCharArray();
        }
        //array com coordenadas que orbitam o campo para análise
        int[][] orbita = new int[][]{ {-1, -1}, {-1, 0}, {-1, 1},
                                      { 0, -1},          { 0, 1},
                                      { 1, -1}, { 1, 0}, { 1, 1}};

        for (int linha = 0; linha < map.length; linha++) {
            for (int coluna = 0; coluna < map[linha].length; coluna++) {
                if(map[linha][coluna] == '*' ){
                    for (int[] orb: orbita){
                        int     orbLinha  = linha  + orb[0],
                                orbColuna = coluna + orb[1];
                        if(     orbLinha  < 0 || orbLinha  > map.length -1 ||
                                orbColuna < 0 || orbColuna > map[linha].length-1) {continue;}
                        if(Character.isDigit(map[orbLinha][orbColuna])){
                                map[orbLinha][orbColuna]++;
                        }
                        else if (map[orbLinha][orbColuna] != '*') {
                                map[orbLinha][orbColuna] = '1';
                        }
                    }
                }
            }
        }
        IO.println();
        for (char[] linha : map){
            for (char campo: linha){ IO.print(campo + " "); }
            IO.println();
        }
    }
}