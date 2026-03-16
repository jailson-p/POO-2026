package engetelecom.poo;

public class Contador {

    private int valorAtual = 0;


    public void incrementar(){
        this.valorAtual ++;
    }
    public int getValor(){
        return this.valorAtual;
    }

    public void setValor(int n){
        this.valorAtual = n;
    }
}
