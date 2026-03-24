package engetelecom.poo;

public class Main {
    static void main() {
        Ponto a = new Ponto(10,10);
        Ponto b = new Ponto(1,1);
        Ponto c = new Ponto(0,0);

        IO.println(a.distancia(c));
        IO.println(b);
        IO.println(b.distancia(c));



    }
}
