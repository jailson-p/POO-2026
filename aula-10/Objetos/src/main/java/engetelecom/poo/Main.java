package engetelecom.poo;
public class Main {
    static void main() {
        //Carro c3 = new Carro();


        Pessoa cliente = new Pessoa("João", "456.564.456-44","jpws@gmail.com");
        IO.println(cliente.toString());
        IO.println(cliente);

        Carro kkk = new Carro("ka", 555);

        Horario relogio = new Horario();

        relogio.setHorario(11,15,00);
        relogio.setHorario(27,20,10);

        IO.println(relogio);
    }
}
