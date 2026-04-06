package engetelecom.poo;


import java.util.HashMap;

public class Main {
        public HashMap<String,Livro> acervo1 = new HashMap<>();
    static void main() {

        Main biblioteca = new Main();


        HashMap<String,Livro> acervo = new HashMap<>();


        Livro a = new Livro("948", "Java", "Deitel", 2001);
        Livro b = new Livro("008", "Pequeno Príncipe", "Saint-Exupéry", 1943);
        Livro c = new Livro("","","Marciel Detienne", 1982);

        //if(!acervo.containsKey("948")){ acervo.put(a.getISBN(), a);}

        acervo.put(a.getISBN(), a);
        acervo.put(b.getISBN(), b);
        acervo.put(c.getISBN(), c);



    }
    public void cadastrar(){
        String isbn     = IO.readln("ISBN -> ");
        if(!acervo1.containsKey(isbn)){
            String titulo   = IO.readln("Título ->");
            String autor    = IO.readln("Autor ->");
            int ano         = Integer.parseInt(IO.readln("Ano ->"));
            Livro livro = new Livro(isbn,titulo,autor,ano);
            acervo1.put(isbn,livro);
        }else IO.println("Não é possível cadastrar este ISBN, pois já existe.");
    }
    public void listarAcervo(){
        for (Livro livro: acervo1.values()){
            IO.println(livro);
        }
    }
    public void consultar(String keyISBN){
        if(acervo1.containsKey(keyISBN)){}
    }
    




}
/*
* todo [X] cadastrar livro
* todo [X] listar ISBN e título de todos os livros
* todo [] Consultar livro por ISBN e imprimir todos os dados do livro
* todo [] Consultar livro por autor e imprimir todos os dado(s) dos livro(s)
* todo [] Atualizar dados de um livro, exceto o ISBN
* todo [] Remover um livro pelo ISBN
* todo [] Sair
*
*
* */

//        acervo.forEach( (k ,v )-> {
//                    IO.println(String.format("chave:%s%nvalor: %s", k , v));
//
//                }
//        );
//
//        for (Livro livro: acervo.values()){
//            IO.println(livro);
//        }
//