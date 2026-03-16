package engetelecom.poo;

public class Main {
    static void main() {

        Caneta bic = new Caneta();
        bic.setCor("azul");
        bic.setNivelTinta(100);
        bic.setTampa();
        IO.println(bic.desenhar(0,5,0,50));

        IO.println(bic.getNivelTinta()+"%");

    }
}
