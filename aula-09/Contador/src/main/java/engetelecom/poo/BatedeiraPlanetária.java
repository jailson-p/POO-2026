package engetelecom.poo;

public class BatedeiraPlanetária {

    private boolean ligada = false;
    private boolean posicaoBracoBaixo = false;
    private String[] ferramenta = new String[4];
    private String ferramentaAtual ;
    private int velocidade;



    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void setPosicaoBracoBaixo(boolean posicaoBracoBaixo) {
        this.posicaoBracoBaixo = posicaoBracoBaixo;
    }

    public void setFerramentas(String[] ferramenta) {
        this.ferramenta = ferramenta;
    }
    public void setFerramentaAtual(String ferramenta){
        this.ferramentaAtual = new String(ferramenta);
    }


    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isLigada() {
        return ligada;
    }

    public boolean isPosicaoBracoBaixo() {
        return posicaoBracoBaixo;
    }

    public String[] getFerramenta() {
        return ferramenta;
    }
    public String getFerramentaAtual(){
        return this.ferramentaAtual;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
