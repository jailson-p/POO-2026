public class Media {

    void main(){

        String texto1 = "Entre com ";
        String texto2 = "a nota: ";
        String resposta = "Sua média final é ";
        double[] media = new double[4] ;
        double mediaFinal = 0;

        for (int i = 0; i <= 3; i++) {
            media[i] = Double.parseDouble(IO.readln(texto1 + (i + 1) + texto2  ));
        }

        for (double d : media) {
            mediaFinal += d;
        }

        IO.println(resposta + Math.round(mediaFinal/4));

    }
    
}
