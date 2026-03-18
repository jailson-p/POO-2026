package engetelecom.poo;

public class Horario {

    private  int    hora,
                    min,
                    seg;

    public void setHorario(int h, int m, int s){
        if(h > 23 || m > 59 || s > 59) return;
        this.hora   = h;
        this.min    = m;
        this.seg    = s;
    }
    public void setHora(int h, int m){
        this.setHorario(h, m, 0);
    }
    public void setHora(int h){
        this.setHorario(h, 0 ,0);
    }


    @Override
    public String toString() {
        return  String.format("%02d:%02d:%02d",hora,min,seg );
    }
}
