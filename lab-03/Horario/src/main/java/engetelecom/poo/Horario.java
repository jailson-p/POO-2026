package engetelecom.poo;

public class Horario {
    private int hora,
                minuto,
                segundo;

    public Horario(int hor, int min, int seg){
        if(!(this.setHora(hor) && this.setMinuto(min) && this.setSegundo(seg))){
            this.hora = this.minuto = this.segundo = 0;
        }
    }
    public Horario(int hor)             { this(hor,0,0); }
    public Horario(int hora, int min)   { this(hora,min,0);}

    public boolean setHora(int hor){
        if(hor >= 0 && hor < 24) {
            this.hora = hor;
            return true;
        }
        return false;
    }
    public boolean setMinuto(int min){
        if(min >= 0 && min < 60) {
            this.minuto = min;
            return true;
        }
        return false;
    }
    public boolean setSegundo(int seg){
        if(seg >= 0 && seg < 60) {
            this.segundo = seg;
            return true;
        }
        return false;
    }

    public StringBuilder porExtenso(){

    }
    private String conversaoExtenso(int tempo){
        String textoNum = new String(String.format("%02d",tempo)) ;
        switch (textoNum.charAt(0)){
            case '0': return "zero";
            case

        }

    }


    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hora,this.minuto,this.segundo);
    }
}
