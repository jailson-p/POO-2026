package engetelecom.poo;

public class Hero {

    private String name;    //nome do personagem
    private String race;    //Raça
    private int magia;      //nível mágico
    private int velocidadeMovimento;
    private int nivelVida;
    private int nivelMana = 100;


    public void setNome(String nome){
        this.name = nome;
    }
    public void setRace(String race){
        this.race = race;
    }
    public void setMagia(int magia)  { this.magia = magia;}
    public void setVelocidadeMovimento(int velocidadeMovimento) {this.velocidadeMovimento = velocidadeMovimento;}
    public void setNivelVida(int nivelVida) { this.nivelVida = nivelVida; }
    //public void setNivelMana(int nivelMana) { this.nivelMana = nivelMana; }


    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getMagia() {
        return magia;
    }

    public int getVelocidadeMovimento() {
        return velocidadeMovimento;
    }

    public int getNivelVida() {
        return nivelVida;
    }

    public int getNivelMana() {
        return nivelMana;
    }

//    public boolean consumirMagia(){
//        int desconto = 2*this.magia/100;
//        if(desconto >= this.nivelMana){
//            this.nivelMana -= desconto;
//            return true;
//        }else return false;
//    }
//    public boolean consumirVida(int dano){
//        if(dano > this.nivelVida ){
//            this.nivelVida -= dano;
//            return true;
//        }else {
//            this.nivelVida = 0;
//            return false;
//        }
//    }



}
