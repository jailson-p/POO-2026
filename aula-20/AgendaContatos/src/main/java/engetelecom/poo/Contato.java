package engetelecom.poo;

import java.time.LocalDate;

public class Contato {

    private String name;
    private String Sobrenome;
    private LocalDate dataNasc;
    private ColecaoTelefone telefones;
    private ColecaoEmail emails;

    public Contato(String name, String sobrenome, LocalDate dataNasc) {
        this.name = name;
        this.Sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.telefones = new ColecaoTelefone();
        this.emails = new ColecaoEmail();
    }

    public boolean addTelefone(String rotulo, String valor){
        return telefones.add(rotulo,valor);
    }
    public boolean removeTelefone(String rotulo){
        return telefones.remove(rotulo);
    }

    public boolean addEmail(String rotulo, String valor){
        return emails.add(rotulo,valor);
    }
    public boolean removeEmail(String rotulo){
        return emails.remove(rotulo);
    }
    public  boolean updateTelefone(String rotulo,String valor){
        return telefones.update(rotulo,valor);
    }
    public  boolean updateEmail(String rotulo,String valor){
        return emails.update(rotulo,valor);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
//todo implementar toString para imprimir todos os dados do contato