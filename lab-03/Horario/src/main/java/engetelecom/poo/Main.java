package engetelecom.poo;

public class Main {
    static void main() {
        Horario rolex = new Horario(23,03,25);
        Horario cassio = new Horario(1,1,1);

        IO.print(rolex);
        IO.println(rolex.porExtenso());
        IO.println(rolex.paraSegundos());
        IO.print(cassio);
        IO.println(cassio.porExtenso());
        IO.println(cassio.paraSegundos());
        IO.println(rolex.diferencaHorarios(cassio));



    }
}
