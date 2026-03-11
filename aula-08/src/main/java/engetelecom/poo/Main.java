package engetelecom.poo;

public class Main {
    static void main() {

        Lampada a= new Lampada();
        Lampada b = new Lampada();

        IO.println(a.isLigada());
        a.ligardesligar();
        IO.println(a.isLigada());

    }
}
//banqueta
//  atributo
//      altura
//      qut pernas
//      tipomaterial
//      ocupada
//  método
//      mover
//      ocupar
//
//janela
//  atributo
//      estado
//      tipo esquadria
//      tipo vidro
//
//  metodo
//      abrir
//      fechar
//      mudar transparencia
//lampada
// atributo
//      tipo
//      potencia
//      tensao de trabalho
//      calorkelvin
//      correntemax
//      corrente atual
//      estado


// metodo
//   ligar
