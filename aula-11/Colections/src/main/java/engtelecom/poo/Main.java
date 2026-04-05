package engtelecom.poo;

import java.util.ArrayList;

public class Main {

    private  ArrayList<Conta> contas;
    private  int numUltConta;

    public Main(){
        this.contas = new ArrayList<>();
    }

    public void menu(int opcao){
        switch (opcao){
            case 1:
                criarConta();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:

        }

    }
    public void criarConta(){
        String nConta = IO.readln("N° da conta:");
        String titular = IO.readln("Digite o nome do titular: ");
        int saldoInit = Integer.parseInt(IO.readln("Valor de saldo:"));
        Conta conta = new Conta(titular,nConta,saldoInit);
        contas.add(conta);
    }

    static void main(String[] args) {



    }

}
// menu com 3 opções
//1-criar conta
//2-depoisitar
//3-sacar
//4-listar todas contas
//5-sair
//        var lista2 = new ArrayList<String>();
//
//        lista.add("juca");
//        lista.add("Gilvan");
//        lista.add("Raphael");
//        lista.add(1,"Beto");
//
//        for(String a : lista) {
//            IO.println(a.equals("Beto") ? a : "");
//        }
//
//        lista.forEach(elemento -> {
//            if(elemento.equals("Beto")){
//                IO.println(elemento);
//            }
//        });
//
//        lista.forEach(IO::println);
//        IO.println(lista.toString());
//
//        lista.removeIf(elemento -> elemento.equals("Gilvan"));
//        lista.forEach(IO::println);