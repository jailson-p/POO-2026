package engetelecom.poo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public boolean addContato(Contato c){
        return contatos.add(c);
    }
    //public
    public boolean removeContato(int indiceContatoNaLista){
        return contatos.remove(indiceContatoNaLista);
    }

}
