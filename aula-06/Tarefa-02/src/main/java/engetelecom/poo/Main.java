package engetelecom.poo;

import java.util.Random;

public class Main {
    static void main() {

        Random alenum = new Random();
        int sorteado = alenum.nextInt(1,101);
        int advinhando = 0;
        int tentativas = 0;
        String texto = "Digite algo entre 1 a 100:";
        do {
            if(advinhando != 0) {
                IO.println( sorteado < advinhando ? "É menor": "É maior" );
                texto = "Tente novamente:";
            }
            advinhando = Integer.parseInt(IO.readln(texto));
            tentativas++;
        }
        while (advinhando != sorteado);

        IO.println("Parabéns, você acertou!" + "\nForam " + tentativas + " tentativas.");

    }
}
