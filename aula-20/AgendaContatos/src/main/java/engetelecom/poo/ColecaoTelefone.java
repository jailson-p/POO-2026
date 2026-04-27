package engetelecom.poo;

import java.util.HashMap;

public class ColecaoTelefone {

    private HashMap <String,String> dados;

    public ColecaoTelefone() {
        this.dados = new HashMap<>();
    }

    public boolean add(String rotulo, String valor){
        if(!dados.containsKey(rotulo)){
            dados.put(rotulo,valor);
            return true;
        }
        return false;
    }

    public boolean remove(String rotulo) {
        if(dados.remove(rotulo) == null) return false;
        return true;
    }

    public boolean update(String rotulo, String valor){
        if(dados.replace(rotulo,valor) == null)return false;
        return true;
    }

    @Override
    public String toString() {
        return "ColecaoTelefone{" +
                "dados=" + dados +
                '}';
    }
}
//todo não há critério para erro de introdução de dados no valor de telefone
//todo fazer o toString que imprima todos os dados da HashMap