package engetelecom.poo;
public class Main {
    static void main() {

        int dia =  Integer.parseInt(IO.readln("Entre com o dia: "));
        String mes = IO.readln("Entre com o mês: ");

        String estacao = switch (mes.toUpperCase()){
            case "JANEIRO"      -> "Verão";
            case "FEVEREIRO"    -> "Verão";
            case "MARÇO"        -> dia <= 20 ? "Verão":"Outono";
            case "ABRIL"        -> "Outono";
            case "MAIO"         -> "Outono";
            case "JUNHO"        -> dia <= 20 ? "Outono":"Inverno";
            case "JULHO"        -> "Inverno";
            case "AGOSTO"       -> "Inverno";
            case "SETEMBRO"     -> dia <= 22 ? "Inverno":"Primavera";
            case "OUTUBRO"      -> "Primavera";
            case "NOVEMBRO"     -> "Primavera";
            case "DEZEMBRO"     -> dia <= 21 ? "Primavera":"Verão";
            default -> "Erro de entrada";
        };
        System.out.println(estacao);


    }
}
