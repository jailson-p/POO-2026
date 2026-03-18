package engetelecom.poo;

public class Carro {

    private String modelo;
    private    int velocidadeAtual;
    private int velocidadeMax;
    public static final int VELOCIDADE_MAX_DA_CLASSE = 300;
    private static int SEM_VELOCIDADE = 0;

    public Carro(String modelo, int velocidadeMax){
        this.modelo = new String(modelo);
        this.velocidadeMax = velocidadeMax < VELOCIDADE_MAX_DA_CLASSE ? velocidadeMax: VELOCIDADE_MAX_DA_CLASSE;
    }

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeMax = VELOCIDADE_MAX_DA_CLASSE;
    }

    public void frear(int pressaoPedal){
        int frenagem = this.velocidadeAtual - pressaoPedal;
        if(frenagem < SEM_VELOCIDADE) this.velocidadeAtual = SEM_VELOCIDADE;
        else this.velocidadeAtual = frenagem;
    }
    public void acelera(int acrescimo ){
        int velocidade = this.velocidadeAtual + acrescimo;
        if(velocidade > velocidadeMax) this.velocidadeAtual = velocidadeMax;
        else this.velocidadeAtual = velocidade;
    }
}
