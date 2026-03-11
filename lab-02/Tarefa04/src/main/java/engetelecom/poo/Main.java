package engetelecom.poo;

import java.util.Random;

public class Main {
    static void main() {

        char[][] matriz = new char[9][9];
        Random random = new Random() ;
        //Preenche todos os campos da matriz com '.'
        for (int linha = 0; linha < 9; linha++) {
            for (int coluna = 0; coluna < 9; coluna++)
                matriz[linha][coluna] = '.';
        }
        //Aleatóriamente substituí por 10 asteriscos
        for (int i = 0; i < 10; i++) {
            int linha = random.nextInt(9);
            int coluna = random.nextInt(9);
            if(matriz[linha][coluna] == '.' ){
                matriz[linha][coluna] = '*';
            }
            else i--;
        }
        //Saída padrão para a matriz
        for(char[] linha : matriz){
            for (char campo: linha) IO.print(campo);
            IO.println();
        }
    }
}