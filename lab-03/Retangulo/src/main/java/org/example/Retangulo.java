package org.example;

public class Retangulo {

    private int largura;
    private int altura;
    private String codigo;


    public Retangulo(int largura, int altura, String codigo) {
        if(largura > 0 || altura > 0){
            this.largura =  largura;
            this.altura = altura;
        }else {
            this.largura = 4;
            this.altura = 3;
        }
        this.codigo = codigo;
    }

    public boolean setLargura(int largura) {
        if(largura >= 4){
            this.largura = largura;
            return true;
        }
        return false;
    }

    public boolean setAltura(int altura) {
        if(altura >= 3){
            this.altura = altura;
            return true;
        }
        return false;
    }

    public boolean setCodigo(String codigo) {
        if(codigo.equals("ASCII") || codigo.equals("UTF8")){
            this.codigo = codigo;
            return true;
        }
        return false;
    }

    public int getLargura() { return largura;}

    public int getAltura() { return altura; }

    public String getCodigo() { return codigo; }

    public int perimetro(){ return 2*(this.altura * this.largura); }


    @Override
    public String toString() {
        String esqSup = (this.codigo.equals("ASCII") ? "+": "\u250c");
        String esqInf = (this.codigo.equals("ASCII") ? "+": "\u2514");
        String dirSup = (this.codigo.equals("ASCII") ? "+": "\u2510");
        String dirInf = (this.codigo.equals("ASCII") ? "+": "\u2518");
        String horiz = (this.codigo.equals("ASCII") ? "-": "\u2500");
        String vert = (this.codigo.equals("ASCII") ? "|": "\u2502");
        StringBuilder retangulo = new StringBuilder();
        retangulo.append(esqSup).append(horiz.repeat(this.largura-2)).append(dirSup).append("\n");
        String miolo = vert + " ".repeat(this.largura-2) + vert + "\n";
        retangulo.append(miolo.repeat(this.altura-2));
        retangulo.append(esqInf).append(horiz.repeat(this.largura-2)).append(dirInf).append("\n");
        return retangulo.toString();
    }
}
